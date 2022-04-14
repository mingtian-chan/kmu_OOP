package sec06;

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

}

public class TriangleTest {
	public static void main(String[] args) {
		Triangle t1 = new Triangle(10.0, 5.0); // 생성자이면서 설정자
		System.out.println(t1.findArea()); // 접근자
//		System.out.println(t1.base); 접근자를 통하지 않으면 private 변수 접근 안됨.

		Triangle t2 = new Triangle(15.0, 8.0);
		System.out.println(t2.findArea());
	}

}
