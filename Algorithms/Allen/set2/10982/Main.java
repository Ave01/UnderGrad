import java.io.*;
class Main1{
        public static void main(String[] args) throws Exception{
                BufferedReader kb = new BufferedReader(new InputStreamReader(System.in));
                int N = Integer.parseInt(kb.readLine());
                for(int i = 0; i < N; i++){
                		int[] troublemakers;
                		int L = 0;
                        String s = kb.readLine();
                        String[] tokens = s.split(" ");
                        int n = Integer.parseInt(tokens[0]);
                        int m = Integer.parseInt(tokens[1]);
                        for(int j = 0; j < m; j++){
                                s  = kb.readLine();
                                String[] tokens2 = s.split(" ");
                                int u = Integer.parseInt(tokens2[0]);
                                int v = Integer.parseInt(tokens2[1]);

		

		
                        }
                        if(m/2 > m) {
                        	System.out.println("Case #" + (i + 1) + ":" + L);
                        	for(int k = 0; k < troublemakers.length; k++) {
                        		System.out.print(troublemakers[k] + " ");
                        	}
                        	System.out.println();
                        }else {
                        	System.out.println("Impossible");
                        }
                 }
