package sec13;

class Complex {
	double real, imag;

	Complex(double real) {
		this.real = real;
	}

	Complex(double real, double imag) {
		this.real = real;
		this.imag = imag;
	}

	String print() {
		return this.real + " + " + this.imag + "i";
	}
}

public class ComplexTest {
	public static void main(String[] args) {
		Complex c1 = new Complex(2.0);
		System.out.println(c1.print());
		Complex c2 = new Complex(1.5, 2.5);
		System.out.println(c2.print());
	}
}
