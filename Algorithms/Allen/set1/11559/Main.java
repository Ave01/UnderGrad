import java.io.*;
class Main{
	public static void main(String [] args) throws Exception{
		BufferedReader kb = new BufferedReader(new InputStreamReader(System.in));
		while(true){
			String in = kb.readLine();
			if(in == null || in.isEmpty()) {
				break;
			}
			String tokens[] = in.split(" ");
			int n = Integer.parseInt(tokens[0]); // number of partcipants
			int b = Integer.parseInt(tokens[1]); // budget
			int h = Integer.parseInt(tokens[2]); // number of hotels
			int w = Integer.parseInt(tokens[3]); // number of weeks
			int[] res = new int[h];
			int count = 0;
			for(int i = 0; i < h; i++){
				int cost = Integer.parseInt(kb.readLine());
				int[] beds = new int[w];
				String in2 = kb.readLine();
				String tokens2[] = in2.split(" ");
				for(int j = 0; j < tokens2.length; j ++) {
					beds[j] = Integer.parseInt(tokens2[j]);
				}
				for(int k = 0; k < w; k++) {
					if(beds[k] >= n) {
						if(n * cost <= b) {
							res[count] = n * cost;
							count++;
							break;
						}
					}
				}
			}
			int result = res[0];
			if( count > 0) {
				for(int l = 0; l < count; l++) {
					result = Math.min(result, res[l]);
				}
				System.out.println(result);
			}else {
				System.out.println("stay home");
			}
		}
			
	}
}
