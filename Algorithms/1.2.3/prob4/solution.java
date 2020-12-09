import java.util.*;
import java.io.IOException;
import java.io.FileReader;
 
 
class solution{
        public static void main(String[] args){
                String filename = "input";
                ArrayList<Integer> input = new ArrayList<>();
 
                try (Scanner s = new Scanner(new FileReader(filename))) {
                        while (s.hasNext()) {
                                input.add(s.nextInt());
                        }
                } catch (IOException ioe) {
                }
 
                int[] arr = input.stream().mapToInt(Integer :: intValue).toArray();
                Arrays.sort(arr);
                int n = arr.length;
 
                for(int i = 0; i < n; i++){
                        while(i < n - 1 && arr[i] == arr[i + 1])
                                i++;
                        System.out.print(arr[i] + " ");
                }
                System.out.println();
        }
}

