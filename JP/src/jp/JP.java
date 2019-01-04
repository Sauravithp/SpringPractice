/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp;
import java.sql.*;
/**
 *
 * @author thapaniwas
 */
public class JP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException, ClassNotFoundException,NullPointerException ,InstantiationException, IllegalAccessException {
        String URL="jdbc:mysql://localhost:3306/person";
        String userName="root";
        String password="";
        String sql="update tbl_students set first_name='suprina' where student_id=?";
        
        
        Class.forName("com.mysql.jdbc.Driver");
        Connection conn = DriverManager.getConnection(URL, userName, password);
        System.out.println("Conn:::" + conn);
                      
//        Statement stmt=conn.createStatement();
//        ResultSet rs=stmt.executeQuery(sql);
//        while(rs.next()){
//            System.out.println(rs.getString("first_name"));
//        }

           CallableStatement pstmt=conn.prepareCall(sql);
           pstmt.setInt(1, 1);
           
            pstmt.executeUpdate();
        System.out.println("updated");

           
          
//        while(rs.next()){
//        String name=r3s.getString("first_name");
//            System.out.println(name);
//        }

pstmt.close();
conn.close();

    
    
}
}
