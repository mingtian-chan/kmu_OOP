package sec06;

import java.util.Scanner;

public class Practice03_04 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int x, sum = 0;
		do {
			System.out.print("���� ������ �Է��ϼ��� : ");
			x = in.nextInt();
			if (x % 2 == 0)
				sum += x;

		} while (x > 0);
		System.out.println("�Է��� ���� �߿��� ¦���� �� : " + sum);

	}
}