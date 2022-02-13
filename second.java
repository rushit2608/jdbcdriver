/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package myfirst;
import java.sql.*;
/**
 *
 * @author rushi
 */
public class second {
     public static void main(String[] args) throws ClassNotFoundException, SQLException{
   
    Class.forName("org.sqlite.JDBC");
    Connection con=DriverManager.getConnection("jdbc:sqlite:movie.db");
    Statement stm=con.createStatement();
    ResultSet rs=stm.executeQuery("select * from movie");
    
    int rollno;
    String name;
    
    while(rs.next()){
       rollno=rs.getInt("roll");
       name=rs.getString("name");
       
       System.out.println(rollno +" "+name);
    }
     }   
}
