import java.util.Scanner;
import java.io.*;

public class prob8{
	public static void print_Subsets(int n){
		int [] array = new int[n];
		for(int i = 0; i < n; i++){
			array[i] = i;
		}
		long power_set_size = (long)Math.pow(2, array.length);
		for(int y = 0; y < power_set_size; y++){
			for(int z = 0; z < array.length; z++){
				if((y & (1 << z)) > 0){
					System.out.print(array[z]+ " ");
				}
			}
			System.out.println();
			
		}
	}

	public static void main(String[] args) throws FileNotFoundException{
		File input = new File("input");
		Scanner scnr = new Scanner(input);
		while(scnr.hasNextInt()){
			int num = scnr.nextInt();
			print_Subsets(num);
		}
	}
}














