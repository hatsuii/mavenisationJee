package eu.ensup.jeeprojet.Servlet;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import eu.ensup.jeeprojet.domaine.User;
import eu.ensup.jeeprojet.service.UserService;

/**
 * Servlet implementation class MaServlet
 */
@WebServlet("/MaServlet")
public class MaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public MaServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		traitement(request,response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		traitement(request,response);
	}

	protected void traitement(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException {
		// 1: get information from formulaire
		String login = request.getParameter("loginuser");
		String pwd = request.getParameter("mdpuser");
		
		// 2: soumettre à la couche service
		
		User user = new User(login,pwd);
		
		// 3: renvoyer écran en fct de reponse
		RequestDispatcher dispatcher;
		UserService userServ = new UserService();
		try {
			userServ.enregistrerUtilisateur(user);
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		dispatcher = request.getRequestDispatcher("formulaireOK.jsp");
		
		/*if(("Cyril".equalsIgnoreCase(login))&&"monpote".equalsIgnoreCase(pwd)){
			dispatcher = request.getRequestDispatcher("formulaireOK.jsp");
			UserService userServ = new UserService();
			try {
				userServ.enregistrerUtilisateur(user);
			} catch (ClassNotFoundException | SQLException e) {
				e.printStackTrace();
			}
		} else {
			dispatcher = request.getRequestDispatcher("formulaireKO.jsp");
		}*/
		dispatcher.forward(request, response);
	}

}
