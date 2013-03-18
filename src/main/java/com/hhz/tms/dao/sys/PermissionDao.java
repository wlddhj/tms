/**
 * 
 */
package com.hhz.tms.dao.sys;

import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.PagingAndSortingRepository;

import com.hhz.tms.entity.sys.Permission;

/**
 * @author huangjian
 * 
 */
public interface PermissionDao extends PagingAndSortingRepository<Permission, Long>, JpaSpecificationExecutor<Permission>{
}
