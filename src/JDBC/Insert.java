package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.lang.ClassNotFoundException;

public class Insert {

	public static void main(String[] args) throws SQLException, ClassNotFoundException{
		//fetch the db url pass and username
		String dbURL = "jdbc:mysql://localhost:3306/2607wipro";
		
		String username = "root";
		
		String password = "Ramu@123";
	
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		//load the my sql driver file
		Connection con = DriverManager.getConnection(dbURL,username,password);
		
		String insertQuery = "insert into persons(personid, firstname , lastname, address, city)";
		PreparedStatement insertStmt = con.prepareStatement(insertQuery);
		insertStmt.setInt(1, 4554);
		insertStmt.setString(2, "pranavi");
		insertStmt.setString(3, "Gangineni");
		insertStmt.setString(4, "colony");
		insertStmt.setString(5, "Hyd");
		
		int rowsInserted = insertStmt.executeUpdate();
		System.out.println(rowsInserted + "row(s)inserted.\n");
		con.close();
	}
}
		
		
		
		
		
		
		
		