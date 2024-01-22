package register;

import java.awt.print.Printable;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class regServlet
 */
@WebServlet("/regServlet")
public class regServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public regServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub

		String userName = request.getParameter("username");
		String userPass = request.getParameter("password");
		String contact = request.getParameter("contact");
		String age = request.getParameter("age");
		RequestDispatcher rd = null;

		PrintWriter out = response.getWriter();
		out.print(userName);
		out.print(userPass);
		out.print(age);
		out.print(contact);
		 
		try {
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3307/servproject", "root", null);
			String query = "insert into users (userName, userPass, contact, age) values (?,?,?,?)";
			PreparedStatement pStmt = con.prepareStatement(query);

			pStmt.setString(1, userName);
			pStmt.setString(2, userPass);
			pStmt.setString(3, contact);
			pStmt.setString(4, age);
			int count = pStmt.executeUpdate();
//			rd = request.getRequestDispatcher("login.jsp");
			if (count > 0) {
//				request.setAttribute("status", "success");
//				PrintWriter out = response.getWriter();
				out.print("logged in");
			} else {
//				request.setAttribute("status", "failed");
			}
//			rd.forward(request, response);
			con.close();

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} 
	}

}
