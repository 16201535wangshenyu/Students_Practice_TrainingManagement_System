<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <meta charset="UTF-8">
    <title>main</title>
    <link href="../../css/style.css" rel="stylesheet" type="text/css"/>
    <script language="JavaScript" src="../../JS/jquery.js"></script>
</head>
<script type="text/javascript">
    $(function () {
        //顶部导航切换
        $(".nav li a").click(function () {
            $(".nav li a.selected").removeClass("selected");
            $(this).addClass("selected");
        })
    })
</script>
<script type="text/javascript">
    $(function () {
        //导航切换
        $(".menuson li").click(function () {
            $(".menuson li.active").removeClass("active");
            $(this).addClass("active");
        });

        $('.title').click(function () {
            var $ul = $(this).next('ul');
            $('dd').find('ul').slideUp();
            if ($ul.is(':visible')) {
                $(this).next('ul').slideUp();
            } else {
                $(this).next('ul').slideDown();
            }
        });
    })
</script>
<body style="background:url(../../images/topbg.gif) repeat-x;">
<div class="top">
    <div class="topleft">
        <a href="/admin/admin_index.jsp"><img src="../../images/home.png" style="width: 64px;height: 64px" title="系统首页"/></a>
    </div>

    <ul class="nav">
        <li><a href="/teacher_mana_indexServlet" class="selected"><img src="../../images/icon02.png" title="教师管理"/>
            <h2>教师管理</h2></a></li>
        <li><a href="/student_manage"><img src="../../images/icon03.png" title="学生管理"/>
            <h2>学生管理</h2></a></li>
        <li><a href="/class_management_indexServlet"><img src="../../images/icon01.png" title="班级管理"/>
            <h2>班级管理</h2></a></li>
    </ul>

    <div class="topright">
        <ul>
            <li><span><img src="../../images/help.png" title="帮助" class="helpimg"/></span><a href="#">帮助</a></li>
            <li><a href="#">关于</a></li>
            <li><a href="/logout" target="_parent">退出</a></li>
        </ul>
        <div class="user">
            <span>${admin_no}</span>
        </div>
    </div>
</div>

<div class="container">
    <div class="lefttop"><span></span>列表</div>

    <dl class="leftmenu">
        <dd>
            <div class="title">
                <span><img src="../../images/leftico01.png"/></span>管理信息
            </div>
            <ul class="menuson">
                <li class="active"><cite></cite><a href="/teacher_mana_indexServlet">教师管理首页</a><i></i></li>
                <li><cite></cite><a href="/admin/teacher_management/teacher_add.jsp">添加教师信息</a><i></i></li>

            </ul>
        </dd>
    </dl>

    <div class="main">
        <c:if test="${not empty msg}">
            <div style="padding-left: 187px;width: 50%;overflow: hidden;margin: 0 auto;color: #aa0000">${msg}</div>
        </c:if>
        <div style="padding-left: 187px;width: 50%;overflow: hidden;margin: 0 auto;">
            <div style="height:40px;line-height:40px;">
                <div style="color: #000;text-align: center;">
                    <div style="width: 10.5%;float: left;">id</div>
                    <div style="width: 10.5%;float: left;">名字</div>
                    <div style="width: 15.5%;float: left;">联系电话</div>
                    <div style="width: 15.5%;float: left;">专业</div>
                    <div style="float: left;width: 5.5%;">|</div>
                    <div style="width: 10.5%;float: left;">操作</div>
                </div><br>
            </div>
            <c:if test="${not empty teacherList}">
                <c:forEach items="${teacherList}" var="teacher">
                    <div style="height:40px;line-height:40px;">
                        <div style="color: #000;text-align: center;">
                            <div style="width: 10.5%;float: left;font-size:15px;">${teacher.getId()}</div>
                            <div style="width: 10.5%;float: left;font-size:15px;">${teacher.getName()}</div>
                            <div style="width: 15.5%;float: left;font-size:15px;">${teacher.getPhone()}</div>
                            <div style="width: 15.5%;float: left;font-size:15px;">${teacher.getProfession()}</div>
                            <div style="float: left;width: 5.5%;font-size:15px;">|</div>
                            <div style="width: 10.5%;float: left;font-size:15px;"><a style="color: #a00;" href="/teacher_detailServlet?tno=${teacher.getId()}">详情</a></div>
                        </div><br>
                    </div>
                </c:forEach>
            </c:if>
        </div>

        <!-- 动态生成页面跳转标签 -->
        <div style="padding-left:187px;width: 76%;overflow: hidden;margin: 0 auto;border: 1px solid #000;position: absolute;top: 88.5%;background-color: #3cc3f6;color: #fff;">
            <div style="height:30px;line-height:30px;">
                <div style="padding-left: 21.5%;height:30px;line-height:30px;width: 80px;float: left;"><%="第 "%>${current_page}<%=" 页"%></div>
                <div style="height:30px;line-height:30px;width: 80px;float: left;"><%="共 "%>${page_num}<%=" 页"%></div>
                <div style="float: left">
                    <a style="padding-left: 40px;" href="/teacher_mana_indexServlet?current_page=${1}">首页</a>
                    <a style="padding-left: 10px;padding-right: 10px;" href="/teacher_mana_indexServlet?current_page=${current_page>1 ? current_page-1:1}"><%="上一页 "%></a>
                    <c:forEach step="1" begin="1" end="${page_num}"  varStatus="status">
                        <c:if test="${status.current==current_page}">
                            <a style="color:#a00" href="/teacher_mana_indexServlet?current_page=${status.current}"><%=" "%>${status.current}<%=" "%></a>
                        </c:if>
                        <c:if test="${status.current!=current_page}">
                            <a href="/teacher_mana_indexServlet?current_page=${status.current}}"><%=" "%>${status.current}<%=" "%></a>
                        </c:if>
                    </c:forEach>
                    <a style="padding-left: 10px;padding-right: 10px;"  href="/teacher_mana_indexServlet?current_page=${current_page<page_num ? current_page+1:page_num}"><%=" 下一页"%></a>
                    <a  href="/teacher_mana_indexServlet?current_page=${page_num}">尾页</a>
                </div>
                <div style="height:30px;line-height:30px;width: 120px;float: left;padding-left: 50px;">
                    <div style="float: left;"><%="到"%></div>
                    <div style="float: left;padding-right: 10px;"><%="第"%></div>
                    <div style="float: left;">
                        <form style="padding-top: 2.5px;line-height:30px;height: 25px;width: 25px;float:left" action="/teacher_mana_indexServlet" method="post" name="form1">
                            <input type="text" name="current_page" style="border:1px solid #000;line-height:30px;height: 25px;width: 25px;text-align: center">
                        </form>
                    </div>
                    <div style="float: left;padding-right: 10px;padding-left: 10px;"><%="  页"%></div>
                    <a style="border: 1px solid #fcf5f5" href="javascript:void(0)" onclick="form1.submit()">确定</a>
                </div>


            </div>
        </div>
    </div>
</div>
</body>
</html>
