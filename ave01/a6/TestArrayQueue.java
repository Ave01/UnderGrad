public class TestArrayQueue{
	public static void main(String[] args){
	ArrayQueue q1 = new ArrayQueue(5);
	System.out.print(q1.size);
	q1.clear;
	q1.add(5);
	System.out.println(q1.contains(5));
	q1.remove(5);
	System.out.println(q1.contains(5));
	System.out.println(q1.isEmpty);

	}
}
