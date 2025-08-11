package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.lang.ClassNotFoundException;

public class delete2 {
	
public static void main(String[] args) throws SQLException, ClassNotFoundException{
				//fetch the db url pass and username
				String dbURL = "jdbc:mysql://localhost:3306/companydb";
				
				String username = "root";
				
				String password = "Ramu@123";
				
				Class.forName("com.mysql.cj.jdbc.Driver");
				
				//load the my sql driver file
				Connection con = DriverManager.getConnection(dbURL,username,password);
				
				String sql = "DELETE FROM employees WHERE department = ?";
				
				PreparedStatement ps = con.prepareStatement(sql);
				
				ps.setString(1, "Sales");
				
				int rowsDeleted = ps.executeUpdate();

	            if (rowsDeleted > 0) {
	                System.out.println(rowsDeleted + " employee(s) from 'Sales' department deleted successfully");
	            } else {
	                System.out.println("No employees found in 'Sales' department");
	            }

	            con.close();
}
}
				