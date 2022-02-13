/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package myfirst;
import java.sql.*;
import java.util.*;
/**
 *
 * @author rushi
 */
public class second {
     public static void main(String[] args) throws Exception 
     {
   
    Class.forName("org.sqlite.JDBC");
    Connection con=DriverManager.getConnection("jdbc:sqlite:movie.db");
    Statement stm=con.createStatement();
    ResultSet rs=stm.executeQuery("select * from movie");
    
    int srno;
    String moviename;
    String actorname;
    String actoressname;
    int year;
    String director;
    
    while(rs.next()){
       srno=rs.getInt("roll");
       moviename=rs.getString("moviename");
       actorname=rs.getString("actorname");
       actoressname=rs.getString("actoressname");
       year=rs.getInt("year");
       director=rs.getNString("director");
       System.out.println(srno +" "moviename +" "+actorname+" "+actoressname+ " "+year+ " "+ director);
    }
     
    stm.executeupdate("select * from movie where actorname='shahrukhkhan'");
    while(rs.next()){
       srno=rs.getInt("roll");
       moviename=rs.getString("moviename");
       actorname=rs.getString("actorname");
       actoressname=rs.getString("actoressname");
       year=rs.getInt("year");
       director=rs.getNString("director");
       System.out.println(srno +" "moviename +" "+actorname+" "+actoressname+ " "+year+ " "+ director);
      }
    
    }   
}