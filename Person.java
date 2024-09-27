public class Person {
	private String name;
	private String contactNumber;

	public Person(String name, String contactNumber) {
		this.name = name;
		this.contactNumber = contactNumber;
	}

	public void displayInformation() {
		System.out.println("Name: " + name + ", Contact: " + contactNumber);
	}

	// Getters and Setters
	public String getName() { return name; }
	public void setName(String name) { this.name = name; }

	public String getContactNumber() { return contactNumber; }
	public void setContactNumber(String contactNumber) { this.contactNumber = contactNumber; }
}
