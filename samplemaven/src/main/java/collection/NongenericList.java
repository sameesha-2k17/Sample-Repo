package collection;

import java.util.ArrayList;
import java.util.List;

public class NongenericList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List L = new ArrayList();
		
		L.add("red");
		L.add("blue");
		L.add("green");
		L.add("red");
		L.add(1);
		L.add(2);
		L.add(3);
		System.out.println(L);
		System.out.println(L.get(1));
		L.set(2, "white");
		System.out.println(L);
		System.out.println(L.indexOf("red"));
		System.out.println(L.lastIndexOf("red"));
		L.remove(3);
		System.out.println(L);
		System.out.println(L.contains(3));
		System.out.println(L.isEmpty());
		System.out.println(L.size());
	}

}
