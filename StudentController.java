package com.resultmanagement.controller;


import java.io.IOException;

import com.resultmanagement.model.Student;
import com.resultmanagement.model.StudentDao;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/addStudent")
public class StudentController extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        // Retrieving form data from the request
        String course = request.getParameter("course");
        String branch = request.getParameter("branch");
        String rollNo = request.getParameter("rollNo");
        String name = request.getParameter("name");
        String fatherName = request.getParameter("fatherName");
        String gender = request.getParameter("gender");

        // Creating a Student object
        Student student = new Student(course, branch, rollNo, name, fatherName, gender);

        // Saving the student data using StudentDAO
        boolean isSuccess = StudentDao.addStudent(student);

        // Redirecting based on success or failure
        if (isSuccess) {
            response.sendRedirect("adminhome.jsp");
        } else {
            response.sendRedirect("error.jsp");  // Redirect to an error page if insertion fails
        }
    }
}