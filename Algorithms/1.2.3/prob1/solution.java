import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;

public class solution{
	public static void main(String[] args) throws FileNotFoundException{
		File file = new File("input");
		Scanner kb = new Scanner(file);
	
		while(kb.hasNextDouble()){
			double d = kb.nextDouble();
			System.out.printf("%7.3f\n", d);
	
		}	
	}	
}
