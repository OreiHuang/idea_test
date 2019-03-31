<%--
  Created by IntelliJ IDEA.
  User: mnelg
  Date: 2019/3/30
  Time: 23:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>添加用户</title>
</head>
<body>
    <form action="/user/addUser" method="post">
        姓名：<input type="text" name="name"/><br/>
        生日：<input type="text" name="address"/><br/>
        <input type="submit" value="ok">
    </form>
</body>
</html>
