package examples;

/**
 * Updated class that implements the Comparable interface.
 * @author srollins
 *
 */
public class Name implements Comparable<Name>{

	private String firstName;
	private String lastName;
	
	public Name(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	public int compareTo(Name other) {
		int lastNameResult = this.lastName.compareTo(other.getLastName());
		//if last names are the same
		if(lastNameResult == 0) {
			//compare first names
			return this.firstName.compareTo(other.getFirstName());
		} else {
			return lastNameResult;
		}
		
	}
	
	
	public String toString() {
		return firstName + " " + lastName;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getFirstName() {
		return this.firstName;
	}

	public String getLastName() {
		return this.lastName;
	}

	public boolean equals(Name other) {
		if(this.firstName.equals(other.getFirstName()) &&
				this.lastName.equals(other.getLastName())) {
			return true;
		}
		return false;
	}
	
}
