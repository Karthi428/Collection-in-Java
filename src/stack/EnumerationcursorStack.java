package stack;

import java.util.Enumeration;
import java.util.Stack;

public class EnumerationcursorStack
{
	 public static void main(String[] args) {
	        Stack<String> animals= new Stack<>();

	        // Add elements to Stack
	        animals.push("Dog");
	        animals.push("Horse");
	        animals.push("Cat");

	        System.out.println("Stack: " + animals);
	        Enumeration en = animals.elements();
	    	while(en.hasMoreElements())
	    	{
	    		System.out.println(en.nextElement());
	    	}
	        
	 }
}
