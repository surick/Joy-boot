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
    <form class="form-horizontal  bv-form" id="bxForm" action="${webRoot}/demo/baoxiao/edit" method="post" enctype="multipart/form-data">
        <div style="display: none">
            <input id="id" name="id"  value="${baoxiao.id}"/>
        </div>
        <div class="row">
            <div class="form-group col-xs-12 ">
                <label class="col-xs-3 control-label no-padding-right"><i class="red"> * </i>出差事由:</label>
                <div class="col-xs-9">
							<span class="col-xs-11 block input-icon input-icon-right">
								<input id="title" name="title" type="text" class="form-control" value="${baoxiao.title}"/>
							</span>
                </div>
            </div>
        </div>
        <div class="row">
            <div class="form-group col-xs-12 ">
                <label class="col-xs-3 control-label no-padding-right"><i class="red"> * </i>差旅费:</label>
                <div class="col-xs-9">
							<span class="col-xs-11 block input-icon input-icon-right">
								<input id="money" name="money" type="text" class="form-control" value="${baoxiao.money}"/>
							</span>
                </div>
            </div>
        </div>
        <div class="row">
            <div class="form-group col-xs-12 ">
                <label class="col-xs-3 control-label no-padding-right"><i class="red"> * </i>补贴:</label>
                <div class="col-xs-9">
							<span class="col-xs-11 block input-icon input-icon-right">
								<input id="bt" name="bt" type="text" class="form-control" value="${baoxiao.bt}"/>
							</span>
                </div>
            </div>
        </div>
        <div class="row">
            <div class="form-group col-xs-12">
                <label class="col-xs-3 control-label no-padding-right">起讫地点:</label>
                <div class="col-xs-9">
							<span class="col-xs-11 block input-icon input-icon-right">
								<textarea id="baoxiaowhy" name="baoxiaowhy" class="form-control" rows="3" placeholder="格式:3月6日 镇江-南通；3月7日 南通-镇江">${baoxiao.baoxiaowhy}</textarea>
							</span>
                </div>
            </div>
        </div>
        <div class="row">
            <div class="form-group col-xs-12 ">
                <label class="col-xs-3 control-label no-padding-right"><i class="red"> * </i>上传票据:</label>
                <div class="col-xs-9">
							<span class="col-xs-11 block input-icon input-icon-right">
								<input id="fp" name="fp" type="file" value="${baoxiao.fp}"/>
							</span>
                </div>
            </div>
        </div>
        <div class="row" style="margin-left: 40%;padding-bottom: 28px;margin-top: 25px;">
            <input class="layui-btn" type="submit" id="submitBtn"/>
            <a class="layui-btn layui-btn-normal" href="${webRoot}/demo/baoxiao/list">返 回</a>
        </div>
    </form>
</div>
</body>
<%--<script>
    //提交
    $("#submitBtn").click(function () {
        var url ="${webRoot}/demo/baoxiao/edit";
        //var form = $('#bxForm');
        var formData = new FormData($("#bxForm")[0]);
        $.ajax({
            type : "POST",
            url : url,
            data : formData,
            async: false,
            cache: false,
            contentType: false,
            processData: false,
            success : function (result) {
                if(result.code == '0'){
                    if($("#id").val() == ''){
                        alert(result,function () {
                            location.href='${webRoot}/demo/baoxiao/list';
                        },function () {
                            $("#submitBtn").reset();
                        });
                    }else {
                        toast(result.msg);
                        location.href='${webRoot}/demo/baoxiao/list';
                    }
                }else {
                    alertMsg(result.msg);
                }
            }
        });
    });
</script>--%>
</html>