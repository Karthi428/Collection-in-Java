package vector;

import java.util.Vector;

public class MethodsofVector 
{
	public static void main(String[] args) {
        Vector<String> mammals= new Vector<>();

        // Using the add() method
        mammals.add("Dog");
        mammals.add("Horse");

        // Using index number
        mammals.add(2, "Cat");
        System.out.println("Vector: " + mammals);

        // Using addAll()
        Vector<String> animals = new Vector<>();
        animals.add("Crocodile");

        animals.addAll(mammals);
        System.out.println("New Vector: " + animals);
        
        // Using get()
        String element = animals.get(2);
        System.out.println("Element at index 2: " + element);

        String element2 = animals.remove(1);
        System.out.println("Removed Element: " + element2);
        System.out.println("New Vector: " + animals);

        // Using clear()
        animals.clear();
        System.out.println("Vector after clear(): " + animals);
        
        
    }
}
