package sec06;

public class ExeRectangle2 {

	public static void main(String[] args) {
		Rectangle2 rec = new Rectangle2();
		System.out.println("�簢���� ������ : " + rec.calc_area());
	}
}

class Rectangle2 {

	int width = 10;
	int length = 50;

	int calc_area() {
		return width * length;
	}
}