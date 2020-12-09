import java.util.Scanner;
class Main{
	public static void main(String [] args){
		Scanner kb = new Scanner(System.in);
		int K = kb.nextInt();
		for(int k = 0; k < K; k++){
			int i = kb.nextInt();
			int ii = kb.nextInt();
			if(i < ii){
				System.out.println("<");
			}else if(i > ii){
				System.out.println(">");
			}else{
			 	System.out.println("=");
			}
		}
	}	
}
