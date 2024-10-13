<html>
<head>
    <title>Admin Login</title>
    <link rel="stylesheet" type="text/css" href="style.css">
</head>
<body>
    <div class="login-box">
        <img src="user.png" class="avatar">
        <h1>Admin Login</h1>
        <form action="AdminLoginController" method="post">
            <p>Username</p>
            <input type="text" name="username" placeholder="Enter Username" required="required">
            <p>Password</p>
            <input type="password" name="password" placeholder="Enter Password" required="required">
            <input type="submit" value="Login">
        </form>
        <center><h1><a href="index.html">Back</a></h1></center>
    </div>
</body>
</html>
