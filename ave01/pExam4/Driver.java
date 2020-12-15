import java.util.*;
public class Driver extends Stack {
public static void main(String[] args){
	Stack stack = new Stack();
	
	stack.push(10);
	stack.push(11);
	stack.push(4);
	stack.push(6);
	stack.push(29);
	stack.push(54);
	stack.push(70);
	stack.push(67);
	stack.push(98);
	stack.push(67);
	stack.pop();
	Iterator<Object> it = stack.iterator();
	while(it.hasNext()){
		System.out.println(it.next());
		}
	Student student2 = new Student("Avery ", "Njau");
	Student student = new Student("Justus " , "Njau");
	if(student.compareTo(student2) < 0){
		System.out.println(student.firstName + student.lastName +  " is lesser than " + student2.firstName + student2.lastName);
		}else if(student.compareTo(student2) > 0){
			System.out.println(student.firstName + student.lastName + " is greater than " + student2.firstName + student2.lastName);
		}
		
	}
}
