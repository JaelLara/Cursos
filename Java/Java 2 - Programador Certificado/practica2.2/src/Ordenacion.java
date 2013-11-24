
public class Ordenacion {

	public static void main(String[] args){
		int[] vector = {5, 8, 1, 2, 7, 9, 3, 4, 6, 0};
		System.out.print("Vector sin ordenar: ");
		for(int i = 0; i < vector.length; i++){
			System.out.print(vector[i]);
			if(i == vector.length - 1){
				continue;
			}
			System.out.print(",");
		}
		
		System.out.println();
		
		vector = ordenar(vector);
		
		System.out.print("Vector sin ordenar: ");
		for(int i = 0; i < vector.length; i++){
			System.out.print(vector[i]);
			if(i == vector.length - 1){
				continue;
			}
			System.out.print(",");
		}
	}
	
	public static int[] ordenar(int[] vector){
		
		int aux = 0;
		
		for(int i = 0; i < vector.length; i++){
			for(int j = 0; j < (vector.length - 1); j++){
				if(vector[j+1] < vector[j]){
					aux = vector[j+1];
					vector[j+1] = vector[j];
					vector[j] = aux;
				}
			}
		}
		
		return vector;
	}
}
