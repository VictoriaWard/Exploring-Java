package salaryCalculator;

public class FooCorporation {
	

	public static void main(String [] args) {
		Employee a = new Employee("Fred Bosh", 7.5, 35);
		Employee b = new Employee("Gary Brown", 8.2, 47);
		Employee c = new Employee("Jo Smith", 10, 73);
	
		a.calculateTotalPay();
		b.calculateTotalPay();
		c.calculateTotalPay();
	}
}
