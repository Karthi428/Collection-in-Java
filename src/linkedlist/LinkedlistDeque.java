package linkedlist;

import java.util.Deque;
import java.util.LinkedList;

public class LinkedlistDeque 
{
	public static void main(String[] args){
	    Deque<String> animals = new LinkedList<>();

	    // add element at the beginning
	    animals.add("Cow");
	    System.out.println("LinkedList: " + animals);
	    
	    //adds the specified element at the beginning of the linked list
	    animals.addFirst("Dog");
	    System.out.println("LinkedList after addFirst(): " + animals);

	    //adds the specified element at the end of the linked list
	    animals.addLast("Zebra");
	    System.out.println("LinkedList after addLast(): " + animals);
	    
	    //returns the first element
	    System.out.println("LinkedList getting firstelement - "+animals.getFirst());
	    
	    //returns the last element
	    System.out.println("LinkedList getting lastelement - "+animals.getLast());

	    	    
	    // remove the first element
	    animals.removeFirst();
	    System.out.println("LinkedList after removeFirst(): " + animals);

	    // remove the last element
	    animals.removeLast();
	    System.out.println("LinkedList after removeLast(): " + animals);
	  }
}
