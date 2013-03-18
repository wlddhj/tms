/**
 * 
 */
package com.hhz.tms.web.sys;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.hhz.tms.entity.sys.Role;
import com.hhz.tms.service.BaseService;
import com.hhz.tms.service.sys.RoleService;
import com.hhz.tms.web.SingleCrudControll;

/**
 * @author huangjian
 * 
 */
@Controller
@RequestMapping(value = "/admin/role")
public class RoleController extends SingleCrudControll<Role>{
	@Autowired
	private RoleService roleService;

	@RequestMapping(value = "")
	public String index(Model model) {
		return "admin/sys/role";
	}

	@Override
	public BaseService<Role> getService() {
		// TODO Auto-generated method stub
		return roleService;
	}

}
