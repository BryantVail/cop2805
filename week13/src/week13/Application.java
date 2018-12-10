package week13;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Application {
	
	
	

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		Connection connect = null;
		
		//load JDBC drover
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("Driver Loaded");
		
		//connect to database
		connect = new DriverManager.getConnection(
		
				"jdbc:mysql://localhost/eatSleepPrint"
		);
		System.out.println("Database connected");

	}

}
