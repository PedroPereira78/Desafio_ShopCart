package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.DAO;
import model.JavaBeans;

/**
 * Servlet implementation class Controller
 */
@WebServlet(urlPatterns = { "/Controller", "/main", "/insert" })
public class Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;
	DAO dao = new DAO();

	JavaBeans registo = new JavaBeans();
	
	public Controller() {
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
		// response.getWriter().append("Served at: ").append(request.getContextPath());
		String action = request.getServletPath();
		System.out.println(action);

		if (action.equals("/main")) {
			registos(request, response);

		} else if (action.equals("/insert")) {
			novoRegisto(request, response);
		}else {
			response.sendRedirect("/index.html");
		}
		
		
		// Teste Conexao
		/* dao.testeConexao(); */
	}
	// Lista Registos

	protected void registos(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.sendRedirect("registo.jsp");

	}
	//Novo registo
	protected void novoRegisto(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//teste dados formulario
		System.out.println(request.getParameter("nome"));
		System.out.println(request.getParameter("telemovel"));
		System.out.println(request.getParameter("email"));

	}
}
