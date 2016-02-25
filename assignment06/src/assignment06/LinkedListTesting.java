package assignment06;

import static org.junit.Assert.*;

import java.util.Iterator;

import org.junit.Test;

public class LinkedListTesting {

	@Test
	public void GetFirsttest() {
		DoublyLinkedList<String> testlist = new DoublyLinkedList<String>();
		testlist.addFirst("cat");
		testlist.add(0, "pig");
		testlist.add(1, "donkey");
		testlist.add(2, "Monkey");
		testlist.add(3, "fish");
		testlist.add(2, "dog");	
		assertEquals("pig", testlist.getFirst());
		
	}
	
	@Test
	public void GetLasttest() {
		DoublyLinkedList<String> testlist = new DoublyLinkedList<String>();
		testlist.addFirst("cat");
		testlist.add(0, "pig");
		testlist.add(1, "donkey");
		testlist.add(2, "Monkey");
		testlist.add(3, "fish");
		testlist.add(2, "dog");	
		assertEquals("cat", testlist.getLast());
		
	}
	
	
	@Test
	public void GetIndexOftest() {
		DoublyLinkedList<String> testlist = new DoublyLinkedList<String>();
		testlist.addFirst("cat");
		testlist.add(0, "pig");
		testlist.add(1, "donkey");
		testlist.add(2, "Monkey");
		testlist.add(3, "fish");
		testlist.add(2, "dog");	
		assertEquals(0, testlist.indexOf("pig"));
		assertEquals(1, testlist.indexOf("donkey"));
		assertEquals(2, testlist.indexOf("dog"));
		assertEquals(3, testlist.indexOf("Monkey"));
		assertEquals(4, testlist.indexOf("fish"));
		assertEquals(5, testlist.indexOf("cat"));
		
	}
	
	@Test
	public void GetLastIndexOftest() {
		DoublyLinkedList<String> testlist = new DoublyLinkedList<String>();
		testlist.addFirst("cat");
		testlist.add(0, "pig");
		testlist.add(1, "pig");
		testlist.add(2, "pig");
		testlist.add(3, "fish");	
		assertEquals(2, testlist.lastIndexOf("pig"));		
	}
	
	@Test
	public void GetSize() {
		DoublyLinkedList<String> testlist = new DoublyLinkedList<String>();
		testlist.addFirst("cat");
		testlist.add(0, "pig");
		testlist.add(1, "pig");
		testlist.add(2, "pig");
		testlist.add(3, "fish");	
		assertEquals(5, testlist.size());		
	}
	
	@Test
	public void isEmptyTest() {
		DoublyLinkedList<String> testlist = new DoublyLinkedList<String>();
		testlist.addFirst("cat");
		testlist.add(0, "pig");
		testlist.add(1, "pig");
		testlist.add(2, "pig");
		testlist.add(3, "fish");	
		assertEquals(false, testlist.isEmpty());	
		Iterator<String> test2 = testlist.iterator();
		while(test2.hasNext())
		    {
		    	test2.next();
		    	test2.remove();	        
		    }	
		assertEquals(true, testlist.isEmpty());
		    
	}
	
	@Test
	public void ClearTest() {
		DoublyLinkedList<String> testlist = new DoublyLinkedList<String>();
		testlist.addFirst("cat");
		testlist.add(0, "pig");
		testlist.add(1, "pig");
		testlist.add(2, "pig");
		testlist.add(3, "fish");	
		testlist.clear();
		assertEquals(true, testlist.isEmpty());
		    
	}
	
	
	@Test
	public void ToArrayTest() {
		DoublyLinkedList<String> testlist = new DoublyLinkedList<String>();
		testlist.addFirst("cat");
		testlist.add(0, "pig");
		testlist.add(1, "pig");
		testlist.add(2, "pig");
		testlist.add(3, "fish");			
		Object[] arraytest = testlist.toArray();
		for(Object i: arraytest)
			System.out.println(i);
		System.out.println("\n");
		    
	}
	
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
	
	@Test
	public void IteratorPrintTest2() {
		DoublyLinkedList<String> testlist = new DoublyLinkedList<String>();
		testlist.addFirst("cat");
		testlist.add(0, "pig");
		testlist.add(1, "donkey");
		testlist.add(2, "Monkey");
		testlist.add(3, "fish");
		testlist.add(2, "dog");
		
		Iterator<String> test = testlist.iterator();	    
		assertEquals("pig", test.next());
		assertEquals("donkey", test.next());
		assertEquals("dog", test.next());
		assertEquals("Monkey", test.next());
		assertEquals("fish", test.next());
		assertEquals("cat", test.next());
	 
	}
	
	@Test
	public void IteratorremoveTest() {
		DoublyLinkedList<String> testlist = new DoublyLinkedList<String>();
		testlist.addFirst("cat");
		testlist.add(0, "pig");
		testlist.add(1, "donkey");
		testlist.add(2, "Monkey");
		testlist.add(3, "fish");
		testlist.add(2, "dog");
		
		Iterator<String> test = testlist.iterator();
		test.next();
		test.remove();
		assertEquals(true, testlist.getFirst() == "donkey");
	 
	}
	
	@Test
	public void IteratorHasNextTest() {
		DoublyLinkedList<String> testlist = new DoublyLinkedList<String>();
		testlist.addFirst("cat");
		testlist.add(0, "pig");
		testlist.add(1, "donkey");
		testlist.add(2, "Monkey");
		testlist.add(3, "fish");
		testlist.add(2, "dog");
		
		Iterator<String> test = testlist.iterator();
		assertEquals(true, test.hasNext());
		Iterator<String> test2 = testlist.iterator();
		    while(test2.hasNext())
		    {
		    	test2.next();
		    	test2.remove();	        
		    }	
		    
		assertEquals(false, test2.hasNext());
		
		
	}

}
