import java.util.*;
public class main{
	public static void main(String [] args){
		Scanner kb = new Scanner(System.in);
		while(kb.hasnextLine()){
		String in = kb.nextLine();
		String tokens[] = in.split(" ");
		int n = Integer.parseInt(tokens[0]);
		int b = Integer.parseInt(tokens[1]);
		int h = Integer.parseInt(tokens[2]);
		int w = Integer.parseInt(tokens[3]);
		int[] cost = new int[h];
		int[] beds = new int[h]; 

		for(int i =0; i < h; i++){
			String in2 = kb.nextLine();
			String tokens2[] = in2.split(" ");
			cost[i] = Integer.parseInt(tokens2[0]);
			
	}
}
