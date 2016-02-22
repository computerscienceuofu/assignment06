package assignment06;

import java.util.*;

public class DoublyLinkedList<E> implements List<E>, Iterable<E>{
    
	//Here are the head and tail nodes and total list size
    int size;
    Node<E> head;
    Node<E> tail;
    
	@Override
	public void addFirst(E element) {
		
		Node<E> temp = new Node<E>(element);
		if (size == 0)
		{
			head = temp;
			tail = temp;
		}
			
		head.prev = temp;
		temp.next = head;
		head = temp;
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
	
		Node<E> temp = new Node<E>(element);
		Node<E> runner = head;
		
		if(index ==-0)
		{
			head.prev = temp;
			temp.next = head;
			head = temp;
			size++;
		}
		
		for(int i = 0; i < index; i++)
		{
			runner = runner.next;			
		}
		
		temp.next = runner;
		temp.prev = runner.prev;
		runner.prev = temp;
		temp.prev.next = temp;
		size++;
		
	}

	@Override
	public E getFirst() throws NoSuchElementException {
		
		if(head == null){
			throw new NoSuchElementException();
		}
		return head.data;
	}

	@Override
	public E getLast() throws NoSuchElementException {
		if(tail == null){
			throw new NoSuchElementException();
		}
		return tail.data;
	}

	@Override
	public E get(int index) throws IndexOutOfBoundsException {
		if (size == 0 || index > size - 1)
		{
			throw new IndexOutOfBoundsException();
		}
		
		Node<E> temp = head;	
		for(int i = 0; i < index + 1; i++)
		{
			if (i == index)
			{
				return temp.data;
			}
			temp = temp.next;
		}
		return temp.data;
			
	}

	@Override
	public E removeFirst() throws NoSuchElementException {
		
		if (head == null)
		{
			throw new NoSuchElementException();
		}
		
		E value = head.data;	
		head.next.prev = null;
		head = head.next;
		size--;		
		return value;
	}

	@Override
	public E removeLast() throws NoSuchElementException {
		
		if (tail == null)
		{
			throw new NoSuchElementException();
		}
		
		E value = tail.data;
		tail.prev.next = null;
		tail = tail.prev;
		size--;
		return value;
				
	}

	@Override
	public E remove(int index) throws IndexOutOfBoundsException {
		if (index < 0 || index > size - 1)
		{
			throw new IndexOutOfBoundsException();
		}
		Node<E> temp = head;	
		for(int i = 0; i == index; i++)
		{
			if (i==index && index != 0)
			{
				temp.prev.next = temp.next;
				temp.next.prev = temp.prev;
				size--;
				return temp.data;
			}
			if (index == 0)
			{	
				head = temp.next;
				size--;		
				return temp.data;
			}
			
			temp = temp.next;
		}
		
		return temp.data;
	}

	@Override
	public int indexOf(E element) {
		if (size == 0)
		{
			throw new NoSuchElementException();
		}
		Node<E> temp = head;	
		for(int i = 0; i < size; i++)
		{
			if (temp.data == element)
			{
				return i;
			}
			temp = temp.next;
		}
		return -1;
		
	}

	@Override
	public int lastIndexOf(E element) {
		if (size == 0)
		{
			throw new NoSuchElementException();
		}
		Node<E> temp = head;	
		int index = 0;
		for(int i = 0; i < size; i++)
		{
			if (temp.data == element)
			{
				index = i;
			}
			temp = temp.next;
		}
		if (index != 0)
		{
			return index;
		}
		else if(head.data == element)
		{
			return 0;
		}
		else
		{
		return -1;
		}
	}

	@Override
	public int size() {
		return size;
	}

	@Override
	public boolean isEmpty() {
		if (head != null)
		{
			return true;
		}
		return false;
	}

	@Override
	public void clear() {
		head = null;
		tail = null;
		size = 0;
		
	}

	@Override
	public Object[] toArray() {
		Object[] array = new Object[size];
		Node<E> temp = head;
		
		for(int i = 0; i < size; i++)
		{
			array[i] = temp.data;
			temp = temp.next;
		}
		return array;
		
	}

	@Override
	public Iterator<E> iterator() {
		Iterator<E> iter = new Iterator<E>() {

		 private Node<E> currentIndex = head;

         @Override
         public boolean hasNext() {
             return currentIndex.next != null;
         }

		@Override
         public E next() {
        	Node<E> next = currentIndex;
        	currentIndex = head.next;
			return next.data;
             
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

