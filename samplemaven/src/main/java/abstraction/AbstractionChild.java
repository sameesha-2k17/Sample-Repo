package abstraction;

public class AbstractionChild extends AbstractionParent {

	@Override
	public void display() {
		System.out.println("This is abstract method");
		// TODO Auto-generated method stub
	}
	
	public static void main(String arg[]) {
		AbstractionChild obj = new AbstractionChild();
		obj.display();
		obj.print();
	}

}
