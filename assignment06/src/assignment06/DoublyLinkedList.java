package assignment06;


import java.util.*;

public class DoublyLinkedList<E> implements List<E>, Iterable<E>{
    
	//Here are the head and tail nodes and total list size
    int size;
    Node<E> head;
    Node<E> tail;
    
	@Override
	public void addFirst(E element) {
		
		Node<E> newHead = new Node<E>(element);
		if (size == 0)
		{
			head = newHead;
			tail = newHead;
		}
			
		head.prev = newHead;
		newHead.next = head;
		head = newHead;
		size++;
		
	}

	@Override
	public void addLast(E o) {
		
		Node<E> newTail = new Node<E>(o);
		if (size == 0)
		{
			head = newTail;
			tail = newTail;
		}
		
		tail.next = newTail;
		newTail.prev = tail;
		tail = newTail;
		size++;
		
	}

	@Override
	public void add(int index, E element) throws IndexOutOfBoundsException {
		
		if ((index > size - 1) || (index < 0))
		{
			 throw new IndexOutOfBoundsException();
		}
		//Still needs to be implemented
		
		
	}

	@Override
	public E getFirst() throws NoSuchElementException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public E getLast() throws NoSuchElementException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public E get(int index) throws IndexOutOfBoundsException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public E removeFirst() throws NoSuchElementException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public E removeLast() throws NoSuchElementException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public E remove(int index) throws IndexOutOfBoundsException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int indexOf(E element) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int lastIndexOf(E element) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Object[] toArray() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Iterator<E> iterator() {
		Iterator<E> iter = new Iterator<E>() {

		 private Node<E> currentIndex = head;

         @Override
         public boolean hasNext() {
             return currentIndex.next != null;
         }

         @SuppressWarnings("unchecked")
		@Override
         public E next() {
        	Node<E> next = currentIndex;
        	currentIndex = head.next;
			return (E) next;
			//not sure if this is working yet
             
         }

         @Override
         public void remove() {
             throw new UnsupportedOperationException();
         }
     };
     return iter;
 }
	
	
	public DoublyLinkedList() {
		
		head = null;
		tail = null;
		size = 0;
		
	}




}

