package a2;
public class Contact {

	private String firstName;
	private String lastName;
	private String Email;
	private String phoneNumber;
	private String homePage;

	public void unknown(String firstName, String lastName){
	String unknown = "unknown";
	firstName = unknown;
	lastName = unknown;
	}

	public void setFirstName(String name) { firstName = name; }


	public void setEmail(String name) {Email = name;} 

	public void setLastName(String name) {lastName = name;}
	
	public void setPhoneNumber(String name) {phoneNumber = name;}
	
	public void setHomePage(String name) {homePage = name;}

	public String getFirstName() { return firstName; }


	public String getLastName() { return lastName;}

	
	public String getEmail() {return Email;}
	
	public String getPhoneNumber() {return phoneNumber;}
	
	public String getHomePage() {return homePage;}

}

// END OF FILE
