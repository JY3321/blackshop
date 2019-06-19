<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<html>
<head>
    <title>中国地质大学（北京）黑店</title>
    <link rel="icon" href="<%=basePath%>img/logo.jpg" type="image/x-icon"/>
    <META HTTP-EQUIV="Refresh" CONTENT="0;URL=<%=basePath%>goods/homeGoods">
</head>
<body>
</body>
</html>
