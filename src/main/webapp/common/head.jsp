<%--
  Created by IntelliJ IDEA.
  User: 98231
  Date: 2019/1/8
  Time: 12:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page isELIgnored="false" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<header id="header">
    <style type="text/css">
        * {
            margin: 0px;
            padding: 0px;
        }

        /*清除浮动的影响*/
        .cl {
            clear: both;
        }

        body {
            font-size: 14px;
            font-family: "Microsoft YaHei UI", "SimSun";
            height: 8888px;
        }

        .header {
            height: 58px;
            background-color: #191D3A;

        }

        /*版心*/
        .inner_c {
            width: 1000px;
            margin: 0 auto; /*让导航条、内容等部分的版心在父亲里居中*/
        }

        /*导航条的logo*/
        .header .logo {
            float: left;
            margin-right: 0px;
        }

        .header .nav {
            float: left;
        }

        .header .nav ul {
            list-style: none; /*去掉列表前面的圆点*/
        }

        .header .nav ul li {
            float: left;
            width: 100px;
            line-height: 58px; /*让行高等于这一行的高度，保证里面的文字垂直居中*/
            border-left: 1px solid #252947; /*每个li之间有间隔线*/
        }

        .header .nav ul li.last {
            border-right: 1px solid #252947; /*最后一个li的右边加间隔线*/
        }

        .header .nav ul li a {
            display: block; /*将超链接转为块儿，可以保证其霸占父亲的整行*/
            height: 58px;
            text-decoration: none; /*去掉超链的下划线*/
            color: #818496;
            text-align: center; /*让这个div内部的文本居中*/
        }

        .header .nav ul li a.current {
            color: white;
            background-color: #252947;
        }

        .header .nav ul li a:hover {
            color: white;
            background: #252947;
        }

        .header .jrwm_box {
            float: left;
            height: 58px;
            width: 100px;
            padding-left: 48px;
            padding-top: 12px;
        }

        /*放图片的div*/
        .header .jrwm_box .jrwm {
            height: 34px;
            background-color: green;
            text-align: center; /*让这个div里面的超链接居中*/
        }

        .header .jrwm_box .jrwm a {
            display: block; /*将超链接转接为块儿，可以保证其霸占父亲的整行*/
            line-height: 34px; /*让行高为背景图片的高度，可以保证超链接文字在背景图片里面垂直居中*/
            text-decoration: none; /*去掉超链接下划线*/
            color: gray;
        }

        .header .jrwm_box .jrwm a:hover{
            background-color: chartreuse;
            color: white;
        }

        .banner{
            height: 768px;
            background: url(${pageContext.request.contextPath}/static/1490627025711.jpg) no-repeat center top;
        }
    </style>

    <div class="header">
        <div class="inner_c">
            <div class="logo">
                <img src="${pageContext.request.contextPath}/static/1.png" alt="">
            </div>
            <div class="nav">
                <ul>
                    <li><a href="${pageContext.request.contextPath}/index.jsp" class="current">首页</a></li>
                    <li><a href="${pageContext.request.contextPath}/blog/category">博客</a></li>
                    <li><a href="${pageContext.request.contextPath}/video.jsp">视频</a></li>
                    <li><a href="${pageContext.request.contextPath}/about.jsp">关于我们</a></li>
                    <li><a href="${pageContext.request.contextPath}/index.jsp">客服中心</a></li>
                    <li class="last"><a href="${pageContext.request.contextPath}/link.jsp">友情链接</a></li>
                </ul>
            </div>
            <div class="jrwm_box">
                <div class="jrwm">
                    <a href="">加入我们</a>
                </div>
            </div>
        </div>
    </div>

    <!-- 在导航条和banner之间隔一堵墙 -->
    <div class="cl"></div>

    <div class="banner"></div>

</header>
