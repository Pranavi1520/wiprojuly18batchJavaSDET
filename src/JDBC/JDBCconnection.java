package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.SQLException;
import java.lang.ClassNotFoundException;

public class JDBCconnection {

	public static void main(String[] args) throws SQLException, ClassNotFoundException{
		//fetch the db url pass and username
		String dbURL = "jdbc:mysql://localhost:3306/studentrepo";
		
		String username = "root";
		
		String password = "Ramu@123";
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		//load the my sql driver file
		Connection con = DriverManager.getConnection(dbURL,username,password);
		
		//create the statment
		Statement st = con.createStatement();
		
		//execute quries
		String selectquery = "select * from Table1";
		
		//pass the selectquery
		ResultSet rs = st.executeQuery(selectquery);
		
		//result set in jdbc
		
		while(rs.next()) {
			
            //System.out.println(rs.getString("StudentID"));
            //System.out.println(rs.getString("StudentName"));
			int colCount = rs.getMetaData().getColumnCount();

            for (int i = 1; i <= colCount; i++) {
            	
                String colValue = rs.getString(i);
                
                String colName = rs.getMetaData().getColumnName(i);
                
                System.out.print(colName + ":" );
                
                System.out.print(colValue + "  ");
            }
            System.out.println(); 
		}
	}
}


