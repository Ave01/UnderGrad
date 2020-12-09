import java.util.*;
public class main{
	public static void main(String[] args){
		Scanner kb = new Scanner(System.in);
		int N = kb.nextInt();
		for(int i = 0; i < N; i++){
			String s = kb.nextLine();
			String[] tokens = s.split(" ");
			int n = Integer.parseInt(tokens[0]);
			int m = Integer.parseInt(tokens[1]);
			for(int j = 0; j < m; j++)){
				String t = kb.nextLine();
				String[] tokens2 = t.split(" ");
				int u = Integer.parseInt(tokens2[0]);
				int v = Integer.parseInt(tokens2[1]);
