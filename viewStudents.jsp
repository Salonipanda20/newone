<%@page import="com.resultmanagement.model.Student"%>
<%@page import="java.util.List"%>
<!DOCTYPE html>
<html>
<head>
    <title>Registered Students</title>
</head>
<body>
    <h2>Registered Students</h2>
    <table border="1">
        <thead>
            <tr>
                <th>Course</th>
                <th>Branch</th>
                <th>Roll No</th>
                <th>Name</th>
                <th>Father Name</th>
                <th>Gender</th>
            </tr>
        </thead>
        <tbody>
            <c:forEach var="student" items="${students}">
                <tr>
                    <td>${student.course}</td>
                    <td>${student.branch}</td>
                    <td>${student.rollNo}</td>
                    <td>${student.name}</td>
                    <td>${student.fatherName}</td>
                    <td>${student.gender}</td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
</body>
</html>
