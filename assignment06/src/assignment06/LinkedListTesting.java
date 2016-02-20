package assignment06;

import static org.junit.Assert.*;

import org.junit.Test;

public class LinkedListTesting {

	@Test
	public void test() {
		DoublyLinkedList<String> testlist = new DoublyLinkedList<String>();
		testlist.addFirst("cat");
		testlist.addFirst("dog");
		testlist.addFirst("monkey");
		testlist.addFirst("elephant");
		
	}

}
