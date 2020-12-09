import java.util.Scanner;

public class relational_operator{
	public static void main(String [] args){
		Scanner kb = new Scanner(System.in);
		int K = kb.nextInt();
		for(int k = 0; k < K; k++){
			int i = kb.nextInt();
			int ii = kb.nextInt();
			System.out.println(i < ii ? "<" : i > ii ? ">" : "=");
		}
	}
}
