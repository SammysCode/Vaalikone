package app;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.Dao;

/**
 * Servlet implementation class DeleteCandidate
 */
@WebServlet("/DeleteCandidate")
public class DeleteCandidate extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private Dao dao = null;

	@Override
	public void init() {
		// database connection
		dao = new Dao("jdbc:mysql://135.181.156.254:3306/voting_db", "dogetomoon", "D4jmd6r7h7MF2aUK");
	}

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public DeleteCandidate() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		HttpSession session = request.getSession();

//String id = "3"; // delete this line, and uncomment next one to get sessions working.
 String id = String.valueOf(session.getAttribute("politicID"));

		System.out.println(id);

		if (dao.getConnection()) {
			dao.deleteCandidate(id);
		} else {
			System.out.println("No connection to database");
		}

		// kill session, because user is deleted and directed to homepage
		if (session != null) {
			session.invalidate();
		}

		// Redirect into homepage
		response.sendRedirect("/jsp/intro.jsp");

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request, response);

	}

}
