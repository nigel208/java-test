package login.test;

import java.sql.*;
import java.sql.DriverManager;

public class ConProvider implements MyProvider {
	static Connection con = null;

	public static Connection getCon() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection(conurl, username, pass);
			System.out.println("working gc");
		} catch (Exception e) {
			System.out.println(e+"/*/*/*/*/");
		}
		return con;
	}

}
