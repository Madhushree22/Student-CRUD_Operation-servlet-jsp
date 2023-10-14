<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
    <!DOCTYPE html>
    <html>

    <head>
        <meta charset="ISO-8859-1">
        <title> SIGN_UP page</title>
        <style>
            body {
                background-color: black;
                color: cadetblue;
                align-content: center;


            }

            .table {
                /* color: blueviolet; */
                text-shadow: "2px";
                align-content: center;
            }

            .form:active {
                color: cadetblue;
                align-items: center;
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
                border-radius: 8px;
                background-color: cadetblue;
                color: whitesmoke;
            }
        </style>

    </head>

    <body>
        <pre>
<h3>
<i>
<center>ENTER YOUR DETAILS TO SIGN_UP.....</center>
</i>
</h3>
</pre>
        <center>
            <i>
                <h4>
                    <%String msg=(String)request.getAttribute("msg"); %>
                        <%if(msg!=null) { %>
                            <%=msg %>
                                <%} %>
        </center>
        </h4>
        </i>


        <form action="signup" method="post" class="form">
            <h3>
                <center> SIGN_UP PAGE</center>
            </h3>
            <table align="center" cellspacing=4px, cellpadding=6px class="table">
                <tr>
                    <th> NAME: </th>
                    <td> <input type="text" name="name"></td>
                </tr>
                <tr>
                    <th> ID: </th>
                    <td> <input type="number" name="id"> </td>
                </tr>
                <tr>
                    <th> EMAIL ID: </th>
                    <td> <input type="email" name="email"> </td>
                </tr>
                <tr>
                    <th> ADDRESS: </th>
                    <td> <input type="text" name="address"> </td>
                </tr>
                <tr>
                    <th> PASSWORD: </th>
                    <td> <input type="password" name="password"> </td>
                </tr>
                <tr>
                    <th> PHONE_NO: </th>

                    <td><select>
                            <option> +91 </option>
                            <option> +71 </option>
                            <option> +93 </option>
                        </select> <input type="number" name="phno"> </td>
                </tr>

                <tr>
                    <th> PROFILE: </th>
                    <td> <input type="file" name=" "> </td>
                </tr>

                <!--  <caption align="bottom"> SIGN_UP PAGE</caption> -->
            </table>
            </center>
            <br>
            <center>
                <button class="btn">SIGN_UP</button>
                <!-- <input type="submit" value="SIGN_UP"> -->
            </center>
        </form>
    </body>

    </html>