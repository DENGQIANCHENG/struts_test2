<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: ye112
  Date: 2021/10/2
  Time: 17:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<table border="1" cellpadding="0" width="1000" align="center">
    <tr>
        <th>编号</th>
        <th>姓名</th>
        <th>性别</th>
        <th>电话</th>
    </tr>

    <s:iterator value="userList">
        <tr>
            <td><s:property value="id"/> </td>
            <td><s:property value="userName"/> </td>
            <td><s:property value="sex"/> </td>
            <td><s:property value="phone"/> </td>
        </tr>
    </s:iterator>

</table>
</body>
</html>
