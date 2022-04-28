package chap04;

public class LocalVariableDemo {
	public static void main(String[] args) {
		int a = 0;
		double b;

//		System.out.println(b); // b는 초기화 되지 않아서 값이 없음
//		System.out.println(a + c); // c는 뒤에 선언되어있어서 출력 안됨

		int c = 0;

		final double d = 0.0;
		for (int e = 0; e < 10; e++) {
//			int a = 1; // 이름이 겹치면 실행이 안돼요. 
			System.out.print(e);
		}
	}
}
