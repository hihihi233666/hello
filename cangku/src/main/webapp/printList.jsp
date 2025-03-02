<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
    <script>
        function Back() {
            window.location.href = "index.html";
        }
    </script>
</head>
<body>
<hr>
<table border="1" cellspacing="0" width="80%">
    <tr>

        <th>序号</th>
        <th>唯一编码</th>
        <th>电话</th>
        <th>管理员</th>
        <th>类</th>
        <th>位置</th>
        <th>库存</th>


    </tr>

    <c:forEach items="${cls}" var="CangKu" varStatus="status">
        <tr align="center">
            <td>${status.count}</td>
            <td>${CangKu.getNum()}</td>
            <td>${CangKu.getCall()}</td>
            <td>${CangKu.getManager()}</td>
            <td>${CangKu.getLei()}</td>
            <td>${CangKu.getPosition()}</td>
            <td>${CangKu.getStorage()}</td>

        </tr>

    </c:forEach>
</table>

</body>
</html>