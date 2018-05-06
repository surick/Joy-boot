<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <title>经费统计</title>
    <%@include file="/common/commonCSS.jsp" %>
    <%@include file="/common/commonJS.jsp" %>
    <%@include file="/WEB-INF/jsp/include/taglib.jsp" %>
</head>
<body>
<div id="main-container">
    <div class="row" style="margin-top: 20px;">
        <form class="layui-form" id="search-from" action="${webRoot}/act/model/list">
            <div class="layui-form-item">
                <label class="layui-form-label" style="width:10%;">项目号：</label>
                <div class="layui-input-inline">
                    <input type="text" name="name" value="${model.name}"  placeholder="请输入项目号"  class="layui-input" >
                </div>
                <button class="layui-btn" id="searchSubmit"><i class="layui-icon">&#xe615;</i>查 询</button>
            </div>
        </form>
    </div>
    <div class="row">
        <div class="col-sm-12">
            <table id="table-list" class="layui-table">
                <thead>
                <tr>
                    <th>序号</th>
                    <th>项目号</th>
                    <th>业务</th>
                    <th>项目经费</th>
                    <th>已使用额度</th>
                    <th>剩余额度</th>
                    <th>是否部署</th>
                    <th>创建时间</th>
                </tr>
                </thead>
                <tbody>
                <c:forEach items="${page.result}" var="model" varStatus="i">
                    <tr name="model_${model.id }">
                        <td>${i.index+1 }</td>
                        <td>${model.name}</td>
                        <td>${model.businessName}</td>
                        <td>${model.maxmoney}</td>
                        <td>${model.costmoney}</td>
                        <td>${model.leftmoney}</td>
                        <td>${fns:getCodeName("YES_NO",model.status)}</td>
                        <td><fmt:formatDate value="${model.createTime}" pattern="yyyy-MM-dd"/></td>
                    </tr>
                </c:forEach>
                </tbody>
            </table>
            <sys:page page="${page}"></sys:page>
        </div>
    </div>
</div>
</body>
</html>