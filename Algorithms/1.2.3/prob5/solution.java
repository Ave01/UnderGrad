import java.time.LocalDate;
import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;
import java.io.*;
import java.util.Scanner;

public class solution {
	
	static Scanner scan;
	static PrintWriter writer;
	static ArrayList<LocalDate> d;
	
	public static void main(String[] args) {
		try {
			scan = new Scanner(new File("input"));
			writer = new PrintWriter("output", "UTF-8");
			d = new ArrayList<LocalDate>();
			while(scan.hasNextLine()) {
				LocalDate date = LocalDate.of(scan.nextInt(), scan.nextInt(), scan.nextInt());
				d.add( date );
				System.out.println(date);
			}
			outputSortedDates(d);
		}
		catch(Exception e){
			System.out.println("Error reading files");
		}
	}
	
	public static void outputSortedDates(ArrayList<LocalDate> dates) {
		writer.println("Sorted by month:");
		dates.stream().sorted((d1, d2) -> d1.getMonth().compareTo(d2.getMonth())).forEach(d -> writer.println(d.toString()));
		
		writer.println("\nSorted by day:");
		dates.stream().sorted((d1, d2)-> new Integer(d1.getDayOfMonth()).compareTo(d2.getDayOfMonth())).forEach(d -> writer.println(d.toString()));
		
		writer.println("\nSorted by age:");
		dates.stream().sorted((d1, d2) -> new Long(d1.toEpochDay()).compareTo(d2.toEpochDay())).forEach(d -> writer.println(d.toString()));
		
		System.out.println("Done");
		writer.close();
	}
}