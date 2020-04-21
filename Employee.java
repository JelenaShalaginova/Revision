package revision;


public class Employee {
	private int id, salary;  
	private String name, position, department, company;
	
	//constructor with 4 parameters
	public Employee (String name, String position, int salary, String company){
		this.name = name;
		this.position = position;
		this.salary = salary;
		this.company = company;
		this.id = (int) ((Math.random()*100)+1);
		this.department = "Department not yet assigned";

	}
	
	//declare set get methods for department, position, salary
	//set methods
	public void setPosition(String position) {
		this.position = position;
	}
	
	public void setDepartment(String department) {
		this.department = department;
	}
	
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	//get methods
	public String getPosition() {
		return position;
	}
	
	public String getDepartment() {
		return department;
	}
	public int getSalary() {
		return salary;
	}
	
	public int getId() {
		return id;
	}
	
	public String toString() {
		return "Employee" + " "+ name + ", position: " + position + ", department: " + department 
				+ ", company: " + company +", salary: " + salary;
	}
	
	
}
