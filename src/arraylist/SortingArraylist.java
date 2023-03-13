package arraylist;

import java.util.ArrayList;
import java.util.Collections;

public class SortingArraylist {

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
		
		//sorting the list
		Collections.sort(list1);
		
		for(String names:list1)
		{
			System.out.println(names);
		}
		
	}

}
