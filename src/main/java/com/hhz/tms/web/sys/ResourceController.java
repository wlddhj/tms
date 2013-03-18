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

import com.hhz.tms.entity.sys.Resource;
import com.hhz.tms.service.sys.ResourceService;
import com.hhz.tms.util.Constants;
import com.hhz.tms.util.JsonUtil;
import com.hhz.tms.util.WebUtil;

/**
 * @author huangjian
 * 
 */
@Controller
@RequestMapping(value = "/admin/resource")
public class ResourceController {
	@Autowired
	private ResourceService resourceService;

	@RequestMapping(value = "")
	public String index(Model model) {
		model.addAttribute("mapEnableFlg", Constants.getMapEnableFlg());
		model.addAttribute("search_EQB_enableFlg", true);
		return "admin/sys/resource";
	}

	@RequestMapping(value = "list")
	public String list(@RequestParam(value = "page", defaultValue = "1") int pageNumber,
			@RequestParam(value = "rows", defaultValue = "10") int pageSize, HttpServletRequest request,
			HttpServletResponse response) {
		Map<String, Object> searchParams = Servlets.getParametersStartingWith(request, "search_");

		String sortField = request.getParameter("sort");
		String order = request.getParameter("order");

		// 设置默认排序方式
		if (StringUtils.isEmpty(sortField)) {
			sortField = "id";
			order = WebUtil.DESC;
		}
		PageRequest pageRequest = WebUtil.buildPageRequest(pageNumber, pageSize, sortField, order);
		Page<Resource> page = resourceService.findResourcePage(searchParams, pageRequest);

		JsonUtil.renderJson(response, page, new String[] { "appMenus", "appFunctions" });
		return null;

	}

	@RequestMapping(value = "delete/{id}")
	public String delete(@PathVariable("id") Long id,  HttpServletResponse response) {
		resourceService.deleteResource(id);
		JsonUtil.renderSuccess("保存成功", response);
		return null;
	}
	
	@RequestMapping(value = "saveBatch")
	public String saveBatch(HttpServletRequest request, HttpServletResponse response) {
		List<Resource> insertedRecords = (List<Resource>) JsonUtil.getInsertRecords(Resource.class, request);
		List<Resource> updatedRecords = (List<Resource>) JsonUtil.getUpdatedRecords(Resource.class, request);
		List<Resource> deletedRecords = (List<Resource>) JsonUtil.getDeletedRecords(Resource.class, request);
		resourceService.saveResources(insertedRecords, updatedRecords, deletedRecords);
		JsonUtil.renderSuccess("保存成功", response);
		return null;
	}

}
