package interfaceexample;

public class Child implements Parent1, Parent2{

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
