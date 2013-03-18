/**
 * 
 */
package com.hhz.tms.service;

import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.apache.shiro.config.Ini;
import org.apache.shiro.config.Ini.Section;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.beans.factory.annotation.Autowired;

import com.hhz.tms.entity.sys.Permission;
import com.hhz.tms.entity.sys.Resource;
import com.hhz.tms.service.sys.ResourceService;
import com.hhz.tms.util.CollectionUtil;

/**
 * @author huangjian
 * 
 */
public class ChainDefinitionSectionMetaSource implements FactoryBean<Ini.Section> {
	@Autowired
	private ResourceService resourceService;
	private String filterChainDefinitions;
	/**
	 * 默认premission字符串
	 */
	public static final String PREMISSION_STRING = "perms[{0}]";
	public static final String ROLE_STRING = "roles[{0}]";

	/**
	 * 通过filterChainDefinitions对默认的url过滤定义
	 */
	public void setFilterChainDefinitions(String filterChainDefinitions) {
		this.filterChainDefinitions = filterChainDefinitions;
	}

	@Override
	public Section getObject() throws Exception {
		// 获取所有Resource
		List<Resource> list = (List<Resource>) resourceService.findAll();

		Ini ini = new Ini();
		// 加载默认的url
		ini.load(filterChainDefinitions);
		Ini.Section section = ini.getSection(Ini.DEFAULT_SECTION_NAME);
		// 循环Resource的url,逐个添加到section中。section就是filterChainDefinitionMap,
		// 里面的键就是链接URL,值就是存在什么条件才能访问该链接
		for (Iterator<Resource> it = list.iterator(); it.hasNext();) {
			Resource resource = it.next();
			// 如果不为空值添加到section中
			List<String> perms = new ArrayList<String>();
			if (StringUtils.isNotEmpty(resource.getUrl())) {
				for (Permission permission : resource.getPermissions()) {
					perms.add(permission.getPermCd());
				}
			}
			String strPerms = CollectionUtil.array2String(perms);
			section.put(resource.getUrl(), MessageFormat.format(PREMISSION_STRING, strPerms));
		}

		return section;
	}

	@Override
	public Class<?> getObjectType() {
		// TODO Auto-generated method stub
		return this.getClass();
	}

	@Override
	public boolean isSingleton() {
		// TODO Auto-generated method stub
		return false;
	}

}
