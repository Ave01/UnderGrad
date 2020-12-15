package util6;
public interface Queue extends Collection{
	boolean add(Object e);
	Object element();
//	boolean offer(Object e);
	Object peek();
	Object poll();
	Object remove();
}
