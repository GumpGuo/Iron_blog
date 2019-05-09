<%--
  Created by IntelliJ IDEA.
  User: 98231
  Date: 2019/1/14
  Time: 21:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" import="java.util.*" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head lang="en">
    <meta charset="UTF-8">
    <title>Login Page | Amaze UI Example</title>
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="format-detection" content="telephone=no">
    <meta name="renderer" content="webkit">
    <meta http-equiv="Cache-Control" content="no-siteapp" />
    <link rel="alternate icon" type="image/png" href="${pageContext.request.contextPath}/assets/i/favicon.png">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/assets/css/amazeui.min.css"/>
    <style>
        .header {
            text-align: center;
        }
        .header h1 {
            font-size: 200%;
            color: #333;
            margin-top: 30px;
        }
        .header p {
            font-size: 14px;
        }
    </style>
</head>
<body>
<div class="header">
    <div class="am-g">
        <h1>Web ide</h1>
        <p>Integrated Development Environment<br/>代码编辑，代码生成，界面设计，调试，编译</p>
    </div>
    <hr />
</div>
<div class="am-g">
    <div class="am-u-lg-6 am-u-md-8 am-u-sm-centered">
        <h3>登录</h3>
        <hr>
        <div class="am-btn-group">
            <a href="#" class="am-btn am-btn-secondary am-btn-sm"><i class="am-icon-github am-icon-sm"></i> Github</a>
            <a href="#" class="am-btn am-btn-success am-btn-sm"><i class="am-icon-google-plus-square am-icon-sm"></i> Google+</a>
            <a href="#" class="am-btn am-btn-primary am-btn-sm"><i class="am-icon-stack-overflow am-icon-sm"></i> stackOverflow</a>
        </div>
        <br>
        <br>

        <form id="login_form" method="post" class="am-form" action="${pageContext.request.contextPath}/user/login">
            <label for="email">邮箱:</label>
            <input type="email" name="email" id="email" value="">
            <br>
            <label for="password">密码:</label>
            <input type="password" name="password" id="password" value=""><span>${message}</span>
            <br>
            <label for="remember-me">
                <input id="remember-me" type="checkbox">
                记住密码
            </label>
            <br />
            <div class="am-cf">
                <input type="submit" name="" value="登 录" class="am-btn am-btn-primary am-btn-sm am-fl">
                <input type="submit" name="" value="忘记密码 ^_^? " class="am-btn am-btn-default am-btn-sm am-fr">
            </div>
            <input type="hidden" name="oldURI" value="${pageContext.request.getParameter("oldURI")}"/>
        </form>
        <hr>
        <p>© 2014 AllMobilize, Inc. Licensed under MIT license.</p>
    </div>
</div>
<script type="text/javascript">
    // function urlReSend() {
    //     var xmlhttp;
    //     if (window.XMLHttpRequest) {
    //         //  IE7+, Firefox, Chrome, Opera, Safari 浏览器执行代码
    //         xmlhttp = new XMLHttpRequest();
    //     } else {
    //         // IE6, IE5 浏览器执行代码
    //         xmlhttp = new ActiveXObject("Microsoft.XMLHTTP");
    //     }
    //     xmlhttp.setAttribute("requestURI",xmlhttp.getAttribute("requestURI"));
    // }
</script>

</body>
</html>

