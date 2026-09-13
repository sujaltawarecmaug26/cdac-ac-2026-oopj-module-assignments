
abstract class Employee {
	protected String name;
	protected String address;
	protected int age;
	protected char gender;
	protected float basicSalary;
	
	Employee(String name, String address, int age, char gender, float basicSalary) {

	    setName(name);
	    setAddress(address);
	    setAge(age);
	    setGender(gender);
	    setBasicSalary(basicSalary);
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getAge() {
		
		return age;
	}
	public void setAge(int age) {
		if(age < 18 || age > 65)
			this.age = 21;
		else
			this.age = age;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public float getBasicSalary() {
		return basicSalary;
	}
	public void setBasicSalary(float basicSalary) {
		this.basicSalary = basicSalary;
	}
	
	
}

class Manager extends Employee{
		float hra;
	
	public Manager(String name, String address, int age, char gender, float basicSalary, float hra) {
		super(name,address,age,gender,basicSalary);
		this.hra = hra;
	}
	
	public float getHra() {
		return hra;
	}
	
}

class Engineer extends Employee{
	float overtime;
	
	public Engineer(String name, String address, int age, char gender, float basicSalary, float overtime) {
		super(name,address, age, gender, basicSalary);
		this.overtime = overtime;
	}

	public float getOvertime() {
		return overtime;
	}

	public void setOvertime(float overtime) {
		this.overtime = overtime;
	}
	
	
	
}

class SalesPerson extends Employee{
	float commission;
	
	public SalesPerson(String name, String address, int age, char gender, float basicSalary, float commission) {
		super(name,address, age, gender, basicSalary);
		this.commission = commission;
	}

	public float getCommission() {
		return commission;
	}

	public void setCommission(float commission) {
		this.commission = commission;
	}
}























