import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class WidgetSorter {

	public static void main(String[] args) {

		
		ArrayList<Widget> widgets = new ArrayList<Widget>();
		widgets.add(new Widget("d", 5));
		widgets.add(new Widget("a", 1));
		widgets.add(new Widget("b", 4));
		widgets.add(new Widget("e", 2));
		widgets.add(new Widget("c", 3));
		
		for(Widget w: widgets) {
			System.out.println(w);
		}
		System.out.println("**********");
		
		//Using an anonymous inner class to compare widgets by name
//		WidgetByValueComparator wbvc = new WidgetByValueComparator();
//		Collections.sort(widgets, wbvc);
		
		Collections.sort(widgets, new Comparator<Widget>() {
			@Override
			public int compare(Widget o1, Widget o2) {
				return (o1.getName().compareTo(o2.getName()));
			}
		});
		
		System.out.println("Sorted by name:");
		for(Widget w: widgets) {
			System.out.println(w);
		}
//
//		//Use a lambda expression to compare widgets by value
		Collections.sort(widgets, (Widget o1, Widget o2) -> (o1.getValue() - o2.getValue()));
		
//		Collections.sort(widgets, (Widget o1, Widget o2) -> (o1.getName().compareTo(o2.getName())));

		System.out.println("\nSorted by value:");
		for(Widget w: widgets) {
			System.out.println(w);
		}
		
	}

}
