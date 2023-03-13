package queue;

import java.util.ArrayDeque;

public class ArraydequeMethods 
{
	public static void main(String[] args) {
        ArrayDeque<String> animals= new ArrayDeque<>();
        animals.add("Dog");
        animals.add("Cat");
        animals.add("Horse");
        System.out.println("ArrayDeque: " + animals);

        // Get the first element
        String firstElement = animals.getFirst();
        System.out.println("First Element: " + firstElement);

        // Get the last element
        String lastElement = animals.getLast();
        System.out.println("Last Element: " + lastElement);
        
        // Using peek()
        String element = animals.peek();
        System.out.println("Head Element: " + element);

        // Using peekFirst()
        String firstElement1 = animals.peekFirst();
        System.out.println("First Element: " + firstElement1);

        // Using peekLast
        String lastElement1 = animals.peekLast();
        System.out.println("Last Element: " + lastElement1);
        
    
        
        // Using poll()
        String element3 = animals.poll();
        System.out.println("Removed Element: " + element3);
        System.out.println("New ArrayDeque: " + animals);

        // Using pollFirst()
        String firstElement3 = animals.pollFirst();
        System.out.println("Removed First Element: " + firstElement3);

        // Using pollLast()
        String lastElement3 = animals.pollLast();
        System.out.println("Removed Last Element: " + lastElement3);

        // Using removeFirst()
        String firstElement2 = animals.removeFirst();
        System.out.println("Removed First Element: " + firstElement2);

        // Using removeLast()
        String lastElement2 = animals.removeLast();
        System.out.println("Removed Last Element: " + lastElement2);
	
	}
}