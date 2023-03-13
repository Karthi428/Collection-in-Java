package arraylist;

import java.util.ArrayList;
import java.util.ListIterator;

public class ListIterativeMethod 
{
	public static void main(String[] args)
	{
		ArrayList<String> list1 = new ArrayList<String>();
		
		//add method.... if you want to add object in Collection Object, we can use add method
		list1.add("Karthik");
		list1.add("Malathi");
		list1.add("Gayathri");
		list1.add("Shreedhar");
		list1.add("Pavithra");	

		ListIterator<String> lti = list1.listIterator();
		
		System.out.println("Getting elements Forword postiton____________");
		while(lti.hasNext())
		{
			System.out.println(lti.next());
		}
		
		System.out.println("Getting elements Backword postiton____________");
		while(lti.hasPrevious())
		{
			System.out.println(lti.previous());
		}
		
	}
}
