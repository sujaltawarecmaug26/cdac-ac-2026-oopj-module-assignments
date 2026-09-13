
class Member{
	public String name;
	public int age;
	public long phoneNo;
	public String address;
	public int salary;
	
	

	public void setName(String name) {
		this.name = name;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public void setPhoneNo(long phoneNo) {
		this.phoneNo = phoneNo;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public void setSalary(int salary) {
		this.salary = salary;
	}
	

	
	public void printSalary() {
		System.out.println("Salary of Member is: " + salary);
	}
	
	
	
	
}

class PrimeMembers extends Member{
	public int joiningYear;
	public int joinigFees;
	public boolean isActive;
	
	
	
	public void setJoiningYear(int joiningYear) {
		this.joiningYear = joiningYear;
	}



	public void setJoinigFees(int joinigFees) {
		this.joinigFees = joinigFees;
	}



	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}



	public void display() {
		System.out.println("------------------Member Details-----------------------");
		System.out.println("Name of Member is: " + name);
		System.out.println("Age of Member is: " + age);
		System.out.println("Phone Number of Member is: " + phoneNo);
		System.out.println("Address of Member is: " + address);
		
	}
	
}




public class MemberProblem {

	public static void main(String[] args) {
		
		Member memberObj = new Member();
		PrimeMembers primeMemberObj = new PrimeMembers();
		
		System.out.println("Enter Member Name: ");
		String name = ConsoleInput.getString();
		
		System.out.println("Enter Member Age: ");
		int age = ConsoleInput.getInt();
		
		System.out.println("Enter Member Address: ");
		String address = ConsoleInput.getString();
		
		System.out.println("Enter Member Phone Number: ");
		long phoneno = ConsoleInput.getInt();
		
		System.out.println("Enter Member Salary: ");
		int salary = ConsoleInput.getInt();
		
		System.out.println("Enter Member Joining Fees: ");
		int fees = ConsoleInput.getInt();
		
//		System.out.println("Enter Member Active Status: ");
//		String status = ConsoleInput.getString();
		
		System.out.println("Enter Member Joining Year: ");
		int year = ConsoleInput.getInt();
		
		
		
		memberObj.setName(name);
		memberObj.setAge(age);
		memberObj.setAddress(address);
		memberObj.setPhoneNo(phoneno);
		memberObj.setSalary(salary);
//		primeMemberObj.setActive(status);
		primeMemberObj.setJoinigFees(fees);
		primeMemberObj.setJoiningYear(year);
		

		primeMemberObj.display();
		memberObj.printSalary();
		
		
		

	}

}
