package chap02;

public class TernaryOperatorDemo {
	public static void main(String[] args) {
		int x = 1;
		int y;
		y = (x == 1) ? 10 : 20; // True�̴� ����� 1 ����
		System.out.println(y); // ������ : 10
		y = (x > 1) ? x++ : x + 20; // False�̴� ����� 2 ����
		System.out.println(x); // ������ : 1
		System.out.println(y); // ������ : 21
	}
}
