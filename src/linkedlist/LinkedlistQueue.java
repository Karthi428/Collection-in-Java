package linkedlist;

import java.util.LinkedList;
import java.util.Queue;

public class LinkedlistQueue 
{
	public static void main(String[] args) {
	    Queue<String> languages = new LinkedList<>();

	    // add elements
	    languages.add("Python");
	    languages.add("Java");
	    languages.add("C");
	    System.out.println("LinkedList: " + languages);

	    // returns the first element (head) of the linked list
	    String str1 = languages.peek();
	    System.out.println("Accessed Element: " + str1);

	    //returns and removes the first element from the linked list
	    String str2 = languages.poll();
	    System.out.println("Removed Element: " + str2);
	    System.out.println("LinkedList after poll(): " + languages);

	    //adds the specified element at the end of the linked list
	    languages.offer("Swift");
	    System.out.println("LinkedList after offer(): " + languages);
	  }
}
