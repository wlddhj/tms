/**
 * 
 */
package com.hhz.tms.util;

import org.apache.shiro.SecurityUtils;
import org.springframework.beans.factory.annotation.Autowired;

import com.hhz.tms.entity.sys.User;
import com.hhz.tms.service.sys.UserService;

/**
 * @author huangjian
 *
 */
public class ShiroUtil {
	private static UserService userService =SpringContextHolder.getBean("userService");
	/**
	 * 取出Shiro中的当前用户Id.
	 */
	public static Long getCurrentUserId() {
		String loginName = (String) SecurityUtils.getSubject().getPrincipal();
		User user = userService.findUserByLoginName(loginName);
		return user.getId();
	}
	
	/**
	 * 更新Shiro中当前用户的用户名.
	 */
	public static void updateCurrentUserName(String userName) {
		String loginName = (String)SecurityUtils.getSubject().getPrincipal();
		loginName = userName;
	}
}
