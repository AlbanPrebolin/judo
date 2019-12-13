package judo.Traitement;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Login implements InterfaceAction {
	
	private  String psd = "OK";

	public String execute(HttpServletRequest request, HttpServletResponse response) {
		String mdpuser = request.getParameter("password");

		if (psd.equals(mdpuser)) {
			
			String username = request.getParameter("username");
			request.getSession().setAttribute("login" , username);
			
		}
		return "accueil.jsp";
		
	}
}
