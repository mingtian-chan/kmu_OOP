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
		Triangle t1 = new Triangle(10.0, 5.0); // �������̸鼭 ������
		System.out.println(t1.findArea()); // ������
//		System.out.println(t1.base); �����ڸ� ������ ������ private ���� ���� �ȵ�.

		Triangle t2 = new Triangle(15.0, 8.0);
		System.out.println(t2.findArea());
	}

}
