package judo.Traitement;

import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;

import javax.swing.Action;

public class ActionProvider {

	private static HashMap<String, Class<? extends InterfaceAction> > map = new HashMap<>();
	
	static {
		map.put("Accueil", Accueil.class);
		map.put("Login", Login.class);
		map.put("Logout", Logout.class);
		map.put("Competitions", Competitions.class);
	}
	
	public static final InterfaceAction   getAction(String action) {
		Class<? extends InterfaceAction> clazz = map.get(action);
		InterfaceAction traitement = null;
		if(action == null || "*".equals(action) ) {
			clazz = map.get("Accueil");
		}else {
			clazz = map.get(action);
		}
		
		if(clazz != null) {
			
				try {
					traitement = clazz.getDeclaredConstructor().newInstance();
				} catch (InstantiationException e) {				
					e.printStackTrace();
				} catch (IllegalAccessException e) {
			
					e.printStackTrace();
				} catch (IllegalArgumentException e) {
				
					e.printStackTrace();
				} catch (InvocationTargetException e) {
				
					e.printStackTrace();
				} catch (NoSuchMethodException e) {
					
					e.printStackTrace();
				} catch (SecurityException e) {
					
					e.printStackTrace();
				}
				
		}
		return traitement;
	}
	
}
