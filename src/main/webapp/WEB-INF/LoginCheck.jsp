<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Welcome Page</title>
 </head>
<body>
<%
String username=request.getParameter("username");
String password=request.getParameter("password");
if((!username.equals("") && !password.equals("")))
 {
 session.setAttribute("username",username);
 session.setAttribute("password",password);
 response.sendRedirect("Home.jsp");
 }
 else
 response.sendRedirect("Error.jsp"); %>
  </body> </html>

