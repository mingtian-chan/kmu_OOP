package sec06;

import java.util.Scanner;

public class Practice03_09 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int x, sum;
		while (true) {
			System.out.print("���� ������ �Է��ϼ��� : ");
			x = in.nextInt();
			if (x == 999 || x <= 0) // ������ 0�� ������ �� break �߰��߽��ϴ�.
				break;

			sum = 0;
			for (int i = 1; i <= x; i++)
				sum += i;
			System.out.printf("1���� %d���� ���� %d�Դϴ�. \n", x, sum);
		}
		System.out.println("���α׷��� �����մϴ�!");
	}
}