<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="/WEB-INF/jsp/include/taglib.jsp" %>
<div id="actBusFields">
    <div class="row">
        <div class="form-group col-sm-6 col-md-5 ">
            <label class="col-sm-3 control-label no-padding-right">编号:</label>
            <div class="col-sm-9">
            <span class="col-xs-11 block input-icon input-icon-right">
                <input id="code" name="code" type="text"  class="form-control" value="${bx.code}" readonly/>
            </span>
            </div>
        </div>
        <div class="form-group col-sm-6 col-md-5 ">
            <label class="col-sm-3 control-label no-padding-right">项目事由:</label>
            <div class="col-sm-9">
                <span class="col-xs-11 block input-icon input-icon-right">
                    <input id="title" name="title" type="text"  class="form-control" value="${bx.title}" readonly/>
                </span>
            </div>
        </div>
    </div>
    <div class="row">
        <div class="form-group col-sm-6 col-md-5 ">
            <label class="col-sm-3 control-label no-padding-right">办公费:</label>
            <div class="col-sm-9">
            <span class="col-xs-11 block input-icon input-icon-right">
                <input id="bgf" name="bgf" type="text"  class="form-control" value="${bx.bgf}" readonly/>
            </span>
            </div>
        </div>
        <div class="form-group col-sm-6 col-md-5 ">
            <label class="col-sm-3 control-label no-padding-right">材料费:</label>
            <div class="col-sm-9">
            <span class="col-xs-11 block input-icon input-icon-right">
                <input id="clf" name="clf" type="text"  class="form-control" value="${bx.clf}" readonly/>
            </span>
            </div>
        </div>
    </div>
    <div class="row">
        <div class="form-group col-sm-6 col-md-5 ">
            <label class="col-sm-3 control-label no-padding-right">其它说明:</label>
            <div class="col-sm-9">
            <span class="col-xs-11 block input-icon input-icon-right">
                <textarea id="baoxiaowhy" name="baoxiaowhy" class="form-control" readonly>${bx.baoxiaowhy}</textarea>
            </span>
            </div>
        </div>
        <div class="form-group col-sm-6 col-md-5 ">
            <label class="col-sm-3 control-label no-padding-right">票据:</label>
            <div class="col-sm-9">
            <span class="col-xs-11 block input-icon input-icon-right">
                <%--<input id="fp" name="fp" type="text"  class="form-control" value="${bx.fp}" readonly/>--%>
                <a href="#" onclick="showFp()">查看</a>
                <script>
                    function showFp() {
                        var url="${webRoot}/demo/probx/showfp?fp=${bx.code}";
                        //弹框层
                        layer.open({
                            scrollbar: false,
                            type: 2,
                            title : ["票据查看" , true],
                            area: ['85%', '85%'], //宽高
                            content: [url,'yes'],
                            shadeClose : false,
                        });
                    }
                </script>
            </span>
            </div>
        </div>
    </div>
</div>
<c:if test="${flag == 2}">
    <%@include file="../activiti/processComSub.jsp"%>
</c:if>

