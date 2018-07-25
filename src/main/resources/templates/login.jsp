<%@ page language="java" pageEncoding="utf-8" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>
<!DOCTYPE html>
<html>
<head>
    <base href="<%=basePath%>">
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
    <link rel="stylesheet" type="text/css" href="Public/easyUI/themes/bootstrap/easyui.css">
    <link rel="stylesheet" type="text/css" href="Public/easyUI/themes/icon.css">
    <link rel="stylesheet" type="text/css" href="Public/tpl/base/style.css">
</head>
<body>
Hello World
</body>
<script type="text/javascript" src="Public/easyUI/jquery.min.js"></script>
<script type="text/javascript" src="Public/easyUI/jquery.easyui.min.js"></script>
<script type="text/javascript">

</script>
</html>  