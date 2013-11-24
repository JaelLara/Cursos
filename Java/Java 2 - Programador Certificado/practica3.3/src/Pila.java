import java.util.ArrayList;


public class Pila <E>{
	
	private ArrayList<E> pila = new ArrayList<E>();
	
	public void agregar(E cadena){
		if(!pila.contains(cadena)){
			pila.add(cadena);
		}
	}
	
	public void quitar(){
		pila.remove(total()-1);
	}
	
	public int total(){
		return pila.size();
	}
	
	public E obtener(int posicion){
		return pila.get(posicion);
	}
}
