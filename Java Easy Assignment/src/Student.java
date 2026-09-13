
class StudentData {
	
private	String name;
private int roll_no;
private	String phone_no;
private	String address;
	

	public void setName(String addName ) {
		name = addName;
		
	}
	public void setRollNo(int addRollNo ) {
		roll_no = addRollNo;
		
	}
	public void setPhoneNo(String addPhoneNo ) {
		phone_no = addPhoneNo;
		
	}

	public void setAddress(String addAddress ) {
		address = addAddress;
		
	}

	public  String getName() {
		return	name;
		
	}
	public int getRollNo() {
		return	roll_no;
		
	}
	public String getPhoneNo() {
		return	phone_no;
		
	}

	public String getAddress() {
		return address;
		
	}

}

public class Student {

	public static void main(String[] args) {
		
		StudentData data = new StudentData();
		
		data.setRollNo(2);
		data.setName("John");
		
		StudentData Std1 = new StudentData();
		
		Std1.setName("Sam");
		Std1.setAddress("Kharghar");
		Std1.setRollNo(3);
		Std1.setPhoneNo("987654321");
		
		
		System.out.println("Name of Student: " + data.getName() + 
				" Roll No of Student: " + data.getRollNo());
		
		System.out.println("Name of Student: " + Std1.getName() + 
				" Roll No of Student: " + Std1.getRollNo()
				+ " Phone No: " + Std1.getPhoneNo() + " Address of Student: " + Std1.getAddress());
		
	}

}
