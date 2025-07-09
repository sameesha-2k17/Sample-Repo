package superkeyword;

public class SuperConstructorChild extends SuperConstructorParent {

	
	public SuperConstructorChild() {
		super(10,9);
		System.out.println("Constructor child");
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SuperConstructorChild obj = new SuperConstructorChild();
		
	}

}
