package sec06;

import java.util.Scanner;

public class Practice03_05 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("���ڸ� �Է��ϼ��� : ");
		int sum = 0;
		int x = in.nextInt();
		for (int i = 1; i <= x; i++) {
			sum += i;
		}
		System.out.printf("1���� %d���� ���� %d�Դϴ�.\n", x, sum);
	}
}