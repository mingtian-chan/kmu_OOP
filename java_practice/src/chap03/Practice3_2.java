package chap03;

import java.util.Scanner;

public class Practice3_2 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("5�ڸ� ���ڸ� �Է��ϼ��� : ");
		int i = in.nextInt();
		int even = 0, odd = 0;

		int a = i % 10; // 1���ڸ�
		int b = i / 10 % 10; // 10���ڸ�
		int c = i / 100 % 10; // 100���ڸ�
		int d = i / 1000 % 10; // 1000���ڸ�
		int e = i / 10000 % 10; // 10000���ڸ�

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

		System.out.printf("%5d�� �ڸ� : %d\n", 1, a);
		System.out.printf("%5d�� �ڸ� : %d\n", 10, b);
		System.out.printf("%5d�� �ڸ� : %d\n", 100, c);
		System.out.printf("%5d�� �ڸ� : %d\n", 1000, d);
		System.out.printf("%5d�� �ڸ� : %d\n", 10000, e);
		System.out.println("¦���� ���� : " + even);
		System.out.println("Ȧ���� ���� : " + odd);

	}
}
