
public class FooCorporation {

	public static void calculateTotalPay(double basePay, double numHoursWorked) {
		if (basePay >= 8 & numHoursWorked <= 60)
			if (numHoursWorked <= 40)
				System.out.println("Total pay is: $" + basePay * numHoursWorked);
			else System.out.println("Total pay is: $" + ((basePay * 40) + (basePay * 1.5) * (numHoursWorked - 40)));
		else System.out.println("The number of hours worked is too high or the base pay entered is too low.");
	}
	
	public static void main(String [] args) {
		calculateTotalPay(7.5, 35);
		calculateTotalPay(8.2, 47);
		calculateTotalPay(10, 73);
	}
}
