package judo.Traitement;

import java.net.http.HttpHeaders;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface InterfaceAction {
	
	String execute (HttpServletRequest request, HttpServletResponse response );
}
