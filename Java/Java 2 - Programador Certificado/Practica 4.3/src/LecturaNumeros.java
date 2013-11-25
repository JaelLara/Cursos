import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

public class LecturaNumeros extends BufferedReader {
	
	public LecturaNumeros(){
		super(new InputStreamReader(System.in));
	}
	
	public LecturaNumeros(Reader arg0) {
		super(arg0);
		// TODO Auto-generated constructor stub
	}

	public int readInt() throws IOException{
		return Integer.parseInt(this.readLine());
	}
	
	public int readInt(String s) throws IOException{
		System.out.println(s);
		return Integer.parseInt(this.readLine());
	}
	
	public Integer readInteger() throws IOException{
		return new Integer(this.readLine());
	}
	
	public double readDouble() throws IOException{
		return Double.parseDouble(this.readLine());
	}
	
	public double readDouble(String s) throws IOException{
		System.out.println(s);
		return Double.parseDouble(this.readLine());
	}
	
}
