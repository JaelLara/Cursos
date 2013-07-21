/*
 *  Ejercicio 3.1
 *  
 *  Un sencillo sistema de ayuda
 */
public class Help {

	public static void main(String[] args) 
		throws java.io.IOException{
		
		char choice;
		
		System.out.println("Help on: ");
		System.out.println(" 1. if");
		System.out.println(" 2. switch");
		System.out.print("Choose one: ");
		choice = (char) System.in.read();
		
		System.out.println("\n");
		
		switch(choice){
			case '1':
				System.out.println("The if:\n");
				System.out.println("if(condition) statement;");
				System.out.println("else statement;");
				break;
			case '2':
				System.out.println("The switch:\n");
				System.out.println("switch(expression) {");
				System.out.println("\tcase constant:");
				System.out.println("\t\tstatement sequence");
				System.out.println("\t\tbreak;");
				System.out.println("\t//...");
				System.out.println("}");
				break;
			default:
				System.out.println("Selection not found.1");
		}
	}

}
