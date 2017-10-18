
public class Node {
	
	private Comparable data;
	private Node next;

	public Node(Comparable data) {
//		this.data = data;
//		this.next = null;
		this(data, null);
	}
	
	public Node(Comparable data, Node next) {
		this.data = data;
		this.next = next;
	}

	public void setData(Comparable data) {
		this.data = data;
	}

	public void setNext(Node next) {
		this.next = next;
	}

	@Override
	public String toString() {
		return "Node [data=" + data + ", next=" + next + "]";
	}
	
}
