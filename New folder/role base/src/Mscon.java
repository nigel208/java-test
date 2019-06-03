import java.sql.*;

public class Mscon {

	public static void main(String[] args)  {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jproject", "root", "");
				System.out.println("bjb");
			Statement stmt=con.createStatement();
			ResultSet rs=stmt.executeQuery("select * from emp");
			
		
		} catch (Exception e) {
			System.out.println(e);
		}

	}

}
