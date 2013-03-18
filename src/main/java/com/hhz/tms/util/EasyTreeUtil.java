/**
 * 
 */
package com.hhz.tms.util;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.hhz.tms.entity.sys.Menu;

/**
 * @author jianhuang
 * 
 */
public class EasyTreeUtil {
	private static EasyTreeNode getRoot(String name) {
		EasyTreeNode root = new EasyTreeNode();
		root.setId("0");
		root.setText(name);
		root.setState(EasyTreeNode.STATE_OPEN);
		return root;
	}

	public static EasyTreeNode getMenuTree(List<Menu> menus) {
		EasyTreeNode root = getRoot("All Menus");
		Map<Long, EasyTreeNode> mapId2Vo = new HashMap<Long, EasyTreeNode>();
		for (Menu menu : menus) {
			EasyTreeNode resultVo = new EasyTreeNode();
			resultVo.setText(menu.getMenuName());
			resultVo.setState(EasyTreeNode.STATE_OPEN);
			resultVo.setId(String.valueOf(menu.getId()));
			resultVo.addAttr("url", menu.getUrl());
			resultVo.addAttr("remark", menu.getRemark());
			resultVo.addAttr("parentId", menu.getParent() == null ? "" : menu.getParent().getId());
			mapId2Vo.put(menu.getId(), resultVo);
		}

		for (Menu menu : menus) {
			EasyTreeNode resultVo = mapId2Vo.get(menu.getId());
			if (menu.getParent() == null) {
				root.getChildren().add(resultVo);
			} else {
				EasyTreeNode parentVo = mapId2Vo.get(menu.getParent().getId());
				parentVo.getChildren().add(resultVo);
				parentVo.setState(EasyTreeNode.STATE_CLOSED);
			}
		}
		for (EasyTreeNode node : root.getChildren()) {
			node.setState(EasyTreeNode.STATE_OPEN);
		}
		return root;
	}

}
