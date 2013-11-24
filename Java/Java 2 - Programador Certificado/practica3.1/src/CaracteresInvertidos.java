
public class CaracteresInvertidos {
	
	public static void main(String[] args){
		String text = args[0];
		System.out.println("Texto Original: " + text);
		System.out.print("Texto invertido: ");
		
		for(int i = text.length()-1; i >= 0; i--){
			System.out.print(text.charAt(i));
		}
		
	}
	
}
