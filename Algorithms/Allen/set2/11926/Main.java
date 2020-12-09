import java.io.*;
class Main{
        public static void main(String[] args) throws Exception{
                BufferedReader kb = new BufferedReader(new InputStreamReader(System.in));
                while(true) {
                	String s = kb.readLine();
                    String[] tokens = s.split(" ");
                	int n = Integer.parseInt(tokens[0]); //one time task
                	int m = Integer.parseInt(tokens[1]); //repeating task
                	if(n == 0 && m == 0) {
                		break;
                	}
                	int[][] arr = new int[n + m][3];
                	for(int i = 0; i < n; i++){
                		s  = kb.readLine();
                		String[] tokens2 = s.split(" ");
                		int n_start = Integer.parseInt(tokens2[0]);
                		int n_end = Integer.parseInt(tokens2[1]);
                		arr[i][0] = n_start;
                		arr[i][1] = n_end;
                	}
                	for(int j = n; j < n + m; j++) {
                		s  = kb.readLine();
                		String[] tokens2 = s.split(" ");
                		int m_start = Integer.parseInt(tokens2[0]);
                		int m_end = Integer.parseInt(tokens2[1]);
                		int ri = Integer.parseInt(tokens2[2]); //repetition interval
                		arr[j][0] = m_start;
                		arr[j][1] = m_end;
                		arr[j][2] = ri;
                	}
                	boolean conflict = false;
                	boolean[] check = new boolean[1000001];
                	 for (int i = 0; i < n && !conflict; i++) {
                         int x = arr[i][0];
                         int y = arr[i][1];
                         for (int j = x; j < y; j++) {
                             if (check[j]) {
                                 conflict = true;
                                 break;
                             }
                             check[j] = true;
                         }
                     }
                	 if (!conflict) {
                         for (int i = n; i < n + m; i++) {
                             int x = arr[i][0];
                             int y = arr[i][1];
                             int z = arr[i][2];
                             while (x < 1000001) {
                                 for (int j = x; j < y && j < 1000001; j++) {
                                     if (check[j]) {
                                         conflict = true;
                                         break;
                                     }
                                     check[j] = true;
                                 }
                                 x += z;
                                 y += z;
                             }
                         }
                     }
                     if (conflict) {
                         System.out.println("CONFLICT");
                     } else {
                         System.out.println("NO CONFLICT");
                     }
                }
        }
}
