import java.util.*;
public class Stack <T>{
	//T element;
	private int next = 0;
	private Object[] arr;
	public Stack(){
	arr = new Object[10];
	}	
	public void push(T elm){
		if(next == 10){
			throw new FullStackException();
		}	
	 	arr[next++] = elm;
	}
	public T pop(){
		if(next == 0){
			throw new EmptyStackException();
		}
		return(T) arr[--next];
	}
}
