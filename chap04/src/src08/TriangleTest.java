package src08;

class Triangle {
	private double base;
	private double height;

	Triangle(double b, double h) {
		this.base = b;
		this.height = h;
	}

	double getBase() {
		return base;
	}

	double getHeight() {
		return height;
	}

	double findArea() {
		return base * height / 2;
	}

	boolean isSameArea(Triangle t) {
		return this.findArea() == t.findArea();
	}

}

public class TriangleTest {
	public static void main(String[] args) {
		Triangle t1 = new Triangle(10.0, 5.0);
		System.out.println(t1.findArea());

		Triangle t2 = new Triangle(5.0, 10.0);
		Triangle t3 = new Triangle(8.0, 8.0);
		System.out.println(t1.isSameArea(t2));
		System.out.println(t1.isSameArea(t3));
	}

}
