
public class LinkedList {
	
	private Node head;

	public LinkedList() {
		this.head = null;
	}

	public void insertFirst(Comparable data) {
		
		Node newNode = new Node(data);
		newNode.setNext(head);
		head = newNode;
	}

	public boolean findIterative(Comparable target) {
		return false;
	}

	public boolean findRecursive(Comparable target) {
		return false;
	}


	public String toString() {
		return null;
	}
}
