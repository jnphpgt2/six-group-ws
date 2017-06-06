<%--
  Created by IntelliJ IDEA.
  User: Janan
  Date: 2017/5/24
  Time: 16:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html lang="en" xmlns="http://www.w3.org/1999/html">
<head>
  <meta charset="UTF-8">
  <title>http://www.iqiyi.com/</title>
  <style ></style>
  <link rel="stylesheet" href="爱奇艺.css"/>
  <script src="jquery-1.12.2.js"></script>
</head>
<body>
<div class="box1" id="box1">
  <a href="http://www.iqiyi.com" id="yi"><img src="../img/iqiyi-logo105x50.png"/>
  </a>
  <input type="text" id="txt" class="txt" value="人民的名义"/><a href="#" class="but" id="but"><img src="../img/2017-05-23_195120.png"/></a>
  <ul>
    <li><a href="#">登陆</a></li>
    <li><a href="#">注册</a></li>
    <li><a href="#">开通VIP</a></li>
    <li><a href="#"id="zhao1"><img id="zhao2" src="../img/2017-05-24_081613.png"/>上传<span></span></a></li>
    <li id="xia"><a href="#" >下载客户端</a></li>
    <li><a href="#">消息<span></span></a></li>
    <li><a href="#">播放记录<span></span></a></li>
  </ul>
  <img id="zhao" src="../img/2017-05-24_112957.png" alt=""/>
  <div id="box6">
    <br/><span>安装爱奇艺PC客户端</span><br/>
    <span>免广告,送VIP!</span>
    <s></s>
  </div>
</div>
<div class="box3" id="box3">
  <ul>
    <span>热门搜索</span>
    <li><s style="background-color: #57A900">1</s><a href="#">欢乐颂2</a></li>
    <li><s style="background-color: #7BBB38">2</s><a href="#">择天记</a></li>
    <li><s style="background-color: #94D054">3</s><a href="#">奔跑吧</a></li>
    <li><s>4</s><a href="#">熊出没</a></li>
    <li><s>5</s><a href="#">白鹿原</a></li>
    <li><s>5</s><a href="#">卧底归来</a></li>
    <li><s>7</s><a href="#">龙珠传奇</a></li>
    <li><s>7</s><a href="#">人民的名义</a></li>
    <li><s>9</s><a href="#">思美人</a></li>
    <li><s>10</s><a href="#">海贼王</a></li>
  </ul>
</div>
<div class="box2">
  <img id="imgs" src="../img/e5dbc68268b449fcaf36c086bdd451b1.jpg"/>
  <ul>
    <c:forEach items="${bannerList}" var="l">
       <li id="${l.t_id}"><a href="${l.t_linkurl}"> &nbsp;${l.t_title}</a></li>
    </c:forEach>
  </ul>
</div>
<div class="box5">
  <div class="box4">
    <ul>
      <li><a href="#">娱乐</a></li>
      <li><a href="#">体育</a></li>
      <li><a href="#">资讯</a></li>
    </ul>
    <ul class="ul-x"></ul>
    <ul>
      <li><a href="#">电影</a></li>
      <li><a href="#">片花</a></li>
      <li><a href="#">网络电影</a></li>
    </ul>
    <ul>
      <li><a href="#">电视剧</a></li>
      <li><a href="#">综艺</a></li>
      <li><a href="#">脱口秀</a></li>
    </ul>
    <ul class="ul-x"></ul>
    <ul>
      <li><a href="#">动漫</a></li>
      <li><a href="#">儿童</a></li>
      <li><a href="#">教育</a></li>
    </ul>
    <ul>
      <li><a href="#">生活</a></li>
      <li><a href="#">母婴</a></li>
      <li><a href="#">健康</a></li>
    </ul>
    <ul class="ul-x"></ul>
    <ul>
      <li><a href="#">音乐</a></li>
      <li><a href="#">时尚</a></li>
      <li><a href="#">旅游</a></li>
    </ul>
    <ul>
      <li><a href="#">搞笑</a></li>
      <li><a href="#">原创</a></li>
      <li><a href="#">拍客</a></li>
    </ul>
    <ul class="ul-x"></ul>
    <ul>
      <li><a href="#">财经</a></li>
      <li><a href="#">科技</a></li>
      <li><a href="#">汽车</a></li>
    </ul>
    <ul>
      <li><a href="#">军事</a></li>
      <li><a href="#">公益</a></li>
      <li><a href="#">纪录片</a></li>
    </ul>
    <ul class="ul-x"></ul>
    <ul>
      <li><a href="#">风云榜</a></li>
      <li><a href="#">全网影视</a></li>
      <li><a href="#">全网搜索</a></li>
    </ul>
    <ul>
      <li><a href="#">奇秀直播</a></li>
      <li><a href="#">直播中心</a></li>
      <li><a href="#">应用商店</a></li>
    </ul>
    <ul class="ul-x"></ul>
    <ul>
      <li><a href="#">商城</a></li>
      <li><a href="#">游戏视频</a></li>
      <li><a href="#">游戏中心</a></li>
    </ul>
    <ul>
      <li><a href="#">大头</a></li>
      <li><a href="#">爱奇艺号</a></li>
      <li><a href="#">VR</a></li>
    </ul>
    <ul>
      <li><a href="#">文学</a></li>
      <li><a href="#">广告</a></li>
      <li><a href="#">个人中心</a></li>
    </ul>
    <ul class="ul-x"></ul>
    <ul>
      <li><a href="#"><img src="../img/2017-05-24_150907.png"/></a></li>
      <li><a href="#"></a></li>
      <li><a href="#">VIP会员</a></li>
    </ul>

  </div>
</div>
</body>
<script>
  $(function(){
    $("#txt").focus(function(){
      $("#txt").attr("value","")
    })
  })
  $(function(){
    $("#txt").focus(function(){
      $("#box3").css("display", "block")
    })
    $("#txt").focusout(function(){
      $("#box3").css("display", "none")
    })
  })
  $(function(){
    $("#xia").mouseenter(function(){
      $("#box6").css("display", "block")
    })
    $("#xia").mouseleave(function(){
      $("#box6").css("display", "none")
    })
  })
$(function(){
  <c:forEach items="${bannerList}" var="l">
     var id=${l.t_id};
    $("#"+id).mouseenter(function(){
      $("#imgs").attr("src","${l.t_imgpath}")
    })
 </c:forEach>
  })
</script>
</html>
