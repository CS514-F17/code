/**
 * A class to demonstrate static data members and methods.
 * 
 * @author srollins
 *
 */
public class Car {

	private String make;
	private String model;
	private int vin;
	private static int vinGenerator = 0;
	
	//TODO: declare a static data member to generate the VIN number
	
	public Car(String make, String model) {
		this.make = make;
		this.model = model;
		this.vin = ++vinGenerator;
	}
	
	public String getMake() {
		return make;
	}

	public String getModel() {
		return model;
	}
	
	public String toString() {
		return "Make: " + make + " Model: " + model + " VIN: " + vin;
	}
	
	//TODO: complete static method to return number of cars created 
	public static int totalCars() {
		return vinGenerator;
	}
	
}
