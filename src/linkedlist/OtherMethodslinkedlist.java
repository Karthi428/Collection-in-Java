package linkedlist;

import java.util.LinkedList;

public class OtherMethodslinkedlist 
{
	public static void main(String[] args){
	    // create linkedlist
	    LinkedList<String> animals = new LinkedList<>();

	    // add() method without the index parameter
	    animals.add("Dog");
	    animals.add("Cat");
	    animals.add("Cow");
	    System.out.println("LinkedList: " + animals);
	    
	    //checks if the LinkedList contains the element
	    System.out.println(animals.contains("Cow"));
	    
	    //returns the index of the first occurrence of the element
	    System.out.println(animals.indexOf("Cow"));
	    
	    //removes all the elements of the LinkedList
	    animals.clear();
	    
	    System.out.println(animals);
	    
	}
}
