package arraylist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class IteratingArraylist
{
	public static void main(String[] args) {
		ArrayList<String> list1 = new ArrayList<String>();
		
		//add method.... if you want to add object in Collection Object, we can use add method
		list1.add("Karthik");
		list1.add("Malathi");
		list1.add("Gayathri");
		list1.add("Shreedhar");
		list1.add("Pavithra");
		
		ArrayList<String> list2 = new ArrayList<String>();
		list2.add("Surya");
		list2.add("Vijay");

		
		//addall method.... if you want to collection object into the another collection object we can use addall method
		list1.addAll(list2);
		
		
		//Traversing list through Iterator  
		//getting the Iterator
		  Iterator itr=list1.iterator();
		  
		  System.out.println("Using Iterative method Loop----------------------------");
		//check if iterator has the elements
		  while(itr.hasNext())
		  {
			//printing the element and move to next 
			  System.out.println(itr.next());
		  }
		
			 System.out.println("Using For-Each Loop----------------------------");
			  //For each loop
			  for(String names:list1)
			  {
				  System.out.println(names);
			  }
	}
}
