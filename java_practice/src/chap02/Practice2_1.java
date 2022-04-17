package chap02;

public class Practice2_1 {
	public static void main(String[] args) {
		int mach = 340;
		int distance = mach * 60 * 60;

		double radius = 10.0;
		double area = radius * radius * 3.14;

		System.out.println("소리가 1시간동안 가는 거리 : " + distance);

		System.out.println("반지름이 " + radius + "인 원의 넓이 : " + area);
	}
}
