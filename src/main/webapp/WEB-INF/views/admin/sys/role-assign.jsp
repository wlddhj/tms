<%@ page contentType="text/html;charset=UTF-8" %>
<%@ include file="/WEB-INF/layouts/taglib.jsp" %>
<!DOCTYPE html>
<html>
<head>
	<title>角色分配</title>
<%@ include file="/WEB-INF/layouts/admin/header.jsp"%>
</head>
<body class="easyui-layout">
<div region="north" border="false">
</div>
<div region="west" border="false" style="width: 400px;">
<table id="tb" class="easyui-datagrid"
            data-options="fit:true,singleSelect:true,url:'${ctx}/admin/role/all'">  
        <thead>
            <tr>  
                <th data-options="field:'roleCd',width:180">角色代码</th>  
                <th data-options="field:'roleName',width:180">角色名称</th>  
            </tr>  
        </thead>
</table>
</div>
<div region="center" border="false">
	<div class="easyui-layout" fit="true">
		<div region="center" title="权限">
			<ul id="tree"></ul>
		</div>
		
		<div region="south" style="height: 40px;padding:5px;">
		<div>  
        <a href="#" class="easyui-linkbutton" data-options="iconCls:'icon-save'" onclick="save();">Save</a> 
		<a href="#" class="easyui-linkbutton" data-options="iconCls:'icon-reload'" onclick="refresh();">Refresh</a>  
		</div>
		</div>
	</div>
</div>
<script type="text/javascript">
var curRowId;
$(function(){
	$('#tb').datagrid({
		onClickRow:function(rowIndex, row){
			curRowId=row.id;
			loadPerm();
		}
	});
	$("#tree").tree({
		checkbox:true,
		onSelect:function(node){
			
		},
		onLoadSuccess:function(node,data){
			
		}
	});
});
function loadPerm(){
	$.post("${ctx}/admin/role/permission/"+curRowId,function(result) {
		$("#tree").tree('loadData',result);
	});
}
function save(){
	var nodes = $('#tree').tree('getChecked');
	var s = '';
	for(var i=0; i<nodes.length; i++){
		if (s != '') s += ',';
		s += nodes[i].id;
	}
	$.post("${ctx}/admin/role/savePerm/"+curRowId,{permids:s},function(result) {
		$("#tree").tree('loadData',result);
            $.messager.show({
                title:'Tip',
                msg:'保存成功',
                timeout:2000,
                showType:'show'
            });
	});
}
function refresh(){
	loadPerm();
}
</script>
</body>
</html>
