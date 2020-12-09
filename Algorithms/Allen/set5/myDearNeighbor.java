import java.io.*;
import java.util.*;

public class myDearNeighbor{
	public static void main(String[] args){
		Scanner kb = new Scanner(System.in);
		Graph graph = new Graph();
	//	graph.readAdjacencyList(kb);
	//	System.out.println(graph.toString());
	
		graph.readAdjacencyMatrix(kb);
	}
}
		
