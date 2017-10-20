
public class Node<T> {
	
	private Comparable<T> data;
	private Node<T> next;

	public Node(Comparable<T> data) {
//		this.data = data;
//		this.next = null;
		this(data, null);
	}
	
	public Node(Comparable<T> data, Node<T> next) {
		this.data = data;
		this.next = next;
	}

	public Comparable<T> getData() {
		return data;
	}

	public Node<T> getNext() {
		return next;
	}

	public void setData(Comparable<T> data) {
		this.data = data;
	}

	public void setNext(Node<T> next) {
		this.next = next;
	}

	@Override
	public String toString() {
		return "Node [data=" + data + ", next=" + next + "]";
	}
	
}
