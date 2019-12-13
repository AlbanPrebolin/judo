package judo.Traitement;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface InterfaceAction {
	
	String execute (HttpServletRequest request, HttpServletResponse response );
}
