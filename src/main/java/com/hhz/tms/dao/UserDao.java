package com.hhz.tms.dao;

import org.springframework.data.repository.PagingAndSortingRepository;
import com.hhz.tms.entity.User;

public interface UserDao extends PagingAndSortingRepository<User, Long> {
	User findByLoginName(String loginName);
}
