package chap02;

public class OperatorPrecedenceDemo {
	public static void main(String[] args) {
		int x = 5;
		int y = 10;
		int z = ++x * y--;
		System.out.printf("%d\t%d\t%d\n", x, y, z); // 실행결과 : 6 10 60
		System.out.printf("%d\t%d\t%d\n", x, y, z); // 실행결과 : 6 10 60

		int year = 2020;
		System.out.println(year % 4 == 0 && year % 100 != 0 || year % 400 == 0);
		// 연산 순서 : % 하고나서 연산 끝나면 ==와 != 로 논리따짐 그러고 && 먼저 하고 || 나중에 함
	}
}
