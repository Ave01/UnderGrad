import java.io.*;
class Main{
        public static void main(String[] args) throws Exception{
                BufferedReader kb = new BufferedReader(new InputStreamReader(System.in));
                while(true) {
                	String s = kb.readLine();
                    String[] tokens = s.split(" ");
                	int t = Integer.parseInt(tokens[0]); //total
                	int n = Integer.parseInt(tokens[1]); // number of integers in list
                	int count = 0;
                	int[] arr = new int[n];
                	if(t == 0 && n == 0) {
                		break;
                	}
                	for(int i = 2; i < tokens.length; i ++) {
                		arr[count] = Integer.parseInt(tokens[i]);
                		count++;
                	}
                	
                
                }
          }
}
