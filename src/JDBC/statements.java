package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.lang.ClassNotFoundException;

public class statements {
	
public static void main(String[] args) throws SQLException, ClassNotFoundException{
				//fetch the db url pass and username
				String dbURL = "jdbc:mysql://localhost:3306/companydb";
				
				String username = "root";
				
				String password = "Ramu@123";
				
				Class.forName("com.mysql.cj.jdbc.Driver");
				
				//load the my sql driver file
				Connection con = DriverManager.getConnection(dbURL,username,password);
				
				String sql = "SELECT * FROM employees WHERE id = ?";
				
				PreparedStatement ps = con.prepareStatement(sql);
	            ps.setInt(1, 102); 
	            
	            ResultSet rs = ps.executeQuery();
	            
	            while (rs.next()) {
	            	
	            	System.out.println(rs.getString("id"));
				
	}

}
}

