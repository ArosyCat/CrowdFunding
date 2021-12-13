<%--
  Created by IntelliJ IDEA.
  User: 86134
  Date: 2021/11/3
  Time: 10:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>

<base href="http://${pageContext.request.serverName}:${pageContext.request.serverPort}${pageContext.request.contextPath}/">
<script type="text/javascript" src="jquery/jquery-2.1.1.min.js"></script>
<%-- layer弹层组件，必须放在jquery后面 --%>
<script type="text/javascript" src="layer/layer.js"></script>
<script type="text/javascript">
  $(function () {
      $("#btn1").click(function (){
        $.ajax({
            "url": "send/array/one.html",  //请求目标资源的地址
            "type": "post",            //请求方式
            "data": {
              "array": [5,8,12]
            },          //要发送的请求参数
            "dataType": "text",        //如何对待服务器端返回的数据
            "success": function (response){   //服务器端成功处理请求后调用的回调函数，response是响应体数据
                alert(response);
            },
            "error": function (response){     //服务器端处理请求失败后回调的函数
                alert(response);
            }
        });
      });

      $("#btn2").click(function () {
         $.ajax({
            "url": "send/array/two.html",
            "type": "post",
            "data": {
                "array[0]": 5,
                "array[1]": 8,
                "array[2]": 12
            },
            "dataType": "text",
             "success": function (response) {
                alert(response);
             },
             "error": function (response){
                alert(response);
             }
         });
      });

      $("#btn3").click(function (){

          //准备好要发送到服务器端的数组
          var array = [5,8,12];

          //将JSON数组转换为JSON字符串
          var requestBody = JSON.stringify(array);

          $.ajax({
              "url": "send/array/three.html",
              "type": "post",
              "data": requestBody,   //请求体
              "contentType": "application/json;charset=UTF-8",   //请求体的内容类型，告诉服务器端本次请求的请求体的内容类型
              "dataType": "text",
              "success": function (response){
                  alert(response);
              },
              "error": function (response){
                  alert(response);
              }
          });
      });

      $("#btn4").click(function (){

        //准备要发送的数据
        var student = {
          "stuId": 5,
          "stuName": "tom",
          "address": {
              "province": "广东",
              "city": "汕头",
              "street": "文光"
          },
          "subjectsList": [
            {
              "subjectName": "JavaSE",
              "subjectScore": 100
            },{
              "subjectName": "SSM",
              "subjectScore": 90
            }
          ],
          "map": {
              "k1": "v1",
              "k2": "v2",
              "k3": "v3"
          }
        };

        //将JSON对象转换为JSON字符串
        var requestBody = JSON.stringify(student);
        //发送Ajax请求
        $.ajax({
          "url": "send/compose/object.json",
          "type": "post",
          "data": requestBody,
          "contentType": "application/json;charset=UTF-8",
          "dataType": "json",
          "success": function (response){
            console.log(response)
          },
          "error": function (response){
            console.log(response)
          }
        });
      });

      $("#btn5").click(function (){
        layer.msg("Layer的弹框");
      });
  });
</script>

  </head>
  <body>
    <a href="test/ssm.html">测试SSM整合环境</a>

    <br/>
    <br/>
    <br/>

    <button id="btn1">Send [5,8,12] One</button>

    <br/>
    <br/>
    <br/>

    <button id="btn2">Send [5,8,12] Two</button>

    <br/>
    <br/>
    <br/>

    <button id="btn3">Send [5,8,12] Three</button>

    <br/>
    <br/>
    <br/>

    <button id="btn4">Send Compose Object</button>

    <br/>
    <br/>
    <br/>

    <button id="btn5">点我弹框</button>

  </body>
</html>
