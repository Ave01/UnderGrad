import java.util.*;
import java.lang.Iterable;
public class Student implements Comparable<Student>{
	public String firstName; 
	public String lastName;
	
	public Student(String firstName , String lastName){
		this.firstName = firstName;
		this.lastName = lastName;
	}	
	@Override
	public String toString(){
		return firstName + lastName;
	}
	public int compareTo(Student a){
		if(this.lastName.compareTo(a.lastName) < 0 ){ 
			return -1;
		}else if(this.lastName.compareTo(a.lastName) == 0){
			if(this.firstName.compareTo(a.firstName) < 0){
				return -2;
			}else if(this.firstName.compareTo(a.firstName) > 0){
				return 1;
			}else{
				return 0;
			}
		}else{
			return 0;  
			
		}
	}
}
