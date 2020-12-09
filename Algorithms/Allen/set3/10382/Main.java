import java.io.*;
class Main1{
	static class Interval implements Comparable<Interval> {
        double start;
        double end;
 
        public Interval(double start, double end) {
           this.start = start;
           this.end = end;
        }
        public int compareTo(Interval interval) {
            if (Double.compare(start, interval.start) != 0) {
                return Double.compare(start, interval.start);
            }else {
                return Double.compare(end, interval.end);
            }
        }
    }
	public static void main(String[] args) throws Exception{
		BufferedReader kb = new BufferedReader(new InputStreamReader(System.in));
		while(true) {
			String in = kb.readLine();
			String[] tokens = in.split(" ");
			int n = Integer.parseInt(tokens[0]);
			int l = Integer.parseInt(tokens[1]);
			int w = Integer.parseInt(tokens[2]);
			Interval[] interval = new Interval [n];
 			for(int i = 0; i < n; i++) {
 				in = kb.readLine();
 				int tokens[3]
				 
				}
			
		}
