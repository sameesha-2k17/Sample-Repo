package interfaceexample;

public class InterfaceChild implements InterfaceParent{

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("This is test display");
		
	}

	@Override
	public void print() {
		System.out.println("This is test print");
		// TODO Auto-generated method stub
		
	}
	public static void main(String[] args) {
		InterfaceChild obj= new InterfaceChild();
		 obj.display();
		 obj.print();
		 
		}
}
