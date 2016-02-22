package assignment06;

import static org.junit.Assert.*;

import org.junit.Test;

public class LinkedListTesting {

	@Test
	public void test() {
		DoublyLinkedList<String> testlist = new DoublyLinkedList<String>();
		testlist.addFirst("cat");
		testlist.add(0, "pig");
		testlist.add(1, "donkey");
		testlist.remove(0);
		System.out.println(testlist.getFirst());
		
		
		
	}

}
