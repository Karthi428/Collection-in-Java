package stack;

import java.util.Iterator;
import java.util.Stack;
import java.util.Vector;

public class IteratingStack {

	public static void main(String[] args) {
		 Stack<String> animals= new Stack<>();
	        animals.push("Dog");
	        animals.push("Horse");
	        animals.push("Cat");
	        
	     // Using iterator()
	        Iterator<String> iterate = animals.iterator();
	        System.out.println("Stack: ");
	        while(iterate.hasNext()) {
	            System.out.println(iterate.next());
	        }

	}

}
