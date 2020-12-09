import java.util.*;
import java.io.*;
public class main{
	Vector<Pair> AdjList = new Vector<Pair>>();
	PriorityQueue<Pair> pq = new PriorityQueue<Pair>();
	boolean[] taken;
	
	void process(int vtx){
		taken[vtx] = true;
		for(int j =0; j < (int)AdjList.get(vtx).size(); j++){ 
			IntegerPair v = new IntegerPair(
			if(!taken[v.first]){
							
			}
		}
	}	
	class Pair implements Comparable<Pair>{
		int w;
		int v;

		public Pair(int w, int v){
			this.w = w;
			this.v = v;
		}
	}
		 

	public static void main(String[] args){
		
		process(0);
		int mst_cost = 0;
		while(!pq.empty()){
			IntegerPair front = new Int
		
		
		
