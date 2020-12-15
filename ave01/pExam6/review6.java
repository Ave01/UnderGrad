import java.util.stream.Stream;
import java.util.*;
class review6{

	public static void main(String ... args) {

		List<String> list = Arrays.asList("Bob" , "Ken" , "John" , "Kenny", "Jason2");
		list.stream()
		.filter((t) -> t.length() <= 5)
		.forEach((t) -> System.out.println(t));
		
		int [] arr;
	
		IntStream q2 = Arrays.stream(arr)
			.filter((t) -> ( t % 2) == 1)
			.forEach((t) -> System.out.println(t));

	}
}
