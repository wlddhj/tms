package com.hhz.tms.dao.sys;

import com.hhz.tms.dao.BaseDao;
import com.hhz.tms.entity.sys.User;

public interface UserDao extends BaseDao<User> {
	User findByLoginName(String loginName);
}
