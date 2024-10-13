package com.resultmanagement.controller;

import com.resultmanagement.model.AdminDAO;
import com.resultmanagement.model.Admin;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/AdminLoginController")
public class AdminLoginController extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Get the username and password from the request
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        // Create an Admin object and set the values
        Admin admin = new Admin();
        admin.setUsername(username);
        admin.setPassword(password);

        // Create an instance of AdminDAO and validate the admin
        AdminDAO adminDAO = new AdminDAO();
        boolean isValid = adminDAO.validateAdmin(admin);

        if (isValid) {
            // If valid, forward to admin home
            RequestDispatcher dispatcher = request.getRequestDispatcher("adminhome.jsp");
            dispatcher.forward(request, response);
        } else {
            // If invalid, forward to error page
            RequestDispatcher dispatcher = request.getRequestDispatcher("errorAdminLogin.html");
            dispatcher.forward(request, response);
        }
    }
}
