<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <title>报销详情</title>
    <%@include file="/common/commonCSS.jsp" %>
    <%@include file="/common/commonJS.jsp" %>
    <%@ include file="/WEB-INF/jsp/include/taglib.jsp"%>
</head>
<body >
<div class="main-container" id="main-container">
    <form class="form-horizontal  bv-form" id="bxForm" action="${webRoot}/demo/probx/edit" method="post" enctype="multipart/form-data">
        <div style="display: none">
            <input id="id" name="id"  value="${bx.id}"/>
        </div>
        <div class="row">
            <div class="form-group col-xs-12 ">
                <label class="col-xs-3 control-label no-padding-right"><i class="red"> * </i>项目事由:</label>
                <div class="col-xs-9">
							<span class="col-xs-11 block input-icon input-icon-right">
								<input id="title" name="title" type="text" class="form-control" value="${bx.title}"/>
							</span>
                </div>
            </div>
        </div>
        <div class="row">
            <div class="form-group col-xs-12 ">
                <label class="col-xs-3 control-label no-padding-right"><i class="red"> * </i>办公费:</label>
                <div class="col-xs-9">
							<span class="col-xs-11 block input-icon input-icon-right">
								<input id="money" name="money" type="text" class="form-control" value="${bx.money}"/>
							</span>
                </div>
            </div>
        </div>
        <div class="row">
            <div class="form-group col-xs-12 ">
                <label class="col-xs-3 control-label no-padding-right"><i class="red"> * </i>材料费:</label>
                <div class="col-xs-9">
							<span class="col-xs-11 block input-icon input-icon-right">
								<input id="bt" name="bt" type="text" class="form-control" value="${bx.bt}"/>
							</span>
                </div>
            </div>
        </div>
        <div class="row">
            <div class="form-group col-xs-12">
                <label class="col-xs-3 control-label no-padding-right">其它:</label>
                <div class="col-xs-9">
							<span class="col-xs-11 block input-icon input-icon-right">
								<textarea id="baoxiaowhy" name="baoxiaowhy" class="form-control" rows="3" placeholder="格式:待定">${bx.baoxiaowhy}</textarea>
							</span>
                </div>
            </div>
        </div>
        <div class="row">
            <div class="form-group col-xs-12 ">
                <label class="col-xs-3 control-label no-padding-right"><i class="red"> * </i>上传票据:</label>
                <div class="col-xs-9">
							<span class="col-xs-11 block input-icon input-icon-right">
								<input id="fp" name="fp" type="file" value="${bx.fp}"/>
							</span>
                </div>
            </div>
        </div>
        <div class="row" style="margin-left: 40%;padding-bottom: 28px;margin-top: 25px;">
            <input class="layui-btn" type="submit" id="submitBtn"/>
            <a class="layui-btn layui-btn-normal" href="${webRoot}/demo/probx/list">返 回</a>
        </div>
    </form>
</div>
</body>
</html>