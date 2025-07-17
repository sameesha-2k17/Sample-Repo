package assignments;

public class SalarySlip extends SalaryCalculation  {
	
	double totalSalary;
	
	
	public void display() {
	
	calculateHRA_PF();
	
	totalSalary = basicPay + hra - pf - deduction + bonus;
		
	 // Display Salary Slip
    System.out.println("------ Salary Slip ------");
    System.out.println("Basic Pay   : ₹" + basicPay);
    System.out.println("Deduction   : ₹" + deduction);
    System.out.println("Bonus       : ₹" + bonus);
    System.out.println("HRA (5%)    : ₹" + hra);
    System.out.println("PF (20%)    : ₹" + pf);
    System.out.println("Total Salary: ₹" + totalSalary);
	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SalarySlip  obj= new SalarySlip();
		obj.SalaryDetails(30000,2000,5000);
		obj.display();
	}

}
