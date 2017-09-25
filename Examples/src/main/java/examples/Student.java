package examples;

public class Student {
	
	//data members
	private Name name;
	private int id;
	
	public Student(String firstName, String lastName, int id) {		
//		this.name = name;
		this.name = new Name(firstName, lastName);
		this.id = id;		
	}
	
	public Student(String firstName, String lastName) {
		this(firstName, lastName, 0);
	}
	
	public Student(Name name, int id) {		
		this.name = name;
		this.id = id;		
	}
	
	public Student(Name name) {
//		this.name = name;
//		this.id = 0;
		this(name, 0);
	}

	public String toString() {
		return name.toString() + " - " + id;
	}
	
	public void changeFirstName(String firstName) {
		name.setFirstName(firstName);
	}
	
	public Name getName() {
		return this.name;
	}
	
}
