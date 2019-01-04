/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.f1soft.jdbcprac;
import java.sql.*;
/**
 *
 * @author thapaniwas
 */
public class Program {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
       String URL="jdbc:mysql://localhost:3306/person";
       String userName="root";
       String password="";
       String sql="delete from employee where employee_id=?";
        String sql1="select * from employee";        
       Class.forName("com.mysql.jdbc.Driver");
       Connection conn=DriverManager.getConnection(URL, userName, password);
        System.out.println("--------Connected------------------");
        
        PreparedStatement pstmt=conn.prepareStatement(sql);
        pstmt.setInt(1, 1);
        pstmt.executeUpdate();
        
        PreparedStatement stmt=conn.prepareCall(sql1);
        ResultSet rs=stmt.executeQuery();
        while(rs.next()){
            System.out.println(rs.getString("first_name"));
        }
        
        
        pstmt.close();
        conn.close();
        
       
    }
    
}
