/**
 * 
 */
package com.hhz.tms.util;

import org.apache.shiro.SecurityUtils;

import com.hhz.tms.service.account.ShiroDbRealm.ShiroUser;

/**
 * @author huangjian
 *
 */
public class ShiroUtil {
	
	/**
	 * 取出Shiro中的当前用户Id.
	 */
	public static Long getCurrentUserId() {
		ShiroUser user = (ShiroUser) SecurityUtils.getSubject().getPrincipal();
		return user.id;
	}
	
	/**
	 * 更新Shiro中当前用户的用户名.
	 */
	public static void updateCurrentUserName(String userName) {
		ShiroUser user = (ShiroUser) SecurityUtils.getSubject().getPrincipal();
		user.name = userName;
	}
}
