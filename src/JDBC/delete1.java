package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.lang.ClassNotFoundException;

public class delete1 {
	
public static void main(String[] args) throws SQLException, ClassNotFoundException{
				//fetch the db url pass and username
				String dbURL = "jdbc:mysql://localhost:3306/companydb";
				
				String username = "root";
				
				String password = "Ramu@123";
				
				Class.forName("com.mysql.cj.jdbc.Driver");
				
				//load the my sql driver file
				Connection con = DriverManager.getConnection(dbURL,username,password);
				
				String sql = "DELETE FROM employees WHERE id = ?";
				
				PreparedStatement ps = con.prepareStatement(sql);
				
				ps.setInt(1, 103);
				
				int rowsDeleted = ps.executeUpdate();

	            if (rowsDeleted > 0) {
	                System.out.println("Employee with ID 103 deleted successfully");
	            } else {
	                System.out.println("No employee found with ID 103");
	            }
	            
	            con.close();
}
}
				