
//Assignment 11 (Polymorphism)

//Program to calculate discount:
//If customer purchases clothes in Offseason, set discount to 15%, and in Onseason, set discount to 40%.
//Should use two classes:Onseason and Offseason
//Use two methods (with same method name):discount (Method name should be same)

package assignments;

public class Onseason {
	
	public void discount(double price) {
		double discountPrice= (price*40)/100;
		System.out.println("Onseason!!after 40% discount the amount need to pay is:" + (price-discountPrice));

	}

}


