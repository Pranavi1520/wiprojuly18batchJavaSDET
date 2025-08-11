package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.lang.ClassNotFoundException;

public class depart {
	
public static void main(String[] args) throws SQLException, ClassNotFoundException{
				//fetch the db url pass and username
				String dbURL = "jdbc:mysql://localhost:3306/companydb";
				
				String username = "root";
				
				String password = "Ramu@123";
				
				Class.forName("com.mysql.cj.jdbc.Driver");
				
				//load the my sql driver file
				Connection con = DriverManager.getConnection(dbURL,username,password);
				
		        String sql = "SELECT * FROM employees WHERE department = ?";
        
                PreparedStatement ps = con.prepareStatement(sql);
                ps.setString(1, "IT"); 
        
                ResultSet rs1 = ps.executeQuery();
        
                while (rs1.next()) {
        	
        	    System.out.println(rs1.getString("department"));
	}

}
}
