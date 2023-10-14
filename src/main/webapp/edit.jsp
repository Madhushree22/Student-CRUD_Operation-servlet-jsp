<%@page import="adv_j_servlet06_stu_jsp.dto.StudentDto" %>
    <%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
        <!DOCTYPE html>
        <html>

        <head>
            <meta charset="ISO-8859-1">
            <title> UPDATE_PAGE</title>
            <style>
                body {
                    background-color: black;
                    color: cadetblue;
                    align-content: center;
                }

                .table {
                    /* color: blueviolet; */
                    text-shadow: "2px";
                    /* align-content: center; */
                }

                .form:active {
                    color: cadetblue;
                    /* align-items: center; */
                }

                .form:focus {
                    text-shadow: "3px";

                }

                .form {
                    align-content: center;

                }

                .btn:focus {
                    /* background-color:aquamarine; */
                    color: black;

                }

                .btn {

                    background-color: cadetblue;
                    color: whitesmoke;
                    box-shadow: inset;
                    border-radius: 8px;
                }
            </style>

        </head>

        <body>
            <% StudentDto s=(StudentDto)request.getAttribute("student"); %>
                <h4>
                    <center>
                        <%String update=(String)request.getAttribute("update"); %>
                            <%=update %>
                </h4>
                </center>

                <form action="edit " method="post" class="form" align="center">
                    <h3>
                        <center>UPDATE_PAGE</center>
                    </h3>
                    <table cellspacing=4px, cellpadding=6px border="2" class="table" align="center">
                        <tr>
                            <th> NAME: </th>
                            <td> <input type="text" name="name" value="<%=s.getName() %>" required="required"></td>
                        </tr>
                        <tr>
                            <th> ID: </th>
                            <td> <input type="number" name="id" value="<%=s.getId()  %>" readonly="readonly"> </td>
                        </tr>
                        <tr>
                            <th> EMAIL ID: </th>
                            <td> <input type="email" name="email" value="<%=s.getEmail()%>" required="required"></td>
                        </tr>
                        <tr>
                            <th> ADDRESS: </th>
                            <td> <input type="text" name="address" value="<%=s.getAddress() %>" required="required">
                            </td>
                        </tr>
                        <tr>
                            <th> PASSWORD: </th>
                            <td> <input type="password" name="password" value="<%=s.getPswd() %>" required="required">
                            </td>
                        </tr>
                        <tr>
                            <th> PHONE_NO: </th>
                            <td> <input type="number" name="phno" value="<%=s.getPhno() %>" required="required"> </td>
                        </tr>

                        <!--  <caption align="bottom"> SIGN_UP PAGE</caption> -->
                    </table>
                    <br>
                    <center>
                        <button class="btn">UPDATE</button>
                    </center>


                </form>
        </body>

        </html>