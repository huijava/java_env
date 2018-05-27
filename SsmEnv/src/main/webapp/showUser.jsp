<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>用户信息查询</title>
    <script type="text/javascript" src="static/js/jquery.min.js"></script>
    <script type="text/javascript">
        $(document).ready(function () {
            //监听表单事件
            $("#subFrom").submit(function () {
                var id = $("#id").val();
                if (id == "") {
                    alert("id不能为空!");
                    return false;
                }
            })

        })
    </script>
</head>
<body>
    <h1>查询用户信息</h1>
    <form id="subFrom" action="getUser.htm" method="post">
        <table border="1" width="50%" style="text-align: center;">
            <tr>
                <td>用户id</td>
                <td><input type="text" id="id" name="id"></td>
            </tr>
            <tr>
                <td colspan="2"><input type="submit" value="提交"></td>
            </tr>
        </table>
    </form>
</body>
</html>