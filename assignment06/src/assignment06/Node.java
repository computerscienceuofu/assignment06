package assignment06;

public class Node<E> {
	
	E data;
	public Node<E> next = null;
	public Node<E> prev = null;
	
	public Node(E data) {
		this.data = data;
		this.next = null;
	}

	public Node(E data, Node<E> next) {
		this.data = data;
		this.next = next;
	}

}
