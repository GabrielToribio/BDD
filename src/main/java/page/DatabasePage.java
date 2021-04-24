package page;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabasePage {

	public static String getData(String columnName) throws ClassNotFoundException, SQLException{
		//Setting mySql properties
		Class.forName("com.mysql.cj.jdbc.Driver");
		String sqlUrl = "jdbc:mysql://127.0.0.1:3306/january2021";
		String userName = "root";
		String password = "root";
		String query = "select * from users";
		
		//Creating a connection to local database
		Connection conn = DriverManager.getConnection(sqlUrl, userName, password);
		//Empowering the conn ref. variable to execute queries
		Statement smt = conn.createStatement();
		//Delivering query
		ResultSet rs = smt.executeQuery(query);
		while(rs.next()) {
			return rs.getString(columnName);
		}
		
		
		return columnName;
		
	}
	
}
