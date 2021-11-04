<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: ye112
  Date: 2021/10/2
  Time: 11:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<s:fielderror/>
<form action="user_login.action" method="post">
    <div>
        <label>用户名11：</label>
        <input type="text" name="userName">
        <font color="red"><s:fielderror fieldName="userName"/></font>
    </div>
    <div>
        <label>密码11：</label>
        <input type="password" name="password">
        <font color="red"><s:fielderror fieldName="password"/></font>
    </div>
    <div>
        <input type="submit" value="登录">
    </div>
</form>




<%--<form action="login.action" method="post">--%>
<%--    <div>--%>
<%--        <label>用户：</label>--%>
<%--        <input type="text" name="userName">--%>
<%--        <font color="red"><s:fielderror fieldName="userName"></s:fielderror></font>--%>
<%--    </div>--%>
<%--    <div>--%>
<%--        <label>密码：</label>--%>
<%--        <input type="password" name="password">--%>
<%--        <font color="red"><s:fielderror fieldName="password"></s:fielderror> </font>--%>
<%--    </div>--%>
<%--    <div>--%>
<%--        <input type="submit" value="登录">--%>
<%--    </div>--%>
<%--</form>--%>

</body>
</html>
