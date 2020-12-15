public class Pair implements Tuple{
	private Object first;
	private Object last;
	
	public object names(Object first , Object second){
		one = first; 
		two = last;
	}
	public getFirst(Object E){
		return first;
	}
	public getLast(Object E){
		return second;
	}
	public getElements(Object[] array){
		Object names = new Object[2];
		names[1] = first;
		names[2] = second;
		return names;
	}
	@Override
	public String toString(String x, String y){
		x.equals(first);
		y.equals(last);
	}
	@Override
	public boolean equals(Object first1, Object last2){
		if(!(first1 instanceof names)){
			return false;
		}
		if(!(last2 instanceof names)){
			return false;
		}
		names temp = (names) first1;
		names temp2 = (names) last2;
		if(temp.first.equals(first) && temp2.last.equsls(second)){
			return true; 
		}
		return false;
	}
	@Override
	int hashCode(){
		int result = 17;
		result += 31 * result + first.hashCode();
		result += 31 * result + last.hashCode();
		
		return result;
	}
}  
