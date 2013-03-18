/**
 * 
 */
package com.hhz.tms.dao.sys;

import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.PagingAndSortingRepository;

import com.hhz.tms.entity.sys.Menu;

/**
 * @author huangjian
 * 
 */
public interface MenuDao extends PagingAndSortingRepository<Menu, Long>, JpaSpecificationExecutor<Menu>{
}
