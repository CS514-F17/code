public abstract class Beverage implements Comparable<Beverage>, Drinkable {

	protected int ounces;
		
	public Beverage(int ounces) {
		this.ounces = ounces;
	}
		
	public int getSize() {
		return this.ounces;
	}
	
	public void drink() {
		System.out.println("Mmm, tasty");
	}
	
	public abstract String getServingGlass();
	
	public int compareTo(Beverage other) {
		return ounces - other.getSize();
//		if(ounces < other.getSize()) {
//			return -1;
//		} else if(ounces > other.getSize()) {
//			return 1;
//		} else {
//			return 0;
//		}
	}
}