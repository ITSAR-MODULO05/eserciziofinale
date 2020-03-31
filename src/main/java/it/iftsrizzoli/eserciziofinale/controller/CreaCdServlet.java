package it.iftsrizzoli.eserciziofinale.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import it.iftsrizzoli.eserciziofinale.domain.CompactDisc;
import it.iftsrizzoli.eserciziofinale.model.GestioneCDService;
import it.iftsrizzoli.eserciziofinale.model.GestioneCDServiceImpl;

/**
 * Servlet implementation class CreaCdServlet
 */
@WebServlet(urlPatterns = "/creacd", name = "MostraDataOraServlet")
public class CreaCdServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static final Logger logger = LoggerFactory.getLogger(CreaCdServlet.class);

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public CreaCdServlet() {
		super();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		logger.debug("Nel metodo doPost");
		String titolo = request.getParameter("titolo");
		String autore = request.getParameter("autore");
		CompactDisc cd = new CompactDisc(titolo, autore);
		RequestDispatcher dispatcher = null;
		GestioneCDService service = new GestioneCDServiceImpl();
		HttpSession session = request.getSession();
		if(service.addCD(cd).isResult()) {
			dispatcher = request.getRequestDispatcher("AddCD.jsp");
		}else {
			dispatcher = request.getRequestDispatcher("AddCDError.jsp");
		}
		session.setAttribute("cd", cd);
		response.sendRedirect("/eserciziofinale/VisualizzaCd.jsp");
		//dispatcher.forward(request, response);

	}

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request, response);
	}

}
