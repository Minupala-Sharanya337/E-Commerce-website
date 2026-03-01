
package Sample;


import java.util.*;


import java.sql.*;

import java.sql.Connection;

import java.sql.DriverManager;



import java.sql.ResultSet;

import java.sql.SQLException;

public class Sample {
    public static void main(String args[]) {
   
    	
    	try(
    	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/24wh1a0588","root","1234");
    	 Statement stmt=con.createStatement();
    	 ResultSet rs=stmt.executeQuery("Select* from Employee");
         ){ 
    	 while(rs.next()) {
    		 int empid=rs.getInt(1);
    		 String ename=rs.getString(2);
    		 System.out.println(empid+" "+ename);
    	 }
    	}
    
    	
    	 catch(SQLException e) {
    		 System.out.println("Error: "+e.getMessage());
    	 }
    
    	
        }
    }




