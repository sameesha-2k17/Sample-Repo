// program to check addition result divisible by 10
//class 1:return addition result of two numbers

//class2: check addition result divisible by 10(use super keyword)

package assignments;

public class CheckDivision extends Addition {
	
	public void division(int a,int b) {
		int d= super.add(a,b); // Calling parent class method using super
		System.out.println("Addition result: " + d);
	
		if (d % 10 == 0) {
            System.out.println("The result is divisible by 10.");
        } else {
            System.out.println("The result is NOT divisible by 10.");
        }
    }
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CheckDivision obj=new CheckDivision();
		obj.division(2,15);

	}

}
