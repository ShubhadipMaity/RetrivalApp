package shubha.Util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class jdbcUtil {
	
	static {
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public static Connection getDbConnection() throws SQLException {
		
		String url="jdbc:mysql:// localhost:3306/shubha";
		String user="root";
		String password="1234";
		
		return DriverManager.getConnection(url,user,password);
	}
	
	public static void closeResources(ResultSet resultSet,Connection connection,Statement statement) throws SQLException {
		
		if(resultSet!=null)
			resultSet.close();
		
		if(connection!=null)
			connection.close();
		
		if(statement!=null)
			statement.close();
		
	}

}
