//➤ Program to withdraw amount from an ATM
//➤ Class 1 – Bank:
// One method to set pin from "User" class and validate pin in another method
// [Valid pins – 1001, 1234, 1212]
//➤ Pin number should be declared as private
//➤ Class 2 – User:
// Get the pin from User

package assignments;

public class EncapsulationUser {
	private int pin;
	public void setter(int pin) {
		this.pin=pin;
	}
	
	public void getter() {
		if (pin== 1001||pin==1234||pin==1212)
        {
	System.out.println("You can withdraw");	
	}
	else
           {
	System.out.println("pin validation failed");	
	}

	}

}
