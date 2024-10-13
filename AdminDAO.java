package com.resultmanagement.model;

import com.resultmanagement.database.ConnectionProvider;
import com.resultmanagement.model.Admin;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class AdminDAO {
    public boolean validateAdmin(Admin admin) {
        boolean isValid = false;
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        
        try {
            con = ConnectionProvider.getCon();
            String query = "SELECT * FROM admin WHERE username = ? AND password = ?";
            ps = con.prepareStatement(query);
            ps.setString(1, admin.getUsername());
            ps.setString(2, admin.getPassword());
            rs = ps.executeQuery();

            if (rs.next()) {
                isValid = true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (rs != null) try { rs.close(); } catch (Exception e) { e.printStackTrace(); }
            if (ps != null) try { ps.close(); } catch (Exception e) { e.printStackTrace(); }
            if (con != null) try { con.close(); } catch (Exception e) { e.printStackTrace(); }
        }

        return isValid;
    }
}
