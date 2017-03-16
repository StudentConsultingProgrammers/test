package testAvDBConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TestMySQLConnection {
	public static String userName = "root";
	public static String passWord = "root";
	public static String dbUrl = 
			"jdbc:mysql://localhost:3306/test2";
	
	
	public TestMySQLConnection(){
		
		//en tom konstruktor från scErikL user..
	}
	
	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		Connection cn = null;
		try {
			cn = DriverManager.getConnection(dbUrl, userName, passWord);
			System.out.println("Established connection to db");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally{
			if (cn!=null)
				cn.close();
		}
		

	}

}
