
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Enumeration;
import java.util.Hashtable;


public class Agenda {
	private String path = "c:\\agenda.obj";
	private Hashtable<String, Persona> agenda = null;
	
	public Agenda() throws IOException, ClassNotFoundException{
		//Recupera la información guardada en la agenda
		FileInputStream fi = null;
		ObjectInputStream oi = null;
		try{
			fi = new FileInputStream(path);
			oi = new ObjectInputStream(fi);
			agenda = (Hashtable<String, Persona>)oi.readObject();
		}
		catch(FileNotFoundException e){
			agenda = new Hashtable<String,Persona>();
		}
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
	
	public void guardar() throws IOException{
		//Guarda la información de la agenda en el fichero
		FileOutputStream fo = new FileOutputStream(path);
		ObjectOutputStream os = new ObjectOutputStream(fo);
		os.writeObject(agenda);
		os.close();
	}
}
