package testAvDBConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {
	
	public static String userName = "root";
	public static String passWord = "root";
	public static String dbUrl = 
			//"jdbc:mysql://localhost:3306/testdb";
			"jdbc:mysql://localhost:3306/testdb?"
			+"autoReconnect=true&useSSL=false";
	public static Connection getConnection() throws SQLException{
		return DriverManager.getConnection(dbUrl, userName, passWord);
	}
	

}
