package chap03;

import java.util.Scanner;

public class Practice3_5 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("���� ������ �Է��ϼ��� : ");
		int i = in.nextInt();
		int sum = 0;
		for (int j = 1; j <= i; j++) {
			sum += j;
		}
		System.out.printf("1���� %d���� ���� %d �Դϴ�.", i, sum);
	}
}
