package linkedlist;

import java.util.Iterator;
import java.util.LinkedList;

public class IteratingLinkedlist 
{
	public static void main(String[] args){
	    // create linkedlist
	    LinkedList<String> animals = new LinkedList<>();

	    // add() method without the index parameter
	    animals.add("Dog");
	    animals.add("Cat");
	    animals.add("Cow");
	    System.out.println("LinkedList: " + animals);
	    

		//Traversing list through Iterator  
		//getting the Iterator
		  Iterator itr=animals.iterator();
		  
		  System.out.println("Using Iterative method Loop----------------------------");
		//check if iterator has the elements
		  while(itr.hasNext())
		  {
			//printing the element and move to next 
			  System.out.println(itr.next());
		  }
		
			 System.out.println("Using For-Each Loop----------------------------");
			  //For each loop
			  for(String names:animals)
			  {
				  System.out.println(names);
			  }
	}
}
