import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;

class solution{
	public static void main(String [] args) throws FileNotFoundException{
		File file = new File("input");
		Scanner sc = new Scanner(file);
		String s = sc.next();
		char a[] = s.toCharArray();
		printPerm(a, 0, a.length);
	}

	public static void printPerm(char [] a, int start, int end){
		if(start == end){
			System.out.println(new String(a));
		}
		else {
			for(int i = start; i<end;i++){
				swap(a,start, i);
				printPerm(a, start + 1, end);
				swap(a, start, i);
			}
		}
	}

	public static void swap(char [] a, int i , int j){
		char b = a[i];
		a[i] = a[j];
		a[j] = b;
	}
}
