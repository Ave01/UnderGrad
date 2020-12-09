import java.util.*;
import java.io.*;

public class solution{
        public static void main(String[] args){
                try{
                        File file = new File("input.txt");
                        Scanner in = new Scanner(file);
                        ArrayList<Integer> L = new ArrayList<>();
                        int v = in.nextInt();
                        while (in.hasNextInt()){
                                L.add(in.nextInt());
                        }
                        Collections.sort(L);
                        int result = Collections.binarySearch(L, v);
                        if(result < 0){
                                System.out.println("List doesn't contain value");
                        }else{
                                System.out.println("List contains value");
                        }
                }
                catch(FileNotFoundException e){
                        e.printStackTrace();
                }
        }
}

