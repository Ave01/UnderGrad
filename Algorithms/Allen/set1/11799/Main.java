import java.util.*;
class Main{
	public static void main(String[] args){
		Scanner kb = new Scanner(System.in);
		int t = kb.nextInt();
		kb.nextLine();
		for(int i = 0; i < t; i++){
			String s = kb.nextLine();
			String [] tokens = s.split(" ");
			int x = Integer.parseInt(tokens[0]);
			int max = 0;
			for(int j = 0; j < x; j++){
				int y = Integer.parseInt(tokens[j + 1]);
				if(y > max){
					max = y;
				}
			}
			System.out.println("Case " + (i + 1) + ": " + max);
		}
	}
}
