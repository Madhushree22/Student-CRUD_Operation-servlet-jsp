<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>login page</title>
<style>
    body{
        background-color: black;
        color: cadetblue;
    }
    .btn:focus{
            /* background-color:aquamarine; */
            color: black;
           

        }

       .btn
       {
        width: "502px";
        height: "50px";
        background-color:  cadetblue;
        color: whitesmoke;
        border-radius: 8px;
       }
</style>
</head>
<body>
<h4><center><i>
<%String msg=(String)request.getAttribute("msg"); %>
<% if (msg!=null) { %>
<%=   msg %>
<%} %>
</h4></center></i>

<h4><center><i>
<%String psd=(String)request.getAttribute("psd"); %>
<% if (psd!=null) { %>
<%=psd %>
<%} %>
</h4></center></i>

<h4><center><i>
<%String emi=(String)request.getAttribute("emi"); %>
<% if (emi!=null) { %>
<%=emi %>
<%} %>
</h4></center></i>

<h3> <center> LOGIN PAGE </center></h3>


<form action="login" method="post" align="center">
<table align="center" cellspacing=4px, cellpadding=6px >
<tr>
<th> EMAIL ID: </th>
<td> <input type="email" name="email"> </td>
</tr>

<tr>
<th> PASSWORD: </th>
<td> <input type="password" name="password"> </td>
</tr>


</table>
<br>
<button class="btn">LOG_IN</button>
</form>

</body>
</html>