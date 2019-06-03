package login.test;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/LoginRegister")
public class LoginRegister extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public LoginRegister() {
		super();
		// TODO Auto-generated constructor stub
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) {
		custd d = new CustDimp();
		String una = request.getParameter("uname");
		String pas = request.getParameter("pass");
		String typ = request.getParameter("subm");
		cust c = d.getCust(una, pas);
		try {

			if (typ.equals("login") && c != null && c.getName() != null) {
				request.setAttribute("message", c.getName());
				request.getRequestDispatcher("welcome.jsp").forward(request, response);
			} else if (typ.equals("regis")) {
				c.setUname(una);
				c.setPass(pas);
				String mnam = request.getParameter("mname");
				c.setName(mnam);
				d.insCus(c);
				request.setAttribute("sucm", "reg done sign in");
				request.getRequestDispatcher("index.jsp").forward(request, response);
			} else
				request.setAttribute("message", "Data not found REGISTER ");
			request.getRequestDispatcher("index.jsp").forward(request, response);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
