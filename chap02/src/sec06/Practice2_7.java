package sec06;

import java.util.Scanner;

public class Practice2_7 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("0~999 사이의 숫자를 입력하세요 : ");
		int x = in.nextInt();

		int answer = x / 100 + (x % 100) / 10 + x % 10;
		System.out.print("각 자리수의 합 = " + answer);

		/*
		 * t1 = x %10; // 일의 자리
		 *  x /= 10; t2 = x %10; // 십의 자리 
		 *  x /= 10; t3 = x %10; // 백의 자리 
		 *  System.out.println("각 자리수의 합 = " + (t1 + t2 + t3));
		 */
	}
}
