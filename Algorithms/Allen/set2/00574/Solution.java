import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;

public class Solution{
	static void subsetSum(int arr[], int t, int n){
		
		for (int i = 0; i <= (Math.pow(2,n); i++){
			int sum = 0;
			for (int j = 0; j < n; j++){
				if((i >> j) & 1) % 2 == 1){
					sum = = arr[j];
				}
			}
			if (sum == t){
				
		 																			


	public static void main(String[] args) throws FileNotFoundException{
		File file = new File("input");
		Scanner kb = new Scanner(file);
		int sum = 0;
		while(kb.hasNextLine()){
			int t = kb.nextInt();
			int n = kb.nextInt();
			int arr[] = new int[n];
			for(int i = 0; i < n; i++){
				arr[i] = kb.nextInt();
			}
		for(int i = 0; i < (1<<n); i++){
			int m =1;
			for(int j =0; j<n; j++){
				if ((i & m) > 0){
					sum += arr[j];
				}
				m = m << 1;
			}
			System.out.println(sum);
		}
		}

	}

}
