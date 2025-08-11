package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.SQLException;
import java.lang.ClassNotFoundException;

public class Preparedstatement {

	public static void main(String[] args) throws SQLException, ClassNotFoundException{
		//fetch the db url pass and username
		String dbURL = "jdbc:mysql://localhost:3306/2607wipro";
		
		String username = "root";
		
		String password = "Ramu@123";
	
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		//load the my sql driver file
		Connection con = DriverManager.getConnection(dbURL,username,password);
		
		//create the statment
		Statement st = con.createStatement();
		
		//execute quries
		String selectquery = "select * from persons where FirstName=?";
		
		//set parameters for 1
		PreparedStatement ps = con.prepareStatement(selectquery);
		
		//ps.setString(1,"ravi");
		ps.setString(1,"Ramya");
		
		ResultSet rs = ps.executeQuery();
		
		while(rs.next()) {
			
			System.out.println(rs.getString("FirstName"));
			System.out.println(rs.getString("LastName"));
		}
		
	    //set parameters for 2
		
		String query1 = "select * from persons where FirstName='Ravi' and personId = '5667'";
	    
	    String query2 = "select * from persons where FirstName=? and personId = ? ";
	    
	    
	    Preparedstatement ps1 = (Preparedstatement) con.prepareStatement(query2);
	    
	    ((PreparedStatement) ps1).setString(1,"Ravi");
	    ((PreparedStatement) ps1).setInt(2,5667);
	    
	    ResultSet rs1 = ((PreparedStatement) ps1).executeQuery();
	    
	    while(rs1.next()) {
	    	
	    	System.out.println(rs1.getString("Address"));
	    	System.out.println(rs1.getString("LastName"));
	    	System.out.println(rs1.getString("City"));
	    }
	    
	    //Insert the data
	    String S1 = "INSERT INTO persons (FirstName, LastName, Address, City)";
	    String S2 = "INSERT INTO persons (?,?,?,?)";
	    
	    PreparedStatement ps2 = con.prepareStatement(S2);
        
	    ps2.setString(1, "Priya");
	    ps2.setString(2, "rohan");
	    ps2.setString(3, "Srinagar");
	    ps2.setString(4, "Mumbai");
	    
        ResultSet rs2 = ((PreparedStatement) ps2).executeQuery();
	    
	    while(rs1.next()) {
	    	
	    	System.out.println(rs2.getString("FirstName"));
	    	System.out.println(rs2.getString("LastName"));
	    	System.out.println(rs2.getString("Address"));
	    	System.out.println(rs2.getString("City"));
	    }
	   
	
	}  
}