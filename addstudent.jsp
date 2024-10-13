<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Add Student</title>
</head>
<body>
    <h2>Add Student</h2>
    
    <!-- Student registration form -->
    <form action="${pageContext.request.contextPath}/addStudent" method="post">
        <label>Course:</label>
        <input type="text" name="course" required><br><br>

        <label>Branch:</label>
        <input type="text" name="branch" required><br><br>

        <label>Roll No:</label>
        <input type="text" name="rollNo" required><br><br>

        <label>Name:</label>
        <input type="text" name="name" required><br><br>

        <label>Father's Name:</label>
        <input type="text" name="fatherName" required><br><br>

        <label>Gender:</label>
        <select name="gender" required>
            <option value="Male">Male</option>
            <option value="Female">Female</option>
        </select><br><br>

        <input type="submit" value="Add Student">
    </form>
    
</body>
</html>
