/**
 * 
 */
package com.hhz.tms.service.sys;

import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import org.springside.modules.security.utils.Digests;
import org.springside.modules.utils.DateProvider;
import org.springside.modules.utils.Encodes;

import com.hhz.tms.dao.sys.DeptDao;
import com.hhz.tms.dao.sys.UserDao;
import com.hhz.tms.entity.sys.Dept;
import com.hhz.tms.entity.sys.User;
import com.hhz.tms.service.account.AccountService;

/**
 * 用户管理
 * @author huangjian
 * 
 */
// Spring Bean的标识.
@Component
// 默认将类中的所有public函数纳入事务管理.
@Transactional(readOnly = true)
public class UserService {
	private static final int HASH_INTERATIONS = 1024;
	private static final int SALT_SIZE = 8;
	private static Logger logger = LoggerFactory.getLogger(UserService.class);
	@Autowired
	private UserDao userDao;
	@Autowired
	private DeptDao deptDao;
	
	public List<User> findAll() {
		Sort sort = new Sort(Direction.ASC, "dispOrderNo");
		List<User> users = (List<User>) userDao.findAll(sort);
		return users;
	}

	public User getEntity(Long id) {
		return userDao.findOne(id);
	}
	public User findUserByLoginName(String loginName) {
		return userDao.findByLoginName(loginName);
	}
	
	public boolean existDictTypeCd(String loginName, String loginNameOld) {
		long cnt = userDao.existLoginName(loginName, loginNameOld);
		if (cnt == 0) {
			return false;
		}
		return true;
	}
	
	@Transactional(readOnly = false)
	public User save(User user) {
		if (StringUtils.isNotBlank(user.getPlainPassword())) {
			entryptPassword(user);
		}
		if (user.getDept()!=null){
			Dept dept=deptDao.findOne(user.getDept().getId());
			user.setDept(dept);
		}
		return userDao.save(user);
	}

	@Transactional(readOnly = false)
	public void delete(Long id) {
		userDao.delete(id);
	}
	
	/**
	 * 设定安全的密码，生成随机的salt并经过1024次 sha-1 hash
	 */
	private void entryptPassword(User user) {
		byte[] salt = Digests.generateSalt(SALT_SIZE);
		user.setSalt(Encodes.encodeHex(salt));

		byte[] hashPassword = Digests.sha1(user.getPlainPassword().getBytes(), salt, HASH_INTERATIONS);
		user.setPassword(Encodes.encodeHex(hashPassword));
	}
}
