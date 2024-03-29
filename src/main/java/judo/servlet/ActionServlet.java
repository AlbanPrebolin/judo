package judo.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import judo.Traitement.ActionProvider;
import judo.Traitement.InterfaceAction;

/**
 * Servlet implementation class Action
 */
public class ActionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ActionServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String action = request.getPathInfo().substring(1);
		
		
		
		ServletContext context = getServletContext();
		RequestDispatcher dispatch = null;
		
		InterfaceAction actionProvider = ActionProvider.getAction(action);
		
		String page = actionProvider.execute(request, response);
		
		request.setAttribute("page", page);

	
		dispatch = context.getRequestDispatcher("/WEB-INF/jsp/templateJudo.jsp");
		
		
		if (dispatch != null) {
			dispatch.forward(request, response);
		}
		
		
		response.getWriter().append(action);
		
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
