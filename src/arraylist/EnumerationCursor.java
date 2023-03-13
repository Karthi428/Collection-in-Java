package arraylist;

import java.util.Enumeration;
import java.util.Vector;

public class EnumerationCursor 
{
	public static void main(String[] args) {
		
		Vector vc = new Vector();
		final int a =15;
		
		vc.add("Karthik");
		vc.add(10);
		vc.add("CTS");
		
		System.out.println(vc);
		
		Enumeration en = vc.elements();
		while(en.hasMoreElements())
		{
			System.out.println(en.nextElement());
		}
		
		
	}
}
