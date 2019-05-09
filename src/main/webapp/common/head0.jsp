<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: 98231
  Date: 2019/1/11
  Time: 15:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page isELIgnored="false" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>


<header class="am-topbar">
    <h1 class="am-topbar-brand">
        <a href="#">blog</a>
    </h1>

    <button class="am-topbar-btn am-topbar-toggle am-btn am-btn-sm am-btn-success am-show-sm-only"
            data-am-collapse="{target: '#doc-topbar-collapse'}"><span class="am-sr-only">导航切换</span> <span
            class="am-icon-bars"></span></button>
    <div class="am-collapse am-topbar-collapse" id="doc-topbar-collapse">
        <ul class="am-nav am-nav-pills am-topbar-nav">
            <li id="toIndex"><a href="${pageContext.request.contextPath}/">首页</a></li>
            <li id="toBlog"><a href="${pageContext.request.contextPath}/blog/category">博客</a></li>
            <li id="toVideo"><a href="${pageContext.request.contextPath}/video.jsp">视频</a></li>
            <li class="am-dropdown" data-am-dropdown>
                <a class="am-dropdown-toggle" data-am-dropdown-toggle href="javascript:;">
                    菜单 <span class="am-icon-caret-down"></span>
                </a>
                <ul class="am-dropdown-content">
                    <li class="am-dropdown-header">标题</li>
                    <li><a href="#">关于我们</a></li>
                    <li><a href="#">关于字体</a></li>
                    <li><a href="#">TIPS</a></li>
                </ul>
            </li>
        </ul>
        <ul class="am-nav am-nav-pills am-topbar-nav am-topbar-right" style="margin-top: 0px">

            <%--<c:if test="${not empty sessionUserName}">--%>
            <%--<li><a href="">欢迎登入${sessionUserName}</a></li>--%>
            <%--</c:if>--%>
            <%--<li><a style="font-size: small" href="">登入</a></li>--%>
            <%--<li><a style="font-size: small" href="">注册</a></li>--%>
            <c:choose>
                <c:when test="${not empty sessionUserName}">
                    <li><a style="font-size: small" href="#">欢迎${sessionUserName}</a></li>
                </c:when>
                <c:otherwise>
                    <li><a id="login" onclick="urlSend()" style="font-size: small"
                           href="${pageContext.request.contextPath}/jsp/login.jsp?oldURI=${pageContext.request.requestURI}">登入</a>
                    </li>
                    <li><a id="register" onclick="urlSend()" style="font-size: small"
                           href="${pageContext.request.contextPath}/jsp/register.jsp?oldURI=${pageContext.request.requestURI}">注册</a>
                    </li>
                </c:otherwise>
            </c:choose>

        </ul>
        <form class="am-topbar-form am-topbar-left am-form-inline am-topbar-right" role="search">
            <div class="am-form-group">
                <input type="text" class="am-form-field am-input-sm" placeholder="搜索文章">
            </div>
            <button type="submit" class="am-btn am-btn-default am-btn-sm">搜索</button>
        </form>
    </div>

    <script type="text/javascript">
        var url = location.href;
        if (url == location.protocol + "//" + (location.host + "/Iron_blog_war/")) {
            var toIndex = document.getElementById("toIndex");
            toIndex.setAttribute("class", "am-active");
            console.log(location.host + "/Iron_blog_war/");
            console.log(url);
        } else if (url.includes(location.host + "/Iron_blog_war/blog")) {
            document.getElementById("toBlog").setAttribute("class", "am-active");
        } else if (url.includes(location.host + "/Iron_blog_war/video")) {
            document.getElementById("toVideo").setAttribute("class", "am-active");
        }

        // var login = document.getElementById("login");
        // var register = document.getElementById("register");
        //
        // login.onclick = function () {
        //     document.
        // }
        // register.onclick = function () {
        //
        // }
        function urlSend() {
            var xmlhttp;
            if (window.XMLHttpRequest) {
                //  IE7+, Firefox, Chrome, Opera, Safari 浏览器执行代码
                xmlhttp = new XMLHttpRequest();
            } else {
                // IE6, IE5 浏览器执行代码
                xmlhttp = new ActiveXObject("Microsoft.XMLHTTP");
            }
            xmlhttp.setAttribute("requestURI", location.pathname);
            // window.XMLHttpRequest = xmlhttp;
        }
    </script>
</header>
