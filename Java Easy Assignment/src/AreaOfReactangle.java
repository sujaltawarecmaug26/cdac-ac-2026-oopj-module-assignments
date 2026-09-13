
class Rectangle{
	private int length;
	private int breadth;
	
	
	public Rectangle(int l, int b) {
		length = l;
		breadth = b;
	}
	
	public int area() {
		return length * breadth;
	}
	
	
}




public class AreaOfReactangle {
	

	public static void main(String[] args) {
		
		Rectangle r1 = new Rectangle(4,5);
		Rectangle r2 = new Rectangle(5,8);
		
		System.out.println("Area of Rectangle : " + r1.area());
		System.out.println("Area of Rectangle : " + r2.area());
		
	}

}
