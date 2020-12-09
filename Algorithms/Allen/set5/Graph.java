import java.util.*;
import java.io.*;

public class Graph{
	private ArrayList<ArrayList<IntegerPair>> list;
	private int  vertex = 0;
	private int nodes = 0;
	private int[][] matrix;
	public Graph(){}

	void readAdjacencyList(Scanner kb){
		int n = kb.nextInt();
		int vertex =kb.nextInt();
		list = new ArrayList<>(vertex+1);
		for(int k = 1; k <= n; k++){
		kb.nextLine();
		for(int i=1; i<= vertex; i++){
			ArrayList<IntegerPair> innerlist = new ArrayList<>();
			String in = kb.nextLine();
			String[] tokens = in.split(" "); 
			for (int j = 0; j < tokens.length; j++){
				if(tokens[j].length() == 0){
					continue;
				}	
				int id = Integer.parseInt(tokens[j]);
				int weight = 0;
				innerlist.add(new IntegerPair(id, weight));
			}
			list.add(innerlist);
		} 
		}
	}		
		
	@Override
	public String toString(){
		String s = "";
		for(ArrayList<IntegerPair> node: list){
			for(IntegerPair edge: node){
				s += edge.toString();
			}
			s += "\n";
		}
		return s;
	}
	void readAdjacencyMatrix(Scanner kb){
		nodes = kb.nextInt();
		matrix = new int[nodes][nodes];
		for(int t = 0; t<= matrix.length; t++){
			String in = kb.nextLine();
			String[] tokens = in.split(" ");
			for(int k = 0; k < tokens.length; k++){
				if(tokens[k].length() == 0){
					continue;
				}
				int id = Integer.parseInt(tokens[k]);
				matrix[k][id] = 1;
				}
		}
			
		for(int i = 0; i < nodes; i++){
			for(int j = 0; j < nodes; j++){
				System.out.print(matrix[i][j] + " ");
			}
				System.out.println();
		}
			
		

	} 
	class IntegerPair{
		int vid;
		int weight;

		IntegerPair(int vid, int weight){
			this.vid= vid;
			this.weight = weight;
		}
		@Override
		public String toString(){
			return "(" + vid + "," + weight + ")";
		}
	}
	Iterator dfsIterator(){
		return new DFSIterator();
	}
	class DFSIterator implements Iterator<Integer>{
		ArrayDeque<Integer> queue = new ArrayDeque<>();
		boolean[] visited = new boolean[vertex+1];
		
		public DFSIterator(){
			queue.push(1);
			visited[1] = true;
		}
		public boolean hasNext(){
			return !queue.isEmpty();
		}
		public Integer next(){
			if(queue.isEmpty()){
				throw new NoSuchElementException();
			}
			Integer vid = queue.pop();
			
			ArrayList<IntegerPair> innerlist = list.get(vid);
			for(int i = innerlist.size() - 1; i >= 0; i--){
				int inner = innerlist.get(i).vid;
				if(visited[inner] == false){
					queue.push(inner);
					visited[inner] = true;
				}
			}

			return vid;
		}
	}
	Iterator bfsIterator(){
		return new BFSIterator();
	}
	class BFSIterator implements Iterator<Integer>{
		ArrayDeque<Integer> queue = new ArrayDeque<>();

		public BFSIterator(){
			
	}
	
	} 
}

	
