package examples;

/**
 * A class to test the DataProcessorRedesign class.
 * @author srollins
 *
 */
public class DataProcessorRedesignDriver {
	
	public static void main(String[] args) {
		
		DataProcessorRedesign dpr = new DataProcessorRedesign("input/scores.txt");
		System.out.println("Min: " + dpr.getMin());
		System.out.println("Mean: " + dpr.getMean());
		

	}
}