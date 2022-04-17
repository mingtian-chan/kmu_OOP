package chap02;

import java.util.Scanner;

public class Practice2_7 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("0~999 사이의 숫자를 입력하세요 : ");
		int i = in.nextInt();
		if (i > 999 || i < 0)
			System.out.println("잘못된 입력입니다.");
		else {
			int a, b, c, d;
			a = i / 100;
			b = (i - a * 100) / 10;
			c = i % 10;
			d = a + b + c;
			System.out.println("각자리 수의 합 : " + a + b + c); // 실행결과 194 : 왜냐 a b c를 각각 받았기 때문!!!
			System.out.printf("각자리 수의 합 : %d \n", a + b + c); // 실행결과 : 14
			System.out.println("각자리 수의 합 : " + d); // 실행결과 : 14
		}
	}
}
