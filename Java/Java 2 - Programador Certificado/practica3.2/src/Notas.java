import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import static java.lang.Math.*;

public class Notas {

	public static void main(String[] args) throws IOException{
		double max = 0.0;
		double min = 0.0;
		double avg = 0.0;
		int count = 0;
		double qualify = 0.0;
		double total = 0.0;
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
	
		for(;;){
			System.out.print("Introduzca una nota :");
			qualify =  Double.parseDouble(bf.readLine());
			if(qualify < 0){
				break;
			}
			else{
				if(qualify <= 10 && qualify >= 0){
					count++;
					
					max = max(max,qualify);
					
					min = min(min,qualify);
					
					total += qualify;
					
					avg = round(total / count);
					
				}
				else{
					System.out.print("Introducir notas entre 0 y 10");
				}
			}
			System.out.println();
		}

		System.out.println("Total notas introducidas: " + count);
		System.out.println("Nota Maxima: " + max);
		System.out.println("Nota Mínima: " + min);
		System.out.println("Nota Media: " + avg);
		
	}

}
