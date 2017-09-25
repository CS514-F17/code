import java.util.ArrayList;
import java.util.Collections;

public class Driver {

	public static void main(String[] args) {

		ArrayList<Beverage> vendingMachine = new ArrayList<Beverage>();
		vendingMachine.add(new Soda(20, 90));
		vendingMachine.add(new Soda(16, 75));
		vendingMachine.add(new Soda(16, 70));
		vendingMachine.add(new Coffee(8, false));
		vendingMachine.add(new Coffee(16, false));
		
		Collections.sort(vendingMachine);
		
		for(Beverage b: vendingMachine) {
			System.out.println(b.getSize());
//			if(b instanceof Soda) {
//				Soda s = (Soda) b;
//				System.out.println(s.getSugarContent());
//			}
		}
		
		Drinkable d = vendingMachine.get(0);
		
		
		//Beverage b = new Beverage(10); //impossible!
//		Beverage b1 = new Soda(8, 90);
//		Beverage b2 = new Coffee(16, false);
//
//		//b1.isDecaf();
//		if(b1 instanceof Coffee) {
//			Coffee c = (Coffee) b1;
//			System.out.println(c.isDecaf());
//		}
//		
//		System.out.println(c.toString());
//		System.out.println(c.getSize());
//		System.out.println(c.getServingGlass());
	}

}
