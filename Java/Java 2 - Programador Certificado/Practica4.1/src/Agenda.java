import java.util.Enumeration;
import java.util.Hashtable;


public class Agenda {
	private Hashtable<String, Persona> agenda = null;
	
	public Agenda(){
		agenda = new Hashtable<String,Persona>();
	}
	
	public boolean agregar(String dni, String nom, long tel){
		boolean nuevo = false;
		
		if(!agenda.containsKey(dni)){
			agenda.put(dni, new Persona(dni, nom , tel));
			nuevo = true;
		}
		
		return nuevo;
		
	}
	
	public void eliminar(String dni){
		agenda.remove(dni);
	}
	
	public Persona recuperar(String dni){
		Persona persona = null;
		
		if(agenda.containsKey(dni)){
			persona = agenda.get(dni);
		}
		
		return persona;
	}
	
	public Enumeration<Persona> total(){
		return agenda.elements();
	}
	
}
