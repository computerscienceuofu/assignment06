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
		testlist.add(2, "Monkey");
		testlist.add(3, "fish");
		testlist.add(2, "dog");
		for(int i = 0; i < testlist.size(); i++)
		{
			System.out.println(testlist.get(i));
		}
		
		
		
		
	}

}
