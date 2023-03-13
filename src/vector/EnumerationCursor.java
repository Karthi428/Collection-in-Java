package vector;

import java.util.Enumeration;
import java.util.Vector;

public class EnumerationCursor 
{
	
	public static void main(String[] args) {
        Vector<String> animals= new Vector<>();
        animals.add("Dog");
        animals.add("Horse");
        animals.add("Cat");
	
	Enumeration en = animals.elements();
	while(en.hasMoreElements())
	{
		System.out.println(en.nextElement());
	}
	}
}
