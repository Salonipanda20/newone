package com.resultmanagement.model;


		import java.sql.Connection;
		import java.sql.PreparedStatement;
		import java.sql.SQLException;

import com.resultmanagement.database.ConnectionProvider;

		public class StudentDao {

		    // Method to add a student to the database
		    public static boolean addStudent(Student student) {
		        boolean status = false;
		        try {
		            // Get a connection from ConnectionProvider
		            Connection con = ConnectionProvider.getCon();

		            // SQL query to insert student data
		            String query = "INSERT INTO student (course, branch, rollNo, name, fatherName, gender) VALUES (?, ?, ?, ?, ?, ?)";
		            PreparedStatement pstmt = con.prepareStatement(query);
		            
		            // Setting parameters from the Student object
		            pstmt.setString(1, student.getCourse());
		            pstmt.setString(2, student.getBranch());
		            pstmt.setString(3, student.getRollNo());
		            pstmt.setString(4, student.getName());
		            pstmt.setString(5, student.getFatherName());
		            pstmt.setString(6, student.getGender());
		            
		            // Execute the update
		            int rows = pstmt.executeUpdate();
		            if (rows > 0) {
		                status = true;
		            }
		        } catch (SQLException e) {
		            e.printStackTrace();
		        }
		        return status;
		    }
		}
