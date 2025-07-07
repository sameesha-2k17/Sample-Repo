package accessmodifiers;

public class AccessModifier1 {
	
	public void display1()
	{
		System.out.println("Public");
	}
	protected void display2()
	{
		System.out.println("Protected");
	}
    
	private void display3()
	{
		System.out.println("Private");
	}
	void display4()
	{
		System.out.println("Default");
	}
	public static void main(String[] args) {
		AccessModifier1 obj= new AccessModifier1();
		obj.display1();
		obj.display2();
		obj.display3();
		obj.display4();

	}

}
