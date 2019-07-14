<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page isELIgnored="false" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
</head>
<body>
<form action="user/savaUser" method="post">
    <p> 用户名：<input type="text" name="userName" value="" placeholder="用户名"></p>
    <p> 密码：<input type="password" name="password" value="" placeholder="密码"></p>
    <p> 真实姓名：<input type="text" name="name" value="" placeholder="真实姓名"></p>
    <p> 手机号<input type="tel" name="telephone" value="" placeholder="手机号"></p>
    <p> 入职日期：<input type="date" name="enterdate" value="" placeholder="入职日期"></p>
    <p> 用户角色：<input type="number" name="role" value="" placeholder="用户角色"></p>

    <input type="submit" name="" value="提交">


</form>
</body>
</html>
