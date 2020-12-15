public class Triple implements Tuple{
	Object Element[] = new object[3];
	public object names(Object First, Object Second, Object Last){
		First = Element[1];
		Second = Element[2];
		Last = Element[3]'
	}
	public getFirst(Object E){
		return first;
	}
	public getLast(Object E){
		return last;
	}
	public getElements(Object[] array){
		return Element;
	}
	@Override
	public String toString(String x, String y, String z){
		x.equals(Element[1]);
		y.equals(Element[2]);
		z.equals(Element[3]);
	}
	@Override
	public boolean equals(Object First1, Object Second1, Object Last1){
		if(!(First1 instanceof names)){
			return false;
		}
		if(!(Second1 instanceof names)){
			return false;
		}
		if(!(Last1 instanceof names)){
			return false;
		}
		names temp = (names) First1;
		names temp2 = (names) Second1;
		names temp3 = (names) Last1;
		if(temp.First1.equals(First) &&
		   temp2.Second1.equals(Second) &&
		   temp3.Last1.equals(Last){
			return true;
		}
		return false;
	}
	@Override
	int hashCode(){
		int result = 17;
		result += 31 * result + Element.hashCode();
	}
}

