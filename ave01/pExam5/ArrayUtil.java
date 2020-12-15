import java.util.*;
public class ArrayUtil{
	public static <T> T toList(T ... a){
		List<T> list = new ArrayList<>();
		list.add(a);
		return list;
	}


}
