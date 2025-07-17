package assignments;

public class SalaryCalculation extends EmployeeDetails{
	 double hra;
	    double pf;

	    public void calculateHRA_PF() {
	    	hra = 0.05 * basicPay;  // 5% HRA
	        pf =  0.20 * basicPay; // 20% PF

}
}
