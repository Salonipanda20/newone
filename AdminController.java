package com.resultmanagement.controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.resultmanagement.model.Result;
import com.resultmanagement.database.ConnectionProvider;
import com.resultmanagement.model.Student;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class AdminController extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");

        if ("viewStudents".equals(action)) {
            List<Student> students = getAllStudents();
            request.setAttribute("students", students);
            RequestDispatcher dispatcher = request.getRequestDispatcher("viewStudents.jsp");
            dispatcher.forward(request, response);
        } else if ("viewResults".equals(action)) {
            List<Result> results = getAllResults();
            request.setAttribute("results", results);
            RequestDispatcher dispatcher = request.getRequestDispatcher("viewResults.jsp");
            dispatcher.forward(request, response);
        }
    }

    private List<Student> getAllStudents() {
        List<Student> students = new ArrayList<>();
        try (Connection con = ConnectionProvider.getCon()) {
            PreparedStatement ps = con.prepareStatement("SELECT * FROM student");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Student student = new Student();
                student.setCourse(rs.getString("course"));
                student.setBranch(rs.getString("branch"));
                student.setRollNo(rs.getString("rollNo"));
                student.setName(rs.getString("name"));
                student.setFatherName(rs.getString("fatherName"));
                student.setGender(rs.getString("gender"));
                students.add(student);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return students;
    }

    private List<Result> getAllResults() {
        List<Result> results = new ArrayList<>();
        try (Connection con = ConnectionProvider.getCon()) {
            PreparedStatement ps = con.prepareStatement("SELECT * FROM result");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Result result = new Result();
                result.setRollNo(rs.getString("rollNo"));
                result.setPhysics(rs.getString("physics"));
                result.setChemistry(rs.getString("chemistry"));
                result.setSpringBoot(rs.getString("springBoot"));
                result.setAdvancedJava(rs.getString("advancedJava"));
                result.setSkill(rs.getString("skill"));
                results.add(result);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return results;
    }
}