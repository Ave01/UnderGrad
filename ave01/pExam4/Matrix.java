import java.util.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.lang.Iterable;
public class Matrix implements Iterable<Integer>{
	private int[][] matrix;
	private int rows;
	private int columns;
	
	public Matrix(int rows , int columns){
		this.rows = rows;
		this.columns = columns;
	}
	public void set(int[] ... args){
		if(args.length != rows){
			throw new IllegalArguementException(" " );
		}else if(args.length != columns){
			throw new IllegalArguementException(" " );
		}
		for(int i = 0; i < args.length; i++){
			matrix[i] = args[i];
		}
	}
	public Iterator<Integer> iterator(){
		return new MatrixIterator();
	}
	public Iterator<Integer> DiagonalMatrixIterator(){
		return new DiagonalMatrixIterator();	
	}
	public class MatrixIterator implements Iterator<Integer>{
		public boolean hasNext(){
			if(rows < matrix.length){
				return true;
			}
			return false;
		}
		public Integer next(){
			Integer track = matrix[rows][columns];
			rows++;
			return track;
		}
	}
	public class DiagonalMatrixIterator implements Iterator<Integer>{
		public boolean hasNext(){
			if(matrix.length > matrix[0].length){
				if(rows < matrix[0].length){
					return true;
				}
			return false;
			}else{ 
				if(rows < matrix[0].length){
					return true;
				}
				return false;
			}
		}
		public Integer next(){
			Integer track = matrix[rows][columns];
			rows++;
			return track;
			}
		}
	}	 

