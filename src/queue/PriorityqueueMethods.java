package queue;

import java.util.Iterator;
import java.util.PriorityQueue;

public class PriorityqueueMethods 
{

		public static void main(String[] args) {

	        // Creating a priority queue
	        PriorityQueue<Integer> numbers = new PriorityQueue<>();

	        // Using the add() method
	        numbers.add(4);
	        numbers.add(2);
	        System.out.println("PriorityQueue: " + numbers);

	        //offer() - Inserts the specified element to the queue
	        // Using the offer() method
	        numbers.offer(1);
	        System.out.println("Updated PriorityQueue: " + numbers);
	        
	        //This method returns the head of the queue
	        // Using the peek() method
	        int number = numbers.peek();
	        System.out.println("Accessed Element: " + number);
	
	        //returns and removes the head of the queue
	        // Using the poll() method
	        int number1 = numbers.poll();
	        System.out.println("Removed Element Using poll(): " + number1);
		
	        //Using the iterator() method
	        Iterator<Integer> iterate = numbers.iterator();
	        while(iterate.hasNext()) {
	            System.out.println(iterate.next());
	            
	        }
	        
	        
	        
		}
    
}
