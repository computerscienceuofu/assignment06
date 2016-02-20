package assignment06;

public class Node<E> {
	
	E data;
	public Node<E> next = null;
	public Node<E> prev = null;
	
	public Node(E element)
	{
		data = element;		
	}	

}
