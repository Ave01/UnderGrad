import java.io.*;
import java.util.*;
class Main{
        public static void main(String[] args) throws Exception{
                BufferedReader kb = new BufferedReader(new InputStreamReader(System.in));
                int[] heads;
                int[] knights;
                while(true){
                        String s = kb.readLine();
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
                                heads[i] = Integer.parseInt(kb.readLine());
                        }
                        Arrays.sort(heads);
                        for(int j = 0; j < knights.length; j++){
                                knights[j] = Integer.parseInt(kb.readLine());
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

