package salaryCalculator;

public class Employee {
	double minimumPay = 8.0;
	int maximumHours = 60;
	double overtimeRate = 1.5;
	int maxBaseHours = 40;
				
	public String name;
	public double basePay;
	public int numHoursWorked;
		
	public Employee(String n, double base, int numHours) {
		name = n;
		basePay = base;
		numHoursWorked = numHours;
	}
		
	double getMinPay(){
			return minimumPay;
		}
		
	double getMaxHours(){
			return maximumHours;
		}
				
	double getOvertimeRate(){
			return overtimeRate;
		}
				
	double getMaxBaseHours(){
			return maxBaseHours;
		}
				
				
	void calculateTotalPay() {
		if (basePay >= getMinPay() & numHoursWorked <= getMaxHours())
			if (numHoursWorked <= getMaxBaseHours())
					System.out.println("Total pay is: $" + basePay * numHoursWorked);
			else System.out.println("Total pay is: $" + ((basePay * getMaxBaseHours()) + (basePay * getOvertimeRate()) * (numHoursWorked - getMaxBaseHours())));
		else System.out.println("The number of hours worked is too high or the base pay entered is too low.");
	}

}
