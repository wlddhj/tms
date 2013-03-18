/**
 * 
 */
package com.hhz.tms.dao.sys;

import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.PagingAndSortingRepository;

import com.hhz.tms.entity.sys.Role;

/**
 * @author huangjian
 * 
 */
public interface RoleDao extends PagingAndSortingRepository<Role, Long>, JpaSpecificationExecutor<Role>{
}
