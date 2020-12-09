import java.io.*;
class Main{
	public static void main(String[] args) throws Exception{
		BufferedReader kb = new BufferedReader(new InputStreamReader(System.in));
		while(true) {
			String in = kb.readLine();
			String tokens[] = in.split(" ");
			double H = Integer.parseInt(tokens[0]); // height of well
			double U = Integer.parseInt(tokens[1]); // distance in AM
			double D = Integer.parseInt(tokens[2]); // distance in PM
			double F = Integer.parseInt(tokens[3]); // fatigue factor 
			if(H == 0 && U == 0 && D == 0 & F == 0) {
				break;
			}
			F = ((U *F)/100.0);		
			double initialHeight = 0;
			int day = 0;
			boolean outcome = true;
			while(true) {
				day++;
				initialHeight = initialHeight + U;
				if(initialHeight > H) {
					break;
				}
				initialHeight = initialHeight - D;
				if(initialHeight < 0) {
					outcome = false;
					break;
				}
				if(U - F > 0) {
					U = U - F;
				}else {
					U = 0;
				}
			}
			if(outcome) {
				System.out.println("success on day " + day);
			}else {
				System.out.println("failure on day " + day);
			}
			
		}
		
	}
}
