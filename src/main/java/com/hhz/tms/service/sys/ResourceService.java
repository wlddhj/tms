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

import com.hhz.tms.dao.sys.ResourceDao;
import com.hhz.tms.entity.sys.Resource;
import com.hhz.tms.util.WebUtil;

/**
 * @author huangjian
 * 
 */
// Spring Bean的标识.
@Component
// 默认将类中的所有public函数纳入事务管理.
@Transactional(readOnly = true)
public class ResourceService {
	@Autowired
	private ResourceDao resourceDao;
	
	public List<Resource> findAll(){
		List<Resource> resources= (List<Resource>) resourceDao.findAll();
		return resources;
	}
	public Resource getResource(Long id) {
		return resourceDao.findOne(id);
	}

	@Transactional(readOnly = false)
	public void saveResource(Resource entity) {
		resourceDao.save(entity);
	}
	@Transactional(readOnly = false)
	public void saveResources(List<Resource> insertedRecords,List<Resource> updatedRecords,List<Resource> deletedRecords) {
		for (Resource resource : insertedRecords) {
			saveResource(resource);
		}
		for (Resource resource : updatedRecords) {
			saveResource(resource);
		}
		for (Resource resource : deletedRecords) {
			deleteResource(resource.getId());
		}
	}

	@Transactional(readOnly = false)
	public void deleteResource(Long id) {
		resourceDao.delete(id);
	}

	public Page<Resource> findResourcePage( Map<String, Object> searchParams,PageRequest pageRequest) {
		Specification<Resource> spec = WebUtil.buildSpecification(searchParams,Resource.class);
		return resourceDao.findAll(spec,pageRequest);
	}

}
