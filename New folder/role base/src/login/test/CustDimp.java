package login.test;

import java.sql.*;

public class CustDimp implements custd {
	static Connection con;
	static PreparedStatement p;

	@Override

	public int insCus(cust c) {
		// TODO Auto-generated method stub
		int status = 0;
		try {
			con = ConProvider.getCon();
			p = con.prepareStatement("insert into customer value(?,?,?)");
			p.setString(1, c.getName());
			p.setString(2, c.getUname());
			p.setString(3, c.getPass());
			status=p.executeUpdate();
			System.out.println("worksd");
			con.close();
		} catch (Exception e) {
			System.out.println(e);
		}
		return status;
	}

	@Override

	public cust getCust(String uname, String pass) {
		// TODO Auto-generated method stub
		cust c = new cust();
		try {
			con = ConProvider.getCon();
			p = con.prepareStatement("select * from customer where uname=? and pass=? ");
			p.setString(1, uname);
			p.setString(2, pass);

			ResultSet rs = p.executeQuery();
			while (rs.next()) {
				c.setName(rs.getString(1));
				c.setUname(rs.getString(2));
				c.setPass(rs.getString(3));
			}
		} catch (Exception e) {
			System.out.println(e);
		}
		return null;
	}

}
