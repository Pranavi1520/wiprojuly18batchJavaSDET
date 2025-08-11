package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.lang.ClassNotFoundException;

public class emp {
		
public static void main(String[] args) throws SQLException, ClassNotFoundException{
					//fetch the db url pass and username
					String dbURL = "jdbc:mysql://localhost:3306/companydb";
					
					String username = "root";
					
					String password = "Ramu@123";
					
					Class.forName("com.mysql.cj.jdbc.Driver");
					
					//load the my sql driver file
					Connection con = DriverManager.getConnection(dbURL,username,password);
					
					String sql = "UPDATE employees SET salary = ? WHERE id = ?";
					
					PreparedStatement ps = con.prepareStatement(sql);
					
					ps.setDouble(1, 70000); 
		            ps.setInt(2, 102);
		            
		            int rowsAffected = ps.executeUpdate();

		            if (rowsAffected > 0) {
		                System.out.println("Employee salary updated successfully.");
		            } else {
		                System.out.println("No employee found with ID 102.");
		            }
		            
		            con.close();

	}
}
		            
		            
		            
		            
		            
		            
		            