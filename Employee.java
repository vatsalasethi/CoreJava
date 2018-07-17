
public class Employee {

	private int employeeId;
	private String employeeName;
	double employeeSalary;

		
		

		
		
		
		private double calculateBonus() {
			
		double bonus=0.0;
		if(this.employeeSalary<=5000)
			bonus=this.employeeSalary*.2;
		else
			bonus=this.employeeSalary*.1;
		return bonus;
		
	}
}
