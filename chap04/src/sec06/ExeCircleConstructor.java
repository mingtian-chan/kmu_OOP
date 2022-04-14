package sec06;

class CircleConstructor {
	double pi = 3.14;
	double radius;
	double area;

	CircleConstructor(double d) {
		radius = d;
		area = radius * radius * pi;
		System.out.println("원의 면적은 " + this.area + "입니다.");
	}
}

public class ExeCircleConstructor {
	public static void main(String[] args) {
		CircleConstructor circle = new CircleConstructor(100.0);
	}
}
