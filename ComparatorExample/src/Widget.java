
public class Widget {

	private String name;
	private int value;	
	
	public Widget(String name, int value) {
		super();
		this.name = name;
		this.value = value;
	}
	
	public String getName() {
		return name;
	}
	public int getValue() {
		return value;
	}

	@Override
	public String toString() {
		return "Widget [name=" + name + ", value=" + value + "]";
	}
	
	
	
}
