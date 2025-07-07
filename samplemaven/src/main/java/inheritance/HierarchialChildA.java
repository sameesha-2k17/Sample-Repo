package inheritance;

public class HierarchialChildA extends HierarchialParentA {
	public void print()
	{
		System.out.println("This is a child class A");
	}
	public static void main(String args[]) {
		HierarchialChildA obj=new HierarchialChildA();
		obj.display();
		obj.print();
	}
}
