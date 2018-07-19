class employee1
{
	
	double salary;
	String name;
	int eid;
	String dept;
	Address add;
	
	employee1(double salary, String name, int eid, String dept, Address add){
		this.salary=salary;
		this.name=name;
		this.eid=eid;
		this.dept=dept;
		this.add=add;
		
		
	}
	
	public void printEmployeeDetails()
	{
		System.out.println(this.name);
		System.out.println(this.salary);
		System.out.println(this.eid);
		System.out.println(this.dept);
		add.printAddress();
		
	}
	
}



class Address{
	
	int flatnum;
	String flatname;
	
	
	Address(int f, String n){
		flatnum=f;
		flatname=n;
	}
	public void printAddress() {
	
		System.out.println(flatnum);
		System.out.println(flatname);
		
	}
}



public class HASA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Address a= new Address(4, "sdffd");
		employee1 e = new employee1(34682.4, "Vatsala", 23,"Core", a);
		e.printEmployeeDetails();	
	}

}
