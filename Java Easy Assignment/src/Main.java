class Employees{
	private int salary;
	private int numberOfhr;
	
	public Employees() {
		salary = 0;
		numberOfhr = 0;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		
		if(salary < 500) {
			this.salary = salary + 10; 
		}else {
			this.salary = salary;
		}

		
	}

	public int getNumberOfhr() {
		return numberOfhr;
	}

	public void setNumberOfhr(int numberOfhr) {
		
		if(numberOfhr > 6) {
			this.salary += 5; 
		}
		
		this.numberOfhr = numberOfhr;
	}
	
	
}


public class Main {

	public static void main(String[] args) {

		Employees emp = new Employees();
		emp.setSalary(500);
		emp.setNumberOfhr(9);
		
		Employees emp2 = new Employees();
		emp2.setSalary(300);
		emp2.setNumberOfhr(5);
		
		System.out.println("Salary of Emp: " + emp.getSalary()+
				" | " + "Working hrs of Emp: " + emp.getNumberOfhr());
		
		System.out.println("Salary of Emp: " + emp2.getSalary()+
				" | " + "Working hrs of Emp: " + emp2.getNumberOfhr());
		
	}

}
