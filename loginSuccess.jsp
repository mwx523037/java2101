<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<%= request.getParameterValues("username")[0] %><br/>
<%= request.getParameter("password") %><br/>

<%
    request.setAttribute("mess", "注册失败");
    String mess=(String)request.getAttribute("mess");
    if(mess!=null){
    //在请求中取到"mess"属性对应的属性值，正常使用mess数据
        }else{
    //在请求中没有取到"mess"属性对应的属性值，使用备选方案
    }
%>

<%=mess%>
</body>
</html>