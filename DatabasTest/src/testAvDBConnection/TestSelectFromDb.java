package testAvDBConnection;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TestSelectFromDb {

	
	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		Connection cn = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		try{
		cn = DBUtil.getConnection();
		stmt = cn.createStatement(
				ResultSet.TYPE_SCROLL_INSENSITIVE, 
				ResultSet.CONCUR_READ_ONLY);
		rs = stmt.executeQuery("select * from test");
		while (rs.next())
			System.out.println(rs.getString("name")+ " : "+ rs.getString("place"));
		rs.last();
		System.out.println("Total nr of rows "+rs.getRow());
		
		}catch (SQLException e){
			System.out.println(e.toString());//e.printStackTrace();
		}
		finally{
			cn.close();
		}
	}

}
