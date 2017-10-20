
public class LinkedList<T> {
	
	private Node<T> head;

	public LinkedList() {
		this.head = null;
	}

	//insertSorted
	
	//reverse (iterative and recursive)
	
	public void insertFirst(Comparable<T> data) {
		
		Node<T> newNode = new Node<T>(data);
		newNode.setNext(head);
		head = newNode;
	}

	public boolean findIterative(T target) {
		//found = false;
		//for each item in the list
		//	if the item matches the target
		//		found = true
		//		break
		//return found
		
		Node<T> current = head;
		while(current != null) {
			if(current.getData().compareTo(target) == 0) {
				return true;				
			}
			current = current.getNext();
		}
		return false;
		
//		boolean found = false;
//		Node<T> current = head;
//		while(current != null && !found) {
//			if(current.getData().compareTo(target) == 0) {
//				found = true;
//				break;				
//			}
//			current = current.getNext();
//		}
//		return found;
	}

	public boolean findRecursive(T target) {
		return findRecursive(target, head);
	}

	//if end of list
	//	return false;
	//if item matches target
	// return true
	//return whatever i get back from recursively calling the method with the next node
	
	private boolean findRecursive(T target, Node<T> currentHead) {
		if(currentHead == null) {
			return false;			
		}
		if(currentHead.getData().compareTo(target) == 0) {
			return true;
		}
		return findRecursive(target, currentHead.getNext());
	}
	

	public String toString() {
		StringBuffer sb = new StringBuffer();
		Node<T> current = head;
		while(current != null) {
			sb.append(current.getData() + " \n");
			current = current.getNext();
		}
		return sb.toString();
	}
}
