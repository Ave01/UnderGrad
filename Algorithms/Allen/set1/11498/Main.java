import java.util.*;
class Main{
	public static void main(String [] args){
		Scanner kb = new Scanner(System.in);
		int k = kb.nextInt();
		while( k != 0){
			int n = kb.nextInt();
			int m = kb.nextInt();
			for(int i = 0; i < k; i++){
				int x = kb.nextInt();
				int y = kb.nextInt();
				if(x > n && y > m){
					System.out.println("NE");
				}else if(x > n && y < m){
					System.out.println("SE");
				}else if(x < n && y < m){
					System.out.println("SO");
				}else if(x < n && y > m){
					System.out.println("NO");
				}else{
					System.out.println("divisa");
				}
			}
			k = kb.nextInt();
		}
	}
}
