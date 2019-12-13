package judo.Traitement;

import java.io.IOException;

import javax.servlet.SessionCookieConfig;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Logout implements InterfaceAction{

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) {		
		request.getSession().invalidate();	
		return "accueil.jsp";
	}

}
