package sec06;

import java.util.Scanner;

public class Test_01_02 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a, b;
		do {
			System.out.print("ù��° ���� �Է��ϼ��� : ");
			a = in.nextInt();
			System.out.print("�ι��� ���� �Է��ϼ��� : ");
			b = in.nextInt();
			int sum = 0;
			for (int num = a; num < b; num++) {
				System.out.printf("%2d+", num);
				sum += num;
			}

			System.out.printf("%2d = %d\n", b, sum + b);

		} while (b != 0);

	}
}