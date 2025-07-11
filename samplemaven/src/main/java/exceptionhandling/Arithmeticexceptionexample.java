package exceptionhandling;

public class Arithmeticexceptionexample {

	public static void main(String[] args) {
		
		int a=100;
		int b=0;
		try {
		int c=a/b;
		}
		
//		catch(ArithmeticException e)
//		{
//			 b=4;
//			 int d =a/b;
//			System.out.println(d);
//			System.out.println(e);
//		}
//		
//		System.out.println("can i execute");
		
		finally 
		{
			b=10;
			int d=a/b;
			System.out.println(d);
			
		}
		
		System.out.println("can i execute");	
	}

}