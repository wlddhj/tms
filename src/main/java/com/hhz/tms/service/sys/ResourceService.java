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

import com.hhz.tms.dao.BaseDao;
import com.hhz.tms.dao.sys.ResourceDao;
import com.hhz.tms.entity.IdEntity;
import com.hhz.tms.entity.sys.Resource;
import com.hhz.tms.service.BaseService;
import com.hhz.tms.util.WebUtil;

/**
 * @author huangjian
 * 
 */
// Spring Bean的标识.
@Component
// 默认将类中的所有public函数纳入事务管理.
@Transactional(readOnly = true)
public class ResourceService extends BaseService<Resource>{
	@Autowired
	private ResourceDao resourceDao;

	@Override
	public BaseDao<Resource> getBaseDao() {
		// TODO Auto-generated method stub
		return resourceDao;
	}
	@Override
	public Class<Resource> getEntityClazz() {
		// TODO Auto-generated method stub
		return Resource.class;
	}

}
