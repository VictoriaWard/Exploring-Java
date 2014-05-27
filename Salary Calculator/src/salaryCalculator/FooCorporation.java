package salaryCalculator;

public class FooCorporation {
	

	public static void main(String [] args) {
		//creates employee class instances
		Employee a = new Employee("Fred Bosh", 7.5, 35);
		Employee b = new Employee("Gary Brown", 8.2, 47);
		Employee c = new Employee("Jo Smith", 10, 73);
		Employee d = new Employee("Susan Straw", 7, 65);
		Employee e = new Employee("Doug Thomson", 9.5, 60);
		Employee f = new Employee("Andrew Wood", 8, 61);
		
		//calls employee class method on employee instances to calculate total pay
		a.calculateTotalPay();	//should print base pay too low
		b.calculateTotalPay();	//should print 414.10
		c.calculateTotalPay();	//should print hours too high
		d.calculateTotalPay();	//should print base pay too low and hours too high
		e.calculateTotalPay();	//should print 665.00
		f.calculateTotalPay();	//should print hours too high
	}
}
