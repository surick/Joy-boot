<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <title>记录</title>
    <%@include file="/common/commonJS.jsp" %>
</head>
<body>
<form id="search-from" action="${webRoot}/demo/sum/recordList">
    <input type="text" name="modelName" value="<%=request.getParameter("modelName")%>">
</form>
<script>
    $("#search-from").submit();
</script>
</body>
</html>