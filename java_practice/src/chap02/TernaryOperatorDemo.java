package chap02;

public class TernaryOperatorDemo {
	public static void main(String[] args) {
		int x = 1;
		int y;
		y = (x == 1) ? 10 : 20; // True이니 연산식 1 실행
		System.out.println(y); // 실행결과 : 10
		y = (x > 1) ? x++ : x + 20; // False이니 연산식 2 실행
		System.out.println(x); // 실행결과 : 1
		System.out.println(y); // 실행결과 : 21
	}
}
