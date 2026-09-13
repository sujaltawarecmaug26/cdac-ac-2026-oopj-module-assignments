class Employee{
	
	private String name;
	private String yearOfJoining;
	private double salary;
	private String Address;
	
	public Employee(String name, String yearOfJoining, double salary, String address) {
		this.name = name;
		this.yearOfJoining = yearOfJoining;
		this.salary = salary;
		Address = address;
	}

	public String getName() {
		return name;
	}

	public String getYearOfJoining() {
		return yearOfJoining;
	}

	public double getSalary() {
		return salary;
	}

	public String getAddress() {
		return Address;
	}

}




public class EmployeeProgram {

	public static void main(String[] args) {
		
		Employee emp1 = new Employee("Robert","1994",1100,"64C- WallsStreat");
		Employee emp2 = new Employee("Sam","2000",1900,"68D- WallsStreat");
		Employee emp3 = new Employee("John","1999",2000,"26B- WallsStreat");
		
		
		System.out.println("Name  " + "Year of joining  " + " Address ");
		System.out.println(emp1.getName()+"    " + emp1.getYearOfJoining() + "        " + emp1.getAddress());
		System.out.println(emp2.getName()+"    " + emp2.getYearOfJoining() + "        " + emp2.getAddress());
		System.out.println(emp3.getName()+"    " + emp3.getYearOfJoining() + "        " + emp3.getAddress());
		
		

	}

}
