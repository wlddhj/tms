/**
 * 
 */
package com.hhz.tms.web.sys;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.hhz.tms.entity.sys.Resource;
import com.hhz.tms.service.BaseService;
import com.hhz.tms.service.sys.ResourceService;
import com.hhz.tms.util.Constants;
import com.hhz.tms.web.SingleCrudControll;

/**
 * @author huangjian
 * 
 */
@Controller
@RequestMapping(value = "/admin/resource")
public class ResourceController extends SingleCrudControll<Resource> {
	@Autowired
	private ResourceService resourceService;

	@RequestMapping(value = "")
	public String index(Model model) {
		model.addAttribute("mapEnableFlg", Constants.getMapEnableFlg());
		model.addAttribute("search_EQB_enableFlg", true);
		return "admin/sys/resource";
	}

	@Override
	public BaseService<Resource> getService() {
		// TODO Auto-generated method stub
		return resourceService;
	}

}
