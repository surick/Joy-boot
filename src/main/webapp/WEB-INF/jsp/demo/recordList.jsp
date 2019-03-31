<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <title>记录列表</title>
    <%@include file="/common/commonCSS.jsp" %>
    <%@include file="/common/commonJS.jsp" %>
    <%@include file="/WEB-INF/jsp/include/taglib.jsp" %>
</head>
<body>
<div class="main-container" id="main-container">
    <div class="main-content">
        <div class="row">
            <div class="col-sm-12">
                <table id="table-list" class="layui-table">
                    <thead>
                    <tr>
                        <th>序号</th>
                        <th>项目号</th>
                        <th>处理记录</th>
                        <th>业务号</th>
                        <th>报销类别</th>
                        <th>处理意见</th>
                        <th>报销人</th>
                        <th>办理人</th>
                      <%--  <th>报销理由</th>
                        <th>报销花费</th>--%>
                        <th>详情</th>
                    </tr>
                    </thead>
                </table>
                <table id="table" class="layui-table">
                    <tbody>
                    <c:forEach items="${page.result}" var="task" varStatus="i">
                        <tr name="task_${task.taskId }" id="change">
                            <td>${i.index+1 }</td>
                            <td>${task.xmh}</td>
                            <td>${task.taskName}</td>
                            <td>${task.code}</td>
                            <td>${task.busName}</td>
                            <td>${task.remark}</td>
                            <td>${task.startUserName}</td>
                            <td>${task.dealName}</td>
                           <%-- <td>${task.reason}</td>
                            <td>${task.cost}</td>--%>
                            <td>
                                <button class="layui-btn layui-btn-small" type="button" onclick="doTaskTab('${task.actKey}','${task.busId}','${task.instanceId}','${task.taskId}','${task.defId}','${task.nodeType}')"><i class="layui-icon">&#xe60a;</i>详情</button>
                            </td>
                        </tr>
                    </c:forEach>
                    </tbody>
                </table>
                <sys:page page="${page}"></sys:page>
            </div>
        </div>
    </div>
</div>
</body>

<script>
    /**
     * 查看流程信息
     */
    function doTaskTab(actKey,busId,instanceId,taskId,defid,nodeType) {
        var url="${webRoot}/act/deal/flowInfoTab?flag=1&actKey="+actKey+"&busId="+busId+"&instanceId="+instanceId+"&taskId="+taskId+"&defId="+defid+"&nodeType="+nodeType ;
        //弹框层
        layer.open({
            scrollbar: false,
            type: 2,
            title : ["详情" , true],
            area: ['100%', '100%'], //宽高
            content: [url,'yes'],
            shadeClose : false,
        });
    }

    window.onload=function() {
                        var tbl = document.getElementById("table"); // 先获取table
                        var rows = tbl.getElementsByTagName("tr"); // 获取里面的行tr
                        for(i=0;i<rows.length;i++) {  // 遍历里面的行
                                   var j = parseInt(i/3); // 以每3行为单位,j为：3次0，3次1，3次2 ...
                                   if(j%2==0){ // 再通过取模来设置每隔3行显示不同的两种颜色
                                         rows[i].style.backgroundColor="#fff";
                                       }else{
                                         rows[i].style.backgroundColor="#eeeeee";
                                       }
                            }
                 };

</script>

</html>