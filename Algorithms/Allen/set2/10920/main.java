import java.util.*;
public class main{
	public static void main(String[] args){
		Scanner kb = new Scanner(System.in);
		while(kb.hasnextInt()){
			String s = kb.nextLine();
			String[] tokens = s.split(" ");
			int SZ = Integer.parseInt(tokens[0]);
			int P = Integer.parseInt(tokens[1]);
			if( SZ == 0 && P ==0){
				break;
			}
			 
