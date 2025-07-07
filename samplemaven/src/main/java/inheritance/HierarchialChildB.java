package inheritance;

public class HierarchialChildB extends HierarchialParentA{
	public void show()
	{
		System.out.println("This is a Hierarchial child class B");
	}
	public static void main(String args[]) {
		HierarchialChildB obj=new HierarchialChildB();
		obj.display();
		obj.show();
	}
}
