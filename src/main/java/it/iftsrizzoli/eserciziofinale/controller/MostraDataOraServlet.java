package it.iftsrizzoli.eserciziofinale.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Servlet implementation class MostraDataOraServlet
 */
@WebServlet(urlPatterns = "/dataora", name = "MostraDataOraServlet")
public class MostraDataOraServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static final Logger logger = LoggerFactory.getLogger(MostraDataOraServlet.class);

    /**
     * Default constructor. 
     */
    public MostraDataOraServlet() {
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		logger.debug("Nel metodo service");
		 response.setContentType("text/html");
		 PrintWriter pw = response.getWriter();
         java.util.Date date = new java.util.Date();
         pw.println("<h2>"+"Data e ora corrente: " +date.toString()+"</h2>");
         pw.close();
	}

}
