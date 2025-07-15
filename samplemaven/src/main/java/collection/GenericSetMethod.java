package collection;

import java.util.HashSet;
import java.util.Set;

public class GenericSetMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  Set <String> a= new HashSet <String>();
     a.add("Apple");
     a.add("Grapes");
     a.add("Mango");
     System.out.println(a);
     Set <String> b= new HashSet <String>(); 
     b.add("Orange");
     b.add("pappaya");
     System.out.println(b);
     a.addAll(b);
     System.out.println(a);
     
     System.out.println(a.contains("pappaya"));
     System.out.println(a.containsAll(b));
     System.out.println(b.containsAll(a));
     System.out.println(a.isEmpty());
     a.remove("Mango");
     System.out.println(a);
     System.out.println(a.size());
     a.removeAll(b);
     System.out.println(a);
     b.clear();
     System.out.println(b);
     
	}

}
