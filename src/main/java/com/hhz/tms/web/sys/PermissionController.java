/**
 * 
 */
package com.hhz.tms.web.sys;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springside.modules.web.Servlets;

import com.hhz.tms.entity.sys.Permission;
import com.hhz.tms.entity.sys.Role;
import com.hhz.tms.service.BaseService;
import com.hhz.tms.service.sys.PermissionService;
import com.hhz.tms.util.JsonUtil;
import com.hhz.tms.util.WebUtil;
import com.hhz.tms.web.SingleCrudControll;

/**
 * @author huangjian
 * 
 */
@Controller
@RequestMapping(value = "/admin/permission")
public class PermissionController extends SingleCrudControll<Permission>{
	@Autowired
	private PermissionService permissionService;

	@RequestMapping(value = "")
	public String index(Model model) {
		return "admin/sys/permission";
	}

	@Override
	public BaseService<Permission> getService() {
		// TODO Auto-generated method stub
		return permissionService;
	}

}
