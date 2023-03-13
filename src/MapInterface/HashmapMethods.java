package MapInterface;

import java.util.HashMap;

public class HashmapMethods {

	public static void main(String[] args) 
	{
		// create a hashmap
	    HashMap<Integer, String> languages = new HashMap<>();

	    // add elements to hashmap
	    languages.put(8, "Java");
	    languages.put(1, "JavaScript");
	    languages.put(3, "Python");
	    System.out.println("HashMap: " + languages);
	    
	 // create another HashMap
	    HashMap<Integer, String> Otherlang = new HashMap<>();
	    Otherlang.put(7, "C++");
	    Otherlang.put(8,"Java");
	    

	    // Add all mappings from primeNumbers to numbers
	    languages.putAll(Otherlang);
	    System.out.println("Other Languages : " + languages);
	    
	    
	    /*The Java HashMap putIfAbsent() method inserts the specified key/value mapping to 
	    the hashmap if the specified key is already not present in the hashmap.*/
	    
	    // key already not present in HashMap
	    languages.putIfAbsent(4, "Swift");

	    // key already present in HashMap
	    languages.putIfAbsent(1, "Junit");
	    System.out.println("Updated Languages: " + languages);
	    
	    // return set view of keys
	    // using keySet()
	    System.out.println("Keys: " + languages.keySet());

	    // return set view of values
	    // using values()
	    System.out.println("Values: " + languages.values());

	    // return set view of key/value pairs
	    // using entrySet()
	    System.out.println("Key/Value mappings: " + languages.entrySet());
	    
	 // change element with key 2
	    languages.replace(7, "HTML");
	    System.out.println("HashMap using replace(): " + languages);

	}

}
