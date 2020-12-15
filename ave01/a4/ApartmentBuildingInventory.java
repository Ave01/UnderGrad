import java.util.Scanner;
import java.util.ArrayList;
public class ApartmentBuildingInventory{
	
	
	public static void main(String[] args) 
		throws IllFormedCommercialBuildingException{
		
	 ArrayList<ApartmentBuilding> ApartmentBuildingInventory = new ArrayList<>();;
		while(true){
			System.out.println("Press each button according to your need");
			System.out.println("1. Add Apartment Building");
			System.out.println("2. Print Inventory");
			System.out.println("3. Exit");
		Scanner input = new Scanner(System.in);
		int i = input.nextInt(); 
		if( i == 1){
			System.out.println("Enter The Number of Units: ");
			int numberOfUnits = input.nextInt();
			System.out.println("Enter Your Street Address: ");
			String streetAddress = input.nextLine();
			System.out.println("Enter true or false whether or not you have a penthouse: ");
			boolean	penthouseApartment = input.nextBoolean();
			try{
				ApartmentBuilding newApartment = new ApartmentBuilding(numberOfUnits, streetAddress, penthouseApartment);
			ApartmentBuildingInventory.add(newApartment);
			//	 i = input.nextInt();
			}
			catch( IllFormedCommercialBuildingException e ) {
				System.out.println(e.toString());
				}
			}
		else if(i == 2){
		for( ApartmentBuilding newApartment: ApartmentBuildingInventory){
			System.out.println(newApartment.numberOfUnits + " , ");
			System.out.print(newApartment.streetAddress + " , ");
			System.out.print(newApartment.penthouseApartment + ".");
			} 

	      	else if( i == 3){
			System.exit(0);
			}
			
			
				}	
		}	
	}
}	
