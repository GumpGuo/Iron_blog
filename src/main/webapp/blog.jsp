<%@ page language="java" import="java.util.*" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head lang="en">
    <meta charset="UTF-8">
    <title>Blog | Amaze UI Example</title>
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport"
          content="width=device-width, initial-scale=1">
    <meta name="format-detection" content="telephone=no">
    <meta name="renderer" content="webkit">
    <meta http-equiv="Cache-Control" content="no-siteapp"/>
    <link rel="alternate icon" type="image/png" href="${pageContext.request.contextPath}/assets/i/favicon.png">
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/assets/css/amazeui.css"/>
    <style>
        @media only screen and (min-width: 1200px) {
            .blog-g-fixed {
                max-width: 1200px;
            }
        }

        @media only screen and (min-width: 641px) {
            .blog-sidebar {
                font-size: 1.4rem;
            }
        }

        .blog-main {
            padding: 20px 0;
        }

        .blog-title {
            margin: 10px 0 20px 0;
        }

        .blog-meta {
            font-size: 14px;
            margin: 10px 0 20px 0;
            color: #222;
        }

        .blog-meta a {
            color: #27ae60;
        }

        .blog-pagination a {
            font-size: 1.4rem;
        }

        .blog-team li {
            padding: 4px;
        }

        .blog-team img {
            margin-bottom: 0;
        }

        .blog-content img,
        .blog-team img {
            max-width: 100%;
            height: auto;
        }

        .blog-footer {
            padding: 10px 0;
            text-align: center;
        }
    </style>
</head>


<body>

<jsp:include page="common/head0.jsp"></jsp:include>


<%--<h1>欢迎浏览博客</h1>--%>


<%--<c:forEach var="blog" items="${blogList}">--%>
    <%--<ul>--%>
        <%--<li><a href="${pageContext.request.contextPath}/blog/articles/${blog.id}">${blog.title}</a></li>--%>
    <%--</ul>--%>
<%--</c:forEach>--%>

<div class="am-g am-g-fixed blog-g-fixed">
    <div class="am-u-md-8">
        <article class="blog-main">
            <h3 class="am-article-title">
                Iron Blog
            </h3>

            <div class="am-g blog-content">
                <div class="am-u-lg-12">
                    <ul>
                        <c:forEach var="blog" items="${blogList}">
                            <li><a href="${pageContext.request.contextPath}/blog/articles/${blog.id}">${blog.title}</a>
                            </li>
                        </c:forEach>
                    </ul>
                </div>
            </div>
        </article>
    </div>
    <div class="am-u-md-4 blog-sidebar">
        <div class="am-panel-group">
            <section class="am-panel am-panel-default">
                <div class="am-panel-hd">关于我</div>
                <div class="am-panel-bd">
                    <p>前所未有的中文云端字型服务，让您在 web
                        平台上自由使用高品质中文字体，跨平台、可搜寻，而且超美。云端字型是我们的事业，推广字型学知识是我们的志业。从字体出发，关心设计与我们的生活，justfont blog
                        正是為此而生。</p>
                    <a class="am-btn am-btn-success am-btn-sm" href="#">查看更多 →</a>
                </div>
            </section>
            <section class="am-panel am-panel-default">
                <div class="am-panel-hd">文章目录</div>
                <ul class="am-list blog-list">
                    <li><a href="#">Google fonts 的字體（sans-serif 篇）</a></li>
                    <li><a href="#">[but]服貿最前線？－再訪桃園機場</a></li>
                    <li><a href="#">到日星鑄字行學字型</a></li>
                    <li><a href="#">glyph font vs. 漢字（上）</a></li>
                    <li><a href="#">浙江民間書刻體上線</a></li>
                    <li><a href="#">[極短篇] Android v.s iOS，誰的字體好讀？</a></li>
                </ul>
            </section>

            <section class="am-panel am-panel-default">
                <div class="am-panel-hd">团队成员</div>
                <div class="am-panel-bd">
                    <ul class="am-avg-sm-4 blog-team">
                        <li><img class="am-thumbnail"
                                 src="http://img4.duitang.com/uploads/blog/201406/15/20140615230220_F5LiM.thumb.224_0.jpeg"
                                 alt=""/>
                        </li>
                        <li><img class="am-thumbnail"
                                 src="http://img4.duitang.com/uploads/blog/201406/15/20140615230220_F5LiM.thumb.224_0.jpeg"
                                 alt=""/>
                        </li>
                        <li><img class="am-thumbnail"
                                 src="http://img4.duitang.com/uploads/blog/201406/15/20140615230220_F5LiM.thumb.224_0.jpeg"
                                 alt=""/>
                        </li>
                        <li><img class="am-thumbnail"
                                 src="http://img4.duitang.com/uploads/blog/201406/15/20140615230220_F5LiM.thumb.224_0.jpeg"
                                 alt=""/>
                        </li>
                        <li><img class="am-thumbnail"
                                 src="http://img4.duitang.com/uploads/blog/201406/15/20140615230159_kjTmC.thumb.224_0.jpeg"
                                 alt=""/>
                        </li>
                        <li><img class="am-thumbnail"
                                 src="http://img4.duitang.com/uploads/blog/201406/15/20140615230220_F5LiM.thumb.224_0.jpeg"
                                 alt=""/>
                        </li>
                        <li><img class="am-thumbnail"
                                 src="http://img4.duitang.com/uploads/blog/201406/15/20140615230220_F5LiM.thumb.224_0.jpeg"
                                 alt=""/>
                        </li>
                        <li><img class="am-thumbnail"
                                 src="http://img4.duitang.com/uploads/blog/201406/15/20140615230159_kjTmC.thumb.224_0.jpeg"
                                 alt=""/>
                        </li>
                    </ul>
                </div>
            </section>
        </div>
    </div>

</div>

<footer class="blog-footer">
    <p>blog template<br/>
        <small>© Copyright GYB. by the AmazeUI Team.</small>
    </p>
</footer>

<!--[if lt IE 9]>
<script src="http://libs.baidu.com/jquery/1.11.1/jquery.min.js"></script>
<script src="http://cdn.staticfile.org/modernizr/2.8.3/modernizr.js"></script>
<script src="${pageContext.request.contextPath}/assets/js/amazeui.ie8polyfill.min.js"></script>
<![endif]-->

<!--[if (gte IE 9)|!(IE)]><!-->
<script src="http://libs.baidu.com/jquery/1.11.1/jquery.min.js"></script>
<!--<![endif]-->
<script src="${pageContext.request.contextPath}/assets/js/amazeui.min.js"></script>
</body>
</html>
