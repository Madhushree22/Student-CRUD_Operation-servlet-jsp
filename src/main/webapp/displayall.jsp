
<%@page import="adv_j_servlet06_stu_jsp.dto.StudentDto"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>display all</title>
<style>
    .link{
        color: aqua;
        
    }
    .link:focus
    {
        color:blueviolet;
    }
    .link:hover
    {
        color:hotpink;
    }
    body{
        background-color: black;
        color: cadetblue;
    }
</style>
</head>
<body>

<%List <StudentDto> st=(List)request.getAttribute("listofw"); %>


<h4><center><i>
<%String msg=(String)request.getAttribute("msgg"); %>
<% if(msg!=null) { %>
<%=msg %>
<%} %>
</i></center></h4>

<h4><center><i>
<%String delete=(String)request.getAttribute("delete"); %>
<% if(delete!=null) { %>
<%=delete %>
<%} %>
</i></center></h4>

<h4><center><i>
<%String updated=(String)request.getAttribute("updated"); %>
<% if(updated!=null) { %>
<%=updated %>
<%} %>
</i></center></h4>

<h4><center><i>
<%String name=(String)request.getAttribute("name"); %>
<%if(name!=null) { %>
<%=name %>
<%} %>
</i></center></h4>

<h3><center>List Of Students.....</center></h3>
<table border=2px cellpadding=8px cellspacing=8px align="center">
<tr>
<th> ID </th>
<th> NAME </th>
<th> EMAIL </th>
<th> FEE </th>
<th> PHONE NO </th>
<th> ADDREESS </th>
<th> PASSWORD </th>
<th> DELETE </th>
<th> UPDATE </th>
</tr>

<% for(StudentDto s:st) {  %>
<tr>
<td><%=s.getId() %></td>
<td><%=s.getName() %></td>
<td><%=s.getEmail() %></td>
<td><%=s.getFee() %></td>
<td><%=s.getPhno() %></td>
<td><%=s.getAddress() %></td>
<td><%=s.getPswd()%></td>
<td><a href="delete?id=<%=s.getId()%>" class="link">DELETE</a> </td>
<td> <a href="update?id=<%=s.getId()%>" class="link">UPDATE</a> </td>

</tr>
<%} %>


</table>

<br>
</body>
</html>