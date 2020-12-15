public class positivePair extends Pair{
	public Object positive(Object PosOne, Object PosTwo){
		if(PosOne || PosTwo < 0){
			throw new IllegalArgumentException();
		}
	
