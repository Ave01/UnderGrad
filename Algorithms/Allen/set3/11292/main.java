p
import java.util.*;
public class main{
	public static void main(String[] args){
		Scanner kb = new Scanner(System.in);
		int[] heads;
		int[] knights;
		while(true){
			String s = kb.nextLine();
			String[] tokens = s.split(" "); 
			int n = Integer.parseInt(tokens[0]);
			int m = Integer.parseInt(tokens[1]);
			int cost = 0;
			int index = 0;
			boolean ans = false;
			if(n == 0 && m == 0){
				break;
			} 
			heads = new int[n];
			knights = new int[m];
			for(int i = 0; i < heads.length; i++){
				heads[i] = kb.nextInt();
			}
			Arrays.sort(heads);
			for(int j = 0; j < knights.length; j++){
				knights[j] = kb.nextInt();
			}
			Arrays.sort(knights);
			for(int k = 0; k < heads.length; k++){
				while(index < knights.length && knights[index] < heads[k]){
					index++;
				}
				if(index == knights.length){
					ans = true;
					break;
				}else{
					cost += knights[index];
					index++;
				}
			}
			if(ans == true){
				System.out.println("Loowater is doomed!");
			}else{
				System.out.println(cost);
			}
		}
	}
}
			
			
