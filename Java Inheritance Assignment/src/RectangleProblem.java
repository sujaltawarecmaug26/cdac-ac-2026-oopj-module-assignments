class Rectangle{
	public int length;
	public int breadth;
	
	public Rectangle(int length, int breadth) {
		
		this.length = length;
		this.breadth = breadth;	
	}
	public void calPerimeter() {
		int perimeter = 2 * (length + breadth);
		System.out.println("Perimeter of Rectangle is: "+ perimeter);
		
	}
	
	public void calArea() {
		int area = length * breadth;
		System.out.println("Area of Rectangle is: "+ area);
	}
}

class Square extends Rectangle{
	public int side;
	
	
	public Square(int side) {
		super(side , side);
	}
	
	

}




public class RectangleProblem {

	public static void main(String[] args) {
		//Rectangle Object
		Rectangle Robj = new Rectangle(5,8);
		
		Robj.calArea();
		Robj.calPerimeter();
		
		System.out.println();
		
		//Square object
		Square Sobj = new Square(5);
		
		Sobj.calArea();
		Sobj.calPerimeter();

	}
	

}
