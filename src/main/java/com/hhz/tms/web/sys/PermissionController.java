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
import com.hhz.tms.entity.sys.Resource;
import com.hhz.tms.service.sys.PermissionService;
import com.hhz.tms.util.JsonUtil;
import com.hhz.tms.util.WebUtil;

/**
 * @author huangjian
 * 
 */
@Controller
@RequestMapping(value = "/admin/permission")
public class PermissionController {
	@Autowired
	private PermissionService permissionService;

	@RequestMapping(value = "")
	public String index(Model model) {
		return "admin/sys/permission";
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
		Page<Permission> page = permissionService.findPage(searchParams, pageRequest);

		JsonUtil.renderJson(response, page);
		return null;

	}

	@RequestMapping(value = "delete/{id}")
	public String delete(@PathVariable("id") Long id, HttpServletResponse response) {
		permissionService.delete(id);
		JsonUtil.renderSuccess("保存成功", response);
		return null;
	}

	@RequestMapping(value = "saveBatch")
	public String saveBatch(HttpServletRequest request, HttpServletResponse response) {
		List<Permission> insertedRecords = JsonUtil.getInsertRecords(Permission.class, request);
		List<Permission> updatedRecords = JsonUtil.getUpdatedRecords(Permission.class, request);
		List<Permission> deletedRecords = JsonUtil.getDeletedRecords(Permission.class, request);
		permissionService.saveBatch(insertedRecords, updatedRecords, deletedRecords);
		JsonUtil.renderSuccess("保存成功", response);
		return null;
	}

}
