import java.util.*;
import java.lang.Iterable;
class Stack implements StackInterface , Iterable<Object>{
	private Object[] stack;
	private int next = 0;
	
	public Stack(){
		stack = new Object[10];
	}
	public void push(Object obj){
		if(next == 10){
			throw new FullStackException();
		}
		stack[next++] = obj;
	}
	public Object pop(){
		if(next == 0){
			throw new EmptyStackException();
		}
		return stack[--next];
	}
	public Iterator<Object> iterator(){
		return new StackIterator();
	}
	public class StackIterator implements Iterator<Object>{
		private int numReturned = next - 1;
		
		public boolean hasNext(){
			if( numReturned >= 0 ){
				return true;
			}else{
				return false;
			}
		}
		public Object next(){
			if(! hasNext()){
				throw new NoSuchElementException();
			}
		return stack[numReturned --];
		}	
	}
}
