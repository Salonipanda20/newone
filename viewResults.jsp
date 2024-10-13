<%@page import="com.resultmanagement.model.Result"%>
<%@page import="java.util.List"%>
<!DOCTYPE html>
<html>
<head>
    <title>Student Results</title>
</head>
<body>
    <h2>Student Results</h2>
    <table border="1">
        <thead>
            <tr>
                <th>Roll No</th>
                <th>Physics</th>
                <th>Chemistry</th>
                <th>Spring Boot</th>
                <th>Advanced Java</th>
                <th>Skill</th>
            </tr>
        </thead>
        <tbody>
            <c:forEach var="result" items="${results}">
                <tr>
                    <td>${result.rollNo}</td>
                    <td>${result.physics}</td>
                    <td>${result.chemistry}</td>
                    <td>${result.springBoot}</td>
                    <td>${result.advancedJava}</td>
                    <td>${result.skill}</td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
</body>
</html>
