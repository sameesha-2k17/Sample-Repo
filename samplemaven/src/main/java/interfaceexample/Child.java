package interfaceexample;

public class Child implements InterfaceParent1, InterfaceParent2{

	public static void main(String[] args) {
		
		Child obj = new Child();
		obj.display();
		obj.print();
		// TODO Auto-generated; method stub

	}

	@Override
	public void print() {
		System.out.println("Print Method");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void display() {
		System.out.println("Display Method");
		// TODO Auto-generated method stub
		
	}

}
