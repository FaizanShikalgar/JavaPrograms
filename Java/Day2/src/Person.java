
public class Person {
	
	private String firstName;
	private String lastName;
	private static int count;
	
	public Person() {
		firstName = "first";
		lastName= "last";
		//count++;
	}
	public Person(String firstName,String lastName) {
		this();
		this.firstName = firstName;
		this.lastName = lastName;
		//count++;
	}
	static {
		count = 0;
		System.out.println("static init block 1");
	}
	static {
		System.out.println("static init block 2");
	}
	public void setPersonName(String fname,String lname) {
		firstName = fname;
		lastName = lname;
	}
	public void setFirstName(String fname) {
		firstName = fname;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setLastName(String lname) {
		lastName = lname;
	}
	public String getLastName() {
		return lastName;
	}
	public void displayPersonName() {
		System.out.println("Person Name:"+firstName+" "+lastName);;
	}
	public static int getCount() {
		
		return count;
	}

}
