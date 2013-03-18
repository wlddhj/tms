/**
 * 
 */
package com.hhz.tms.service.sys;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.hhz.tms.dao.sys.MenuDao;
import com.hhz.tms.entity.sys.Menu;
import com.hhz.tms.util.WebUtil;

/**
 * @author huangjian
 * 
 */
// Spring Bean的标识.
@Component
// 默认将类中的所有public函数纳入事务管理.
@Transactional(readOnly = true)
public class MenuService {
	@Autowired
	private MenuDao menuDao;

	public List<Menu> findAll() {
		List<Menu> resources = (List<Menu>) menuDao.findAll();
		return resources;
	}

	public Page<Menu> findPage(Map<String, Object> searchParams, PageRequest pageRequest) {
		Specification<Menu> spec = WebUtil.buildSpecification(searchParams, Menu.class);
		return menuDao.findAll(spec, pageRequest);
	}

	public Menu getMenu(Long id) {
		return menuDao.findOne(id);
	}

	@Transactional(readOnly = false)
	public void save(Menu entity) {
		if (entity.getParent()!=null && (entity.getParent().getId() == null || entity.getParent().getId() == 0)) {
			entity.setParent(null);
		}
		menuDao.save(entity);
	}

	@Transactional(readOnly = false)
	public void delete(Long id) {
		menuDao.delete(id);
	}

}
