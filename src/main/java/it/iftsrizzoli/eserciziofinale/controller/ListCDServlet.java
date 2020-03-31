package it.iftsrizzoli.eserciziofinale.controller;

import java.io.IOException;
import java.util.List;

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
 * Servlet implementation class ListCDServlet
 */
@WebServlet(urlPatterns = "/ListCD", name = "ListCDServlet")
public class ListCDServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static Logger logger = LoggerFactory.getLogger(ListCDServlet.class);

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ListCDServlet() {
		super();
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		logger.debug("Nel metodo service");
		RequestDispatcher dispatcher = null;
		GestioneCDService service = new GestioneCDServiceImpl();
		List<CompactDisc> lista = service.getAllCD();
		logger.debug("Lista CD {}",lista);
		HttpSession session = request.getSession();
		session.setAttribute("listacd", lista);
		dispatcher = request.getRequestDispatcher("ListCD.jsp");
		dispatcher.forward(request, response);

	}

}
