<%--
  Created by IntelliJ IDEA.
  User: 98231
  Date: 2019/1/8
  Time: 20:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" import="java.util.*" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
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

<div class="am-g am-g-fixed blog-g-fixed">
    <div class="am-u-md-8">
        <article class="blog-main">
            <h3 class="am-article-title">
                <a href="#">${blog.title}</a>
            </h3>
            <h4 class="am-article-meta blog-meta">by <a
                        href="${pageContext.request.contextPath}/blog/author/${blog.author}">${blog.author}</a>
                    posted on ${releaseDate} under
                    <a href="${pageContext.request.contextPath}/blog/archive/1?typeId=${blog.blogType.id}">${blog.blogType.typeName}</a>
            </h4>

            <div class="am-g blog-content">
                <div class="am-u-lg-7">
                    <%--<p><!--本demo文字来自 http://blog.justfont.com/--> 这次要介绍的是大家似乎都狠熟悉却又狠陌生的字体：Arial。不只是对 Typography--%>
                    <%--特别有兴趣的人、碰过排版的人，就算毫无接触，只要打开过电脑的字型选单，应该都有看过这个字型吧。尤其它还是以 A 开头，总是会出现在选单最前面。</p>--%>

                    <%--<p>Arial 常常跟 Helvetica 搞混，也常被当作是没有 Helvetica 时的替代字体使用。事实上 Arial 确实就是故意做得跟 Helvetica--%>
                    <%--狠相似，连每个字母的宽度都刻意做得一模一样。</p>--%>


                    <p>${blog.content}</p>

                </div>
                <div class="am-u-lg-5">
                    <p><img src="https://farm3.staticflickr.com/2917/14186214720_5d0b8ca2e3_b.jpg"></p>
                </div>
            </div>
            <div class="am-g">
                <div class="am-u-sm-12">
                    <text>
                        测试啊啊啊啊啊啊？。。。。。。。。。。。。。。。时
                    </text>
                    <%--<p>在欧美的排版业界中，使用 Arial 的作品意即是「不使用 Helvetica 的作品」，会被认為是设计师对字体的使用没有概念或是太容易妥协，基本上我大致也是同意。</p>--%>

                    <%--<p>因為 Helvetica 只有 Mac 上才有內建，Windows 用戶除非花錢買，不然是沒有 Helvetica 能用，所以使用 Arial 的設計師往往被看成是不願意對 Typography--%>
                    <%--花錢，專業素養不到家的人。除了在確保網頁相容性等絕對必需的情況外，幾乎可以說是不應該使用的字體。</p>--%>

                    <%--<p>但是，在此之前，我們對 Arial 又有多少認識呢？</p>--%>
                </div>
            </div>
        </article>

        <hr class="am-article-divider blog-hr">
        <ul class="am-pagination blog-pagination">
            <c:if test="${prevBlog !=null}">
                <li class="am-pagination-prev"><a
                        href="${pageContext.request.contextPath}/blog/articles/${prevBlog.id}">&laquo;上一页 </a></li>
            </c:if>
            <c:if test="${nextBlog != null}">
                <li class="am-pagination-next"><a
                        href="${pageContext.request.contextPath}/blog/articles/${nextBlog.id}">下一页&raquo;</a></li>
            </c:if>
        </ul>
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
        <small>© Copyright XXX. by the AmazeUI Team.</small>
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

