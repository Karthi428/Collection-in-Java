package linkedlist;

import java.util.LinkedList;

public class MethodsofLinkedlist 
{
	public static void main(String[] args){
	    // create linkedlist
	    LinkedList<String> animals = new LinkedList<>();

	    // add() method without the index parameter
	    animals.add("Dog");
	    animals.add("Cat");
	    animals.add("Cow");
	    System.out.println("LinkedList: " + animals);

	    // add() method with the index parameter
	    animals.add(1, "Horse");
	    System.out.println("Updated LinkedList: " + animals);
	    
	 // get the element from the linked list
	    //The get() method of the LinkedList class is used to access an element from the LinkedList
	    String str = animals.get(1);
	    System.out.print("Element at index 1: " + str);
	    
	 // change elements at index 3
	    //The set() method of LinkedList class is used to change elements of the LinkedList.
	    animals.set(3, "Lion");
	    System.out.println("Updated LinkedList: " + animals);
	    
	
	    System.out.println("Updated LinkedList: " + animals);
	    
	  }
	
}
