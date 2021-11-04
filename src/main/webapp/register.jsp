<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: ye112
  Date: 2021/10/3
  Time: 19:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>用户注册</title>
</head>
<body>
<s:form action="#" method="post">
    <div>
        <label>用户名：</label>
        <s:textfield name="username"/>
    </div>
    <div>
        <label>密码：</label>
        <s:password name="password"/>
    </div>
    <div>
        <label>电话号码</label>
        <s:textfield name="phone"/>
    </div>
    <div>
        <s:submit value="注册"/>
    </div>
</s:form>

</body>
</html>
