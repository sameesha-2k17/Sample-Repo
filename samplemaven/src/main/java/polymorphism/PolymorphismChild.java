package polymorphism;

public class PolymorphismChild extends PolymorphismParent {
	
	public void display(int a,int b) {
		System.out.println(a-b);
		super.display(6, 3); //get parent
		
	}

	public static void main(String[] args) {
		
		PolymorphismChild obj=new PolymorphismChild();
		obj.display(5,3);
		// TODO Auto-generated method stub

	}

}
