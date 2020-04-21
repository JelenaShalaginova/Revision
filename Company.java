package revision;

public class Company {

	public static void main(String[] args) {
		
		//declare and create 3 objects and set parameters
		Employee employee1 = new Employee ("Sally", "administrator", 1000, "Unilever");
		int startSal1 = employee1.getSalary();
		Employee employee2 = new Employee ("John", "manager", 1500, "Unilever");
		int startSal2 = employee2.getSalary();
		Employee employee3 = new Employee ("Clare", "accountant", 1500, "Unilever");
		int startSal3 = employee3.getSalary();
		
		//set department
		employee1.setDepartment("IT");
		employee2.setDepartment("Supply Chain");
		employee3.setDepartment("Accounting");
		

		System.out.println("After 1 year within the company: ");
		
		//set to change your employee promotion from position to salary
		employee1.setPosition("Manager");
		employee1.setSalary(1500);
		
		employee2.setPosition("Senior manager");
		employee2.setSalary(2000);
		
		employee3.setPosition("chief accountant");
		employee3.setSalary(2500);
		
		int salNew1 = employee1.getSalary();
		int SalaryDiff1 = (salNew1 - startSal1);
		
		int salNew2 = employee2.getSalary();
		int SalaryDiff2 = (salNew2 - startSal2);
		
		int salNew3 = employee3.getSalary();
		int SalaryDiff3 = (salNew3 - startSal3);
		
		System.out.println(employee1.toString() + " got salary increased by " + SalaryDiff1 + " EUR");
		System.out.println(employee2.toString() + " got salary increased by " + SalaryDiff2 + " EUR");
		System.out.println(employee3.toString() + " got salary increased by " + SalaryDiff3 + " EUR");
	}//end main

}//end class
