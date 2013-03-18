package org.apache.jsp.WEB_002dINF.views.admin.sys;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class menu_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(2);
    _jspx_dependants.add("/WEB-INF/layouts/taglib.jsp");
    _jspx_dependants.add("/WEB-INF/layouts/admin/header.jsp");
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.release();
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write('\n');
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      if (_jspx_meth_c_005fset_005f0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("\t<title>菜单管理</title>\n");
      out.write("\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html;charset=utf-8\" />\n");
      out.write("<meta http-equiv=\"Cache-Control\" content=\"no-store\" />\n");
      out.write("<meta http-equiv=\"Pragma\" content=\"no-cache\" />\n");
      out.write("<meta http-equiv=\"Expires\" content=\"0\" />\n");
      out.write("<link href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/static/bootstrap/2.2.2/css/bootstrap.min.css\" type=\"text/css\" rel=\"stylesheet\" />\n");
      out.write("<link href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/static/jquery-easyui/themes/gray/easyui.css\" rel=\"stylesheet\" type=\"text/css\" >\n");
      out.write("<link href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/static/jquery-easyui/themes/icon.css\" rel=\"stylesheet\" type=\"text/css\" >\n");
      out.write("<link href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/static/jquery-validation/1.10.0/validate.css\" type=\"text/css\" rel=\"stylesheet\" />\n");
      out.write("<link href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/static/css/default.css\" rel=\"stylesheet\" type=\"text/css\" >\n");
      out.write("<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/static/jquery/jquery-1.8.3.min.js\" type=\"text/javascript\"></script>\n");
      out.write("<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/static/jquery-validation/1.10.0/jquery.validate.min.js\" type=\"text/javascript\"></script>\n");
      out.write("<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/static/jquery-validation/1.10.0/messages_bs_zh.js\" type=\"text/javascript\"></script>\n");
      out.write("<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/static/jquery-easyui/jquery.easyui.min.js\" type=\"text/javascript\"></script>\n");
      out.write("<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/static/js/ConvertUtil.js\" type=\"text/javascript\"></script>\n");
      out.write("<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/static/bootstrap/2.2.2/js/bootstrap.min.js\" type=\"text/javascript\"></script>");
      out.write("\n");
      out.write("</head>\n");
      out.write("<body class=\"easyui-layout\" >\n");
      out.write("<div data-options=\"region:'north'\" style=\"height:30px;overflow:hidden;\" border=\"false\">\n");
      out.write("</div>\n");
      out.write("\t<div data-options=\"region:'west',split:true\"  style=\"width:160px;\">\n");
      out.write("\t  \t<ul id=\"tt\">\n");
      out.write("\t  \t</ul>\n");
      out.write("\t</div>\n");
      out.write("\t<div data-options=\"region:'center'\">\n");
      out.write("\t\t<div class=\"easyui-layout\" style=\"width:100%;height:100%;\">\n");
      out.write("\t       \t<div region=\"center\" border=\"false\" id=\"divRightContent\">\n");
      out.write("\t       \t\n");
      out.write("\t       \t</div>\n");
      out.write("\t    </div>\n");
      out.write("\t</div>\n");
      out.write("\t<div id=\"mm\" class=\"easyui-menu\" style=\"width:120px;\">  \n");
      out.write("        <div onclick=\"append()\" data-options=\"iconCls:'icon-add'\">新建</div>  \n");
      out.write("        <div id=\"mm_remove\" onclick=\"remove()\" data-options=\"iconCls:'icon-remove'\">删除</div>  \n");
      out.write("        <div class=\"menu-sep\"></div>  \n");
      out.write("        <div onclick=\"expand()\">Expand</div>  \n");
      out.write("        <div onclick=\"collapse()\">Collapse</div>  \n");
      out.write("    </div>\n");
      out.write("<script type=\"text/javascript\">\n");
      out.write("var lastSelectNodeId;\n");
      out.write("$(function(){\n");
      out.write("\t$(\"#tt\").tree({\n");
      out.write("\t\tcheckbox:false,\n");
      out.write("\t\tanimate:true,dnd:true,\n");
      out.write("\t\turl:\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/admin/menu/initTree\",\n");
      out.write("\t\tonSelect:function(node){\n");
      out.write("\t\t\tlastSelectNodeId=node.id;\n");
      out.write("\t\t\tvar parentId=node.attributes.parentId;\n");
      out.write("\t\t\tvar isLeaf=$(this).tree('isLeaf',node.target);\n");
      out.write("\t\t\tvar item = $('#mm').menu('findItem', '删除');\n");
      out.write("\t\t\tif (!isLeaf){\n");
      out.write("\t\t\t\t$('#mm').menu('disableItem', item.target);\n");
      out.write("\t\t\t}else{\n");
      out.write("\t\t\t\t$('#mm').menu('enableItem', item.target);\n");
      out.write("\t\t\t}\n");
      out.write("\t\t\tif (node.id !='0'){\n");
      out.write("\t\t\t\tloadEntity(node.id);\n");
      out.write("\t\t\t}\n");
      out.write("\t\t},\n");
      out.write("\t\tonLoadSuccess:function(node,data){\n");
      out.write("\t\t\tif (data!=''){\n");
      out.write("\t\t\t\tif(typeof (lastSelectNodeId) != \"undefined\" && lastSelectNodeId!=''){\n");
      out.write("\t\t\t\t\tvar lastNode=$(\"#tt\").tree('find',lastSelectNodeId);\n");
      out.write("\t\t\t\t\tif (lastNode!=undefined){\n");
      out.write("\t\t\t\t\t\tvar parentNode=$(\"#tt\").tree('getParent',lastNode.target)\n");
      out.write("\t\t\t\t\t\t$(\"#tt\").tree('expand',parentNode.target);\n");
      out.write("\t\t\t\t\t}\n");
      out.write("\t\t\t\t\t$(\"#tt\").tree('select',lastNode.target);\n");
      out.write("\t\t\t\t}\n");
      out.write("\t\t\t}\n");
      out.write("\t\t},\n");
      out.write("\t\tonDrop:function(target, source, point){\n");
      out.write("\t\t\tvar parentNode=$(\"#tt\").tree('getNode',target);\n");
      out.write("\t\t  \t$.post('");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/admin/menu/drag',{id:source.id,'parentId':parentNode.id},function(result){\n");
      out.write("\t\t\t  $('#tt').tree('reload');\n");
      out.write("\t\t\t});\n");
      out.write("\t\t},\n");
      out.write("\t\tonContextMenu: function(e,node){  \n");
      out.write("            e.preventDefault();  \n");
      out.write("            $(this).tree('select',node.target);  \n");
      out.write("            $('#mm').menu('show',{  \n");
      out.write("                left: e.pageX,  \n");
      out.write("                top: e.pageY  \n");
      out.write("            });  \n");
      out.write("        }\n");
      out.write("\t});\n");
      out.write("});\n");
      out.write("function loadEntity(id){\n");
      out.write("\t$.get('");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/admin/menu/detail/'+id,function(result){\n");
      out.write("\t\t$(\"#divRightContent\").html(result);\n");
      out.write("\t});\n");
      out.write("}\n");
      out.write("function append(){\n");
      out.write("    var t = $('#tt');\n");
      out.write("    var node = t.tree('getSelected');\n");
      out.write("//     t.tree('append', {\n");
      out.write("//         parent: (node?node.target:null),  \n");
      out.write("//         data: [{\n");
      out.write("//             text: '新菜单'\n");
      out.write("//         }]  \n");
      out.write("//     });\n");
      out.write("    $.get('");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/admin/menu/create/'+node.id,function(result){\n");
      out.write("\t\t$(\"#divRightContent\").html(result);\n");
      out.write("\t});\n");
      out.write("}  \n");
      out.write("function remove(){  \n");
      out.write("    var node = $('#tt').tree('getSelected');\n");
      out.write("    $('#tt').tree('remove', node.target);\n");
      out.write("    lastSelectNodeId='';\n");
      out.write("    $.get('");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/admin/menu/delete/'+node.id,function(result){\n");
      out.write("    \t$(\"#divRightContent\").html('');\n");
      out.write("\t});\n");
      out.write("}\n");
      out.write("function collapse(){\n");
      out.write("    var node = $('#tt').tree('getSelected');\n");
      out.write("    $('#tt').tree('collapse',node.target);\n");
      out.write("}\n");
      out.write("function expand(){\n");
      out.write("    var node = $('#tt').tree('getSelected');\n");
      out.write("    $('#tt').tree('expand',node.target);\n");
      out.write("}\n");
      out.write("function save(){\n");
      out.write("\t$(\"#inputForm\").form('submit',{\n");
      out.write("\t\turl:'");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/admin/menu/save',\n");
      out.write("\t\tsuccess:function(result){\n");
      out.write("\t\t\tif(result.indexOf('success')!=-1){\n");
      out.write("\t\t\t\tvar id=result.substr(result.indexOf(\":\")+1);\n");
      out.write("\t\t\t\tlastSelectNodeId=id;\n");
      out.write("\t\t\t\t$(\"#tt\").tree('reload');\n");
      out.write("\t\t\t}else{\n");
      out.write("\t\t\t\talert(result);\n");
      out.write("\t\t\t}\n");
      out.write("\t\t}\n");
      out.write("\t});\n");
      out.write("}\n");
      out.write("</script>\n");
      out.write("</body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_c_005fset_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_005fset_005f0 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_005fset_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fset_005f0.setParent(null);
    // /WEB-INF/layouts/taglib.jsp(9,0) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fset_005f0.setVar("ctx");
    // /WEB-INF/layouts/taglib.jsp(9,0) name = value type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
    _jspx_th_c_005fset_005f0.setValue(new org.apache.jasper.el.JspValueExpression("/WEB-INF/layouts/taglib.jsp(9,0) '${pageContext.request.contextPath}'",_el_expressionfactory.createValueExpression(_jspx_page_context.getELContext(),"${pageContext.request.contextPath}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
    int _jspx_eval_c_005fset_005f0 = _jspx_th_c_005fset_005f0.doStartTag();
    if (_jspx_th_c_005fset_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.reuse(_jspx_th_c_005fset_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.reuse(_jspx_th_c_005fset_005f0);
    return false;
  }
}
