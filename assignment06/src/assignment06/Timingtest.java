package assignment06;

import java.util.*;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Timingtest {
	
	/**
	 * @author Christopher Murphy - U0190322
	 */

	static long startTime = 0;
	static long stopTime = 0;
	static long aveTime = 0;
	
	public static ArrayList<Integer> generateAverageCase(int size)
	{
		ArrayList<Integer> temp = new ArrayList<Integer>();
		for (int i = 0; i < size; i++)
			temp.add(i);
		for (int i = 0; i < size; i++)
			swap(temp, i, (int)(Math.random() * size));
		return temp;	
		
	}
	
	public static ArrayList<Integer> generateWorstCase(int size)
	{
		ArrayList<Integer> temp = new ArrayList<Integer>();
		for(int i = size-1; i >= 0; i--)
			temp.add(i);
		return temp;
		
	}
	
	public static ArrayList<Integer> generateBestCase(int size)
	{
		ArrayList<Integer> temp = new ArrayList<Integer>();
		for (int i = 0; i < size; i++)
			temp.add(i);
		
		return temp;
		
	}
	
	public static <T> void swap(ArrayList<T> array, int first, int second)
	{
		T tempItem = array.get(first);
		array.set(first, array.get(second));
		array.set(second, tempItem);
		
	}
	static Comparator<Integer> comp = new Comparator<Integer>() 
	{
		public int compare(Integer i1, Integer i2) 
		{
		return i1 - i2;
		}
	};
	
	public static void main(String[] args)
	{
		try(FileWriter fw = new FileWriter(new File("visualization/data.csv"))) { //open up a file writer so we can write to file.
		int size = 2;
		System.out.println("AddFirst Average");
		fw.write("AddFirst Test (Doubly Linked List)" + "\t" + "Number of items" + "\t" + "Time in NanoSeconds" + "\n");

		DoublyLinkedList<String> temp = new DoublyLinkedList<String>();
		for (int i = 1; size < 1000000; size = size * 2)
		{		
     	startTime = System.nanoTime();
     	temp.addFirst("CatsAreGreat");	
     	stopTime = System.nanoTime();
     	aveTime = stopTime - startTime;
     	System.out.printf("%d \n", aveTime);
     	fw.write("Add First" + "\t" + size + "\t" + aveTime + "\n"); // write to file.
		}
		}
	
		
  		catch (IOException e) 
  		{
			e.printStackTrace();
		
  		}
		
	
	}
}
	
