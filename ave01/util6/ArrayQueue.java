package util6;

public class ArrayQueue implements Queue{
	private Object[] queue; 

	public ArrayQueue(){
		queue = new Object[4];
	}
	
	public ArrayQueue(int size){
		queue = new Object[size];
	}
	
	public int size(){
		return queue.length;
	}
	public void clear(){}
	public boolean add(Object O ){
		for(Object element : queue){
			if(element == O){
				throw new NullPointerException("null");
			}else{
				return true;
				
			}
		}
		return false;
	}
	public boolean contains(Object o){
		for(Object elem : queue){
			if(elem == o){
				return true;
			}else{
				return false;
			}
		}
		return false;
	}
	public boolean remove(Object o){
		for(Object elem : queue){
			if(elem == o){
				return true;
			}else{
				return false;
			}
		}
			return true;
	}
	public boolean isEmpty(){
		for(Object elem: queue){
			if(elem != null){
				return false;
			}else{
				return true;
			}
		}
		return true;
	}
	public boolean addAll(Object[] arr){
		for(int i = 0; i<= arr.length; i++){
			if(queue == arr){
				queue[i] = i;
				return true;
			}else{
				return false;
			}
		}
		return true;
	}
	public boolean containsAll(Object[] arr){
		for(Object array : queue){
			if(arr == queue){
				return true;
			}else{
				return false;
			
			}
		}
		return true;
	}
	public boolean removeAll(Object [] arr){
		for(int i = 0; i<= arr.length; i++){
			if(arr == queue){
				queue[i] = "";
				return true;
			}else{
				return false;
			}
		}
		return true;
	}
/*	 boolean add(Object e){
		for(Object elem : queue){
			if (elem == e){
				throw new NullPointerException("null");
			}else{
				return true;
			}
		}
		return false;
	}*/
	public Object peek(){
		return queue;
	}
	public Object poll(){
		for(int i = 0; i <= queue.length + 1 - queue.length; i++){
			if( queue != null){
				return queue[i];
			}else{
				return null;
			}
		}
		return null;
	}
	 
	public Object remove(){
		for(int i = 0; i<= queue.length; i++){
		if(queue != null){	
			queue[i] = "";
		}else{
	//		throw new NoSuchElementException();
		}
		return queue;
		}
	}
/*	public Object element(){
		if(queue != null){
			return queue;
		}else{
			throw new NoSuchElementException();
		}
		return queue;
	}*/
	
}
