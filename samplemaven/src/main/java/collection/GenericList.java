package collection;

import java.util.ArrayList;
import java.util.List;

public class GenericList {

	public static void main(String[] args) {
		
		List <String> a = new ArrayList <String>();
		a.add("red");
		a.add("blue");
		a.add("green");
		a.add("red");
		System.out.println(a);
		System.out.println(a.get(1));
		a.set(2, "white");
		System.out.println(a);
		System.out.println(a.indexOf("red"));
		System.out.println(a.lastIndexOf("red"));
		a.remove(3);
		System.out.println(a);
		a.remove(2);
		System.out.println(a);
		System.out.println(a.contains("blue"));
		System.out.println(a.isEmpty());
		System.out.println(a.size());

	}

}
