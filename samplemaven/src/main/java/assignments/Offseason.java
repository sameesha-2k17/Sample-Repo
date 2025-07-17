//Assignment 11 (Polymorphism)

//Program to calculate discount:
//If customer purchases clothes in Offseason, set discount to 15%, and in Onseason, set discount to 40%.
//Should use two classes:Onseason and Offseason
//Use two methods (with same method name):discount (Method name should be same)


package assignments;

// child class
public class Offseason extends Onseason {
	
	public void discount(double price) {
		double discountPrice= (price*15)/100;
		System.out.println("Offseason!!after 15% discount the amount need to pay is:" + (price-discountPrice));
		super.discount(1000);
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Offseason obj = new Offseason();
		obj.discount(1000);
	}

}
