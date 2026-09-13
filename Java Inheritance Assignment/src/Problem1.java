class Parent{
	
	public void showParent() {
		System.out.println("This is Parent Class");
	}
	
}

class Child extends Parent{
	
	public void showChild() {
		System.out.println("This is Child Class");
	}
}


public class Problem1 {

	public static void main(String[] args) {
		
		//method of parent class by object of parent class
		Parent parentObj = new Parent();
		parentObj.showParent();
		
		// method of child class by object of child class
		Child childObj = new Child();
		childObj.showChild();
		
		//method of parent class by object of child class
		childObj.showParent();

	}

}
