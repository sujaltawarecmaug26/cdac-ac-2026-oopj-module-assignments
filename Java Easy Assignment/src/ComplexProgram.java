class Complex {

    private int real;
    private int img;

    // Constructor
    public Complex(int real, int img) {
        this.real = real;
        this.img = img;
    }

    // Addition
    public Complex add(Complex c2) {

        Complex result = new Complex(0, 0);

        result.real = this.real + c2.real;
        result.img = this.img + c2.img;

        return result;
    }

    // Difference
    public Complex subtract(Complex c2) {

        Complex result = new Complex(0, 0);

        result.real = this.real - c2.real;
        result.img = this.img - c2.img;

        return result;
    }

    // Product
    public Complex multiply(Complex c2) {

        Complex result = new Complex(0, 0);

        result.real = (this.real * c2.real) - (this.img * c2.img);
        result.img = (this.real * c2.img) + (this.img * c2.real);

        return result;
    }

    // Display
    public void display() {

        System.out.println(real + " + " + img + "i");
    }
}


public class ComplexProgram {

    public static void main(String[] args) {

        // First complex number
        Complex c1 = new Complex(3, 4);

        // Second complex number
        Complex c2 = new Complex(5, 2);

   
        Complex sum = c1.add(c2);

        
        Complex difference = c1.subtract(c2);

      
        Complex product = c1.multiply(c2);

        System.out.print("Sum = ");
        sum.display();

        System.out.print("Difference = ");
        difference.display();

        System.out.print("Product = ");
        product.display();
    }
}