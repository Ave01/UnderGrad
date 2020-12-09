import java.util.Scanner;
import java.io.*;

class solution {
	
	public static void main(String[] args) {
		try {
			Scanner scan = new Scanner(new File("input"));
			printNPiDigits(scan.nextInt());
		}
		catch(Exception e) {
			System.out.println("Error: Could not find next int");;
		}
	}
	
	public static void printNPiDigits(int n) {
		System.out.println(
			n == 0 ? "3" : 
			n < 0 || n > 15 ? "Error: n less than 0 or greater than 15" : 
			("" + Math.PI).substring(0, 2 + n));
	}
}