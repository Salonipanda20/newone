<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Error Page</title>
    <link rel="stylesheet" href="styles.css"> <!-- Link to any external CSS file -->
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f2f2f2;
            text-align: center;
            padding: 50px;
        }
        .error-container {
            background-color: white;
            border: 1px solid #eaeaea;
            border-radius: 5px;
            padding: 20px;
            box-shadow: 0 2px 10px rgba(0,0,0,0.1);
            display: inline-block;
        }
        h1 {
            color: #ff0000;
        }
        p {
            font-size: 18px;
        }
        a {
            text-decoration: none;
            color: #007BFF;
        }
        a:hover {
            text-decoration: underline;
        }
    </style>
</head>
<body>

<div class="error-container">
    <h1>Error Occurred</h1>
    <p>We're sorry, but something went wrong.</p>
    <p>Status Code: <strong><%= request.getAttribute("javax.servlet.error.status_code") %></strong></p>
    <p>Error Message: <strong><%= request.getAttribute("javax.servlet.error.message") %></strong></p>
    <p>For more information, please contact support or <a href="index.jsp">go back to the homepage</a>.</p>
</div>

</body>
</html>
