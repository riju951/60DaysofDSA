class Complex {
    int real;
    int imag;

    // Constructor to initialize the complex number
    public Complex(int r, int i) {
        real = r;
        imag = i;
    }

    // Method to add two complex numbers
    public static Complex add(Complex a, Complex b) {
        return new Complex(a.real + b.real, a.imag + b.imag);
    }

    // Method to subtract two complex numbers
    public static Complex subtract(Complex a, Complex b) {
        return new Complex(a.real - b.real, a.imag - b.imag);
    }

    // Method to multiply two complex numbers
    public static Complex product(Complex a, Complex b) {
        return new Complex(a.real * b.real - a.imag * b.imag,
                           a.real * b.imag + a.imag * b.real);
    }

    // Method to print the complex number
    public void printComplex() {
        if(imag >= 0) {
            System.out.println(real + " + " + imag + "i");
        } else {
            System.out.println(real + " - " + (-imag) + "i");
        }
    }

    // Main method to demonstrate the operations
    public static void main(String[] args) {
        Complex c = new Complex(4, 5); // Example: Initialize the first complex number
        Complex d = new Complex(2, 3); // Example: Initialize the second complex number

        Complex e = Complex.add(c, d); // Addition of c and d
        Complex f = Complex.subtract(c, d); // Subtraction of c and d
        Complex g = Complex.product(c, d); // Product of c and d

        System.out.print("Sum: ");
        e.printComplex();
        System.out.print("Difference: ");
        f.printComplex();
        System.out.print("Product: ");
        g.printComplex();
    }
}
