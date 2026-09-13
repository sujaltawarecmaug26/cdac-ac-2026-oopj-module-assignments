class Shape{
	
	public void display() {
		System.out.println("This is Shape");
	}
}

class Rectangles extends Shape{
	
	public void printRectangle() {
		System.out.println("This is rectangular shape");
	}
}

class Circle extends Shape{
	
	public void printCircle() {
		System.out.println("This is cricular Shape");
	}
}

class Squares extends Rectangles{
	public void printSquare() {
		System.out.println("Square is a rectangle");
	}
}



public class ShapeProgram {

	public static void main(String[] args) {
		
		Squares sObj = new Squares();
		
		sObj.printSquare();
		sObj.printRectangle();
		

	}

}
