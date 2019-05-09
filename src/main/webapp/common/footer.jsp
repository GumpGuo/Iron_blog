<%--
  Created by IntelliJ IDEA.
  User: 98231
  Date: 2019/1/8
  Time: 12:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page isELIgnored="false"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<footer id="footer">
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
        }

        .footer {
            height: 780px;
            background-color: white;
        }

        /*版心*/
        .inner_c_f {
            width: 1000px;
            margin: 50px auto; /*让导航条、内容等部分的版心在父亲里居中*/
        }

        .inner_c_f p{
            text-align: center;
            font-size: 8px;
            color: #191D3A;
        }
    </style>

    <div class="footer">
        <div class="inner_c_f">
            <p>© 2018 - GYB </p>
        </div>
    </div>


</footer>
