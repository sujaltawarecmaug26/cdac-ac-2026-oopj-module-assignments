class Triangle{
	private double side1;
	private double side2;
	private double side3;
	
	public Triangle(double s1, double s2, double s3) {
		side1 = s1;
		side2 = s2;
		side3 = s3;
	}
	
	//calculating parimeter
	public double getParimeter() {
		return side1 + side2 + side3;
	}
	
	//calculating area
	public double getArea() {
		double s = getParimeter() / 2;
		 return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
		
	}
	
}

public class Program{
	
	public static void main(String []args) {
		
		Triangle t = new Triangle(3,4,5);
	
		 // Printing the results
        System.out.println("Perimeter of the triangle: " + t.getParimeter() + " units");
        System.out.println("Area of the triangle: " + t.getArea() + " sq units");
	}
}