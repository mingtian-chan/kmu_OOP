package sec06;

import java.util.Scanner;

public class Practice03_02 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("5�ڸ� ���ڸ� �Է��ϼ��� : ");
		int number = in.nextInt();
		int even = 0, odd = 0;

		int num_1 = number % 10; // 1���ڸ�
		int num_2 = (number / 10) % 10; // 10���ڸ�
		int num_3 = (number / 100) % 10; // 100���ڸ�
		int num_4 = (number / 1000) % 10; // 1000���ڸ�
		int num_5 = (number / 10000) % 10; // 10000���ڸ�

		if (num_1 % 2 == 0)
			even++;
		else
			odd++;

		if (num_2 % 2 == 0)
			even++;
		else
			odd++;

		if (num_3 % 2 == 0)
			even++;
		else
			odd++;

		if (num_4 % 2 == 0)
			even++;
		else
			odd++;

		if (num_5 % 2 == 0)
			even++;
		else
			odd++;

		System.out.println("    1���ڸ� : " + num_1);
		System.out.println("   10���ڸ� : " + num_2);
		System.out.println("  100���ڸ� : " + num_3);
		System.out.println(" 1000���ڸ� : " + num_4);
		System.out.println("10000���ڸ� : " + num_5);
		System.out.println("¦���� ���� : " + even);
		System.out.println("Ȧ���� ���� : " + odd);

	}
}
