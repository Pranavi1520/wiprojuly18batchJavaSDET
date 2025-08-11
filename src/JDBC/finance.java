package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.lang.ClassNotFoundException;

public class finance {
	
public static void main(String[] args) throws SQLException, ClassNotFoundException{
				//fetch the db url pass and username
				String dbURL = "jdbc:mysql://localhost:3306/companydb";
				
				String username = "root";
				
				String password = "Ramu@123";
				
				Class.forName("com.mysql.cj.jdbc.Driver");
				
				//load the my sql driver file
				Connection con = DriverManager.getConnection(dbURL,username,password);
				
				String sql = "UPDATE employees SET department = ? WHERE name = ?";

				PreparedStatement ps = con.prepareStatement(sql);
				
				ps.setString(1, "Finance"); 
	            ps.setString(2, "Alice");
	            
	            int rowsUpdated = ps.executeUpdate();

	            if (rowsUpdated > 0) {
	                System.out.println("Department updated successfully for Alice.");
	            } else {
	                System.out.println("No employee named Alice found.");
	            }

	            con.close();
	            
}
}
	            
	            
	            
