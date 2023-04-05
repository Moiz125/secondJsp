<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="java.io.*"%>
<%@page import="com.google.gson.*"%>
<%
    // Load the JSON data from file
    InputStream inputStream = new FileInputStream(new File("student.json"));
    BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
    Gson gson = new Gson();
    JsonElement jsonElement = gson.fromJson(reader, JsonElement.class);
    JsonArray jsonArray = jsonElement.getAsJsonArray();
%>

<html>
<head>
    <title>Student Table</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
    
</head>
<body>
    <table>
        <thead>
            <tr>
                <th>Student</th>
                <th>Rollno</th>
            </tr>
        </thead>
        <tbody>
            <% 

               %>
               <tr>
                   <td><%= %></td>
                   <td><%=%></td>
               </tr>
            <%  %>
        </tbody>
    </table>
</body>
</html>