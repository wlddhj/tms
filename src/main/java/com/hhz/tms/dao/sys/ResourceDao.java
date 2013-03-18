/**
 * 
 */
package com.hhz.tms.dao.sys;

import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.PagingAndSortingRepository;

import com.hhz.tms.entity.sys.Resource;

/**
 * @author huangjian
 * 
 */
public interface ResourceDao extends PagingAndSortingRepository<Resource, Long>, JpaSpecificationExecutor<Resource>{
}
