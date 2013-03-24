/**
 * 
 */
package com.hhz.tms.service.sys;

import java.util.Iterator;
import java.util.List;

import org.apache.commons.lang3.ArrayUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.hhz.tms.dao.BaseDao;
import com.hhz.tms.dao.sys.PermissionDao;
import com.hhz.tms.dao.sys.RoleDao;
import com.hhz.tms.entity.sys.Permission;
import com.hhz.tms.entity.sys.Role;
import com.hhz.tms.service.BaseService;

/**
 * @author huangjian
 *
 */
@Component
//默认将类中的所有public函数纳入事务管理.
@Transactional(readOnly = true)
public class RoleService  extends BaseService<Role>{
	@Autowired
	private RoleDao roleDao;
	@Autowired
	private PermissionDao permissionDao;
	@Override
	public BaseDao<Role> getBaseDao() {
		// TODO Auto-generated method stub
		return roleDao;
	}

	@Override
	public Class<Role> getEntityClazz() {
		// TODO Auto-generated method stub
		return Role.class;
	}
	
	/** 保存资源-权限关联关系 */
	@Transactional(readOnly = false)
	public void savePerms(Long id, String permids) {
		String[] ids = permids.split(",");
		Role role = getEntity(id);
		// 删除不存在的记录
		List<Permission> permissions = role.getPermissions();
		for (Iterator<Permission> it = permissions.iterator(); it.hasNext();) {
			Permission permission = it.next();
			if (!ArrayUtils.contains(ids, String.valueOf(permission.getId()))) {
				// 删除不存在的记录
				it.remove();
			} else {
				// 已有的记录不动
				ids = ArrayUtils.removeElement(ids, String.valueOf(permission.getId()));
			}
		}
		// 新增新记录
		for (String strId : ids) {
			if (StringUtils.isNotBlank(strId)) {
				Long id_new = Long.valueOf(strId);
				if (id_new > 0) {
					Permission permission = permissionDao.findOne(id_new);
					permission.setId(id_new);
					role.getPermissions().add(permission);
				}
			}
		}
		roleDao.save(role);
	}
}
