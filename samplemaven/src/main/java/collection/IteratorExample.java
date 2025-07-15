package collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class IteratorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set <String> a= new HashSet <String>();
		a.add("black");
		a.add("Green");
		a.add("Violet");
		System.out.println(a);
		Iterator i =  a.iterator();
		while(i.hasNext())
			{
			System.out.println(i.next());	
		}
		i.remove();
		System.out.println(a);
		
	//for each loop
	 int array[] = {1, 2, 3, 4};
	// for (datatype variable:arrayname)
	for(int b: array)
	{
		System.out.println(b);
	}
	for(String c:a)
	{
		System.out.println(c);
	}
}

}
