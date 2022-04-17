package chap02;

public class VarDemo {
	public static void main(String[] args) {
		int var = 1;
//		var x = 1;

//		var x = 1, y = 2, z = 3 // 한번에 여러개의 변수를 추론할 수 없음

		var x = 1;
		var y = 3;
		var z = 4;
		var a = 1.1;
//		var str = null; // null은 추론할 수 없음

		int b = 1, c = 2, d = 2; // 타입을 명시하면 한번에 여러개 선언과 초기화 가능

//		var oops; // 초기화랑 같이 안하면 못씀
//		oops= 1;

		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		System.out.println(a);
//		System.out.println(str);
//		System.out.println(oops);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
	}
}
