<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <title>项目报销</title>
    <%@include file="/common/commonCSS.jsp" %>
    <%@include file="/common/commonJS.jsp" %>
    <%@include file="/WEB-INF/jsp/include/taglib.jsp" %>
</head>

<body>
<div class="main-container" id="main-container">
    <div class="row" style="margin-top: 20px;">
        <div class="col-md-12">
            <form class="layui-form" id="search-from" action="${webRoot}/demo/baoxiao/list">
                <div class="layui-form-item">
                    <label class="layui-form-label" style="width:10%;">出差事由:</label>
                    <div class="layui-input-inline">
                        <input type="text" name="title" value="${baoxiao.title}" class="layui-input" >
                    </div>
                    <button class="layui-btn" id="searchSubmit"><i class="layui-icon">&#xe615;</i>搜 索</button>
                    <button class="layui-btn layui-btn-warm" type="button" id="refresh">重 置</button>
                    <a class="layui-btn" href="${webRoot}/demo/baoxiao/info"><i class="layui-icon">&#xe61f;</i> 新 增</a>
                </div>
            </form>
        </div>
    </div>
    <div class="row">
        <div class="col-sm-12">
            <table id="table-list" class="layui-table">
                <thead>
                <tr>
                    <th>序号</th>
                    <th>出差事由</th>
                    <th>报销人</th>
                    <th>差旅费</th>
                    <th>补贴</th>
                    <th>起讫地点</th>
                    <th>审批结果</th>
                    <th>流程状态</th>
                    <th>创建时间</th>
                    <th>操作</th>
                </tr>
                </thead>
                <tbody>
                <c:forEach items="${page.result}" var="baoxiao" varStatus="i">
                    <tr id="leave_${baoxiao.id }">
                        <td>${i.index+1 }</td>
                        <td>${baoxiao.title}</td>
                        <td>${baoxiao.baoxiaoUser}</td>
                        <td>${baoxiao.money}</td>
                        <td>${baoxiao.bt}</td>
                        <td>${baoxiao.baoxiaowhy}</td>
                        <td>${fns:getCodeName("act_result",baoxiao.actResult)}</td>
                        <td>${fns:getCodeName("act_process_status",baoxiao.status)}</td>
                        <td><fmt:formatDate value="${baoxiao.createTime}" pattern="yyyy-MM-dd HH:mm"/></td>
                        <td>
                            <div class=" btn-group ">
                                <c:if test="${baoxiao.status == 1}">
                                    <a class="layui-btn layui-btn-small" href="${webRoot}/demo/baoxiao/info?id=${baoxiao.id}" >编辑</a>
                                    <button class="layui-btn layui-btn-small" type="button" onclick="flowSumbit('baoxiao','${baoxiao.id}')">提交</button>
                                    <button class="layui-btn layui-btn-danger layui-btn-small" type="button" onclick="deleteById('${baoxiao.id}')">删除</button>
                                </c:if>
                                <c:if test="${(baoxiao.status == 2 || baoxiao.status == 3) && baoxiao.actResult !=2}">
                                    <button class="layui-btn layui-btn-small" type="button" onclick="doTaskTab('baoxiao','${baoxiao.id}','${baoxiao.instanceId}')">记录</button>
                                    <button class="layui-btn layui-btn-small layui-btn-warm" type="button" onclick="showFlowImg('${baoxiao.instanceId}')">查看</button>
                                </c:if>
                                <c:if test="${(baoxiao.status == 2 || baoxiao.status == 3) && baoxiao.actResult == 2}">
                                    <a class="layui-btn layui-btn-small" href="${webRoot}/demo/baoxiao/info?id=${baoxiao.id}" >编辑</a>
                                    <button class="layui-btn layui-btn-small" type="button" onclick="flowSumbit('baoxiao','${baoxiao.id}')">提交</button>
                                    <button class="layui-btn layui-btn-small" type="button" onclick="doTaskTab('baoxiao','${baoxiao.id}','${baoxiao.instanceId}')">记录</button>
                                    <button class="layui-btn layui-btn-small layui-btn-warm" type="button" onclick="showFlowImg('${baoxiao.instanceId}')">查看</button>
                                </c:if>
                            </div>
                        </td>
                    </tr>
                </c:forEach>
                </tbody>
            </table>
            <sys:page page="${page}"></sys:page>
        </div>
    </div>
</div>
</body>
<script src="${webRoot}/js/activiti/actSumbit.js"></script>
<script>
    function deleteById(id) {
        var url ="${webRoot}/demo/baoxiao/delete";
        confirm('确定要删除选中的记录？', function(){
            $.post(url,"id="+id,function (r) {
                if(r.code=='0'){
                    toast(r.msg);
                    $("#leave_"+id+"").remove();
                }else {
                    alertMsg(r.msg);
                }
            });
        });
    }
</script>

</html>