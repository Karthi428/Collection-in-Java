package arraylist;

import java.util.ArrayList;



public class AddandAddallmethod 
{
	public static void main(String[] args) {
	
		//Creating Arraylist
	ArrayList<String> list1 = new ArrayList<String>();
	
	//add method.... if you want to add object in Collection Object, we can use add method
	list1.add("Karthik");
	list1.add("Malathi");
	list1.add("Gayathri");
	list1.add("Shreedhar");
	list1.add("Pavithra");
	System.out.println(list1);
	
	ArrayList<String> list2 = new ArrayList<String>();
	list2.add("Surya");
	list2.add("Dinesh");
	System.out.println(list2);
	
	//addall method.... if you want to add collection object into the another collection object we can use addall method
	list1.addAll(list2);
	
	System.out.println(list1);
	
	//it will return the boolean value and checking the collection object is empty or not
	//if it is empty it will print true otherwise it will print false
	System.out.println(list1.isEmpty());
	
	//contains will check the given object is presented in the Collection Object
	//if it is presented it will return true, if not false
	System.out.println(list1.contains("Vijay"));
	
	//it will return size of the collection object
	System.out.println(list1.size());
	
	//it will remove the object from collection object
	System.out.println(list1.remove(4));
	
	//it will return size of the collection object
	System.out.println(list1.size());
	
	
}
}
