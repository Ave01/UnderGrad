import java.util.*;
import java.io.*;
class Main{
       static int M, C;
       static int[][] price = new int[25][25];
       static int[][] memo = new int[210][25];
       static int shop(int money, int g){
                if(money < 0){
                        return -100000000;
                }
                if(g == C){
                        return M - money;
                }
                if(memo[money][g] != -1){
                        return memo[money][g];
                }
                int ans = -1;
                for(int model = 1; model <=price[g][0]; model++) {
                	ans = Math.max(ans, shop(money - price[g][model], g + 1));
                }
                return memo[money][g] = ans;
        }
        public static void main(String[] args) throws Exception{
        	BufferedReader kb = new BufferedReader(new InputStreamReader(System.in));
        	int i, j, score;
        	int N = Integer.parseInt(kb.readLine());
        	while(N --> 0) {
        		String string = kb.readLine();
        		String[] tokens = string.split(" ");
        		 M = Integer.parseInt(tokens[0]);
        		 C = Integer.parseInt(tokens[1]);
        		for(i = 0; i < C; i++) {
        			String t = kb.readLine();
        			String[] tokens2 = t.split(" ");
        			int K = Integer.parseInt(tokens2[0]);
        			price[i][0] = K;
        			int count = 1;
        			for(j = 1; j <= K; j++) {
        				price[i][j] = Integer.parseInt(tokens2[count]);
        				count++;
        			}
        		}
        		for (int x = 0; x < 210; x++) {
        	        for (int y = 0; y < 25; y++) {
        	          memo[x][y] = -1;
        	        }
        		}
        		score = shop(M, 0);
        		if(score < 0) {
        			System.out.println("no solution");
        		}else {
        			System.out.println(score);
        		}
        	}
        }
}
