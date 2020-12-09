import java.util.*;
class Main{
	public static void main(String[] args){
		Scanner kb = new Scanner(System.in);
		int t = kb.nextInt();
		kb.nextLine();
		for(int i = 0; i < t; i++){
			String s = kb.nextLine();
			String[] tokens = s.split(" ");
			int a = Integer.parseInt(tokens[0]);
			int b = Integer.parseInt(tokens[1]);
			int c = Integer.parseInt( tokens[2]);
			if((b < a && a < c) || (c < a && a < b)){
				System.out.println("Case " + (i + 1) +": " + a);
			}else if((a < b && b < c) || (c < b && b < a)){
				System.out.println("Case " + (i + 1) + ": " + b);
			}else{
				System.out.println("Case " + (i + 1) + ": " + c);
			}
		}
	}
}
