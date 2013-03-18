<%@ page contentType="text/html;charset=UTF-8" %>
<%@ include file="/WEB-INF/layouts/taglib.jsp" %>
<!DOCTYPE html>
<html>
<head>
	<script>
		$(document).ready(function() {
			//为inputForm注册validate函数
			$("#inputForm").validate();
		});
	</script>
</head>

<body>
	<form id="inputForm" action="${ctx}/admin/menu/save" method="post" class="form-horizontal">
		<input type="hidden" name="id" value="${menu.id}"/>
		<input type="hidden" name="parent.id" value="${menu.parent.id}"/>
			<div class="control-group">
			</div>	
			<div class="control-group">
				<label for="menuName" class="control-label">菜单名称:</label>
				<div class="controls">
					<input type="text" id="menuName" name="menuName"  value="${menu.menuName}" class="input-large required" minlength="3"/>
				</div>
			</div>	
			<div class="control-group">
				<label for="url" class="control-label">url:</label>
				<div class="controls">
					<input type="text" id="url" name="url"  value="${menu.url}" class="input-large"/>
				</div>
			</div>	
			<div class="control-group">
				<label for="description" class="control-label">备注:</label>
				<div class="controls">
					<textarea id="remark" name="remark" class="input-large">${menu.remark}</textarea>
				</div>
			</div>
			<div class="control-group">
				<label for="enableFlg" class="control-label"></label>
				<label class="checkbox">
              	<form:checkbox path="menu.enableFlg" name="enableFlg" id="enableFlg"/>是否有效
              	
            </label>
			</div>
			<div class="form-actions">
				<input id="submit_btn" class="btn btn-primary" type="button" onclick="save();" value="提交"/>&nbsp;	
				<input id="cancel_btn" class="btn" type="reset" value="取消"/>
			</div>
	</form>
</body>
</html>