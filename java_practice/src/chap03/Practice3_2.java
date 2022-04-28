package chap03;

import java.util.Scanner;

public class Practice3_2 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("5자리 숫자를 입력하세요 : ");
		int i = in.nextInt();
		int even = 0, odd = 0;

		int a = i % 10; // 1의자리
		int b = i / 10 % 10; // 10의자리
		int c = i / 100 % 10; // 100의자리
		int d = i / 1000 % 10; // 1000의자리
		int e = i / 10000 % 10; // 10000의자리

		if (a % 2 == 0)
			even++;
		else
			odd++;

		if (b % 2 == 0)
			even++;
		else
			odd++;

		if (c % 2 == 0)
			even++;
		else
			odd++;

		if (d % 2 == 0)
			even++;
		else
			odd++;

		if (e % 2 == 0)
			even++;
		else
			odd++;

		System.out.printf("%5d의 자리 : %d\n", 1, a);
		System.out.printf("%5d의 자리 : %d\n", 10, b);
		System.out.printf("%5d의 자리 : %d\n", 100, c);
		System.out.printf("%5d의 자리 : %d\n", 1000, d);
		System.out.printf("%5d의 자리 : %d\n", 10000, e);
		System.out.println("짝수의 개수 : " + even);
		System.out.println("홀수의 개수 : " + odd);

	}
}
