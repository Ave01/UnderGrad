import java.util.*;
import java.io.*;
class Main1{
   public static void main(String[] args) throws Exception{
        	BufferedReader kb = new BufferedReader(new InputStreamReader(System.in));
        	int g, money, k, M, C;
        	int[][] price = new int[25][25];
        	boolean[][] reachable = new boolean[25][210];
        	int N = Integer.parseInt(kb.readLine());
        	while(N --> 0) {
        		String string = kb.readLine();
        		String[] tokens = string.split(" ");
        		 M = Integer.parseInt(tokens[0]);
        		 C = Integer.parseInt(tokens[1]);
        		for(g = 0; g < C; g++) {
        			String t = kb.readLine();
        			String[] tokens2 = t.split(" ");
        			int K = Integer.parseInt(tokens2[0]);
        			price[g][0] = K;
        			int count = 1;
        			for(money = 1; money <= price[g][0]; money++) {
        				price[g][money] = Integer.parseInt(tokens2[count]);
        				count++;
        			}
        		}
        		for (int x = 0; x < 25; x++) {
        	        for (int y = 0; y < 210; y++) {
        	          reachable[x][y] = false;
        	        }
        		}
        		for(g = 1; g<= price[0][0]; g++) {
        			if(M - price[0][g] >= 0) {
        				reachable[0][M - price[0][g]] = true;
        			}
        		}
        		for(g = 1; g < C; g++) {
        			for(money = 0; money < M; money++) {
        				if(reachable[g-1][money]) {
        					for(k = 1; k <= price[g][0]; k++){
        						if(money - price[g][k] >= 0) {
        							reachable[g][money - price[g][k]] = true;
        						}
        					}
        				}
        			}
        		}
        		for(money = 0; money <= M && !reachable[C - 1][money]; money++) {}
        		if(money == M + 1) {
        			System.out.println("no solution");
        		}else {
        			System.out.println(M - money);
        		}
  
        		}
       }
}
