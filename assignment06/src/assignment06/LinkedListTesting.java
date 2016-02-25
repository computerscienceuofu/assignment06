package assignment06;

import static org.junit.Assert.*;

import java.util.Iterator;

import org.junit.Test;

public class LinkedListTesting {

	@Test
	public void Gettest() {
		DoublyLinkedList<String> testlist = new DoublyLinkedList<String>();
		testlist.addFirst("cat");
		testlist.addFirst("donkey");
		testlist.add(1, "Monkey");
		testlist.add(2, "fish");		
		assertEquals("donkey", testlist.get(0));
		assertEquals("Monkey", testlist.get(1));
		assertEquals("fish", testlist.get(2));
		assertEquals("cat", testlist.get(3));
		
	}
	
	@Test
	public void RemoveLastTest() {
		DoublyLinkedList<String> testlist = new DoublyLinkedList<String>();
		testlist.addFirst("cat");
		testlist.add(0, "pig");
		testlist.add(1, "donkey");
		testlist.add(2, "Monkey");
		testlist.add(3, "fish");
		testlist.add(2, "dog");	
		testlist.removeLast();
		assertEquals("fish", testlist.getLast());
		testlist.removeFirst();
		assertEquals("donkey", testlist.getFirst());
		
		
	}
	
	@Test
	public void IteratorPrintTest() {
		DoublyLinkedList<String> testlist = new DoublyLinkedList<String>();
		testlist.addFirst("cat");
		testlist.add(0, "pig");
		testlist.add(1, "donkey");
		testlist.add(2, "Monkey");
		testlist.add(3, "fish");
		testlist.add(2, "dog");
		
		Iterator<String> test = testlist.iterator();
	    while(test.hasNext())
	    {
	    	Object element = test.next();
	        System.out.print(element + "\n");	        
	    }
	    
	    Iterator<String> test2 = testlist.iterator();
	    while(test2.hasNext())
	    {
	    	test2.next();
	    	test2.remove();	        
	    }	
	    testlist.add(2, "dog");
	    
	 
	}

}
