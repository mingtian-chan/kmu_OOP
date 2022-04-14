package sec13;

import java.util.Scanner;

class Number {
	int a;
	int b;
	int c;
}

public class Practice4_10 {
	static void swap(Number z) {
		int tmp = z.a;
		z.a = z.c;
		z.c = z.b;
		z.b = tmp;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Number n = new Number();
		System.out.print("3개의 숫자 입력 : ");
		n.a = in.nextInt();
		n.b = in.nextInt();
		n.c = in.nextInt();
		System.out.println("swap() 메소드 호출 전 " + n.a + "," + n.b + "," + n.c);
		swap(n);
		System.out.println("swap() 메소드 호출 후 " + n.a + "," + n.b + "," + n.c);

	}
}
