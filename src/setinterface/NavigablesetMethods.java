package setinterface;

import java.util.Iterator;
import java.util.NavigableSet;
import java.util.TreeSet;

public class NavigablesetMethods
{
	public static void main(String[] args) {
        // Creating NavigableSet using the TreeSet
        NavigableSet<Integer> numbers = new TreeSet<>();

        // Insert elements to the set
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(5);
        System.out.println("NavigableSet: " + numbers);

        // Access the first element
        int firstElement = numbers.first();
        System.out.println("First Number: " + firstElement);

        // Access the last element
        int lastElement = numbers.last();
        System.out.println("Last Element: " + lastElement);
        
        //reverses the order of elements in a set
        NavigableSet reverse = numbers.descendingSet();
        System.out.println("Decending Set: "+reverse);
        
        //returns an iterator that can be used to iterate over a set in reverse order
        Iterator reverse1 = numbers.descendingIterator();
        while(reverse1.hasNext())
        {
        	System.out.println(reverse1.next());
        }
        
        
        //The ceiling() method returns the least (smallest) element in this set that is greater than or equal to the element passed as parameter to the ceiling() method.
      //ceiling will be "5".
        System.out.println("Ceiling Method: "+numbers.ceiling(4));
        
        //returns the greatest element among those elements that are less than or equal to the specified element
      //floor will be "3".
        System.out.println("Flood Method: "+numbers.floor(4));
        
        //The higher() method returns the least (smallest) element in this set that is greater than (not equal too) the element passed as parameter to the higher() method.
       //higher will be "5".
        System.out.println("Highter Method: "+numbers.higher(4));
        
        //The lower() method does the opposite of the higher() method, meaning it returns the highest element that is less than (not equal to) the given parameter
        //lower will be "3"
        System.out.println("Lower Method: "+numbers.lower(4));
        
        // Remove the first element
        int number1 = numbers.pollFirst();
        System.out.println("Removed First Element: " + number1);

        // Remove the last element
        int number2 = numbers.pollLast();
        System.out.println("Removed Last Element: " + number2);
        
        
	
	}
}
