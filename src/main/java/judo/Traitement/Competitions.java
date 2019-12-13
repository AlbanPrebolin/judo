package judo.Traitement;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Competitions implements InterfaceAction {

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) {
		
		return "competitions.jsp";
	}

}
