package chap02;

import java.util.Scanner;

public class Practice2_7 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("0~999 ������ ���ڸ� �Է��ϼ��� : ");
		int i = in.nextInt();
		if (i > 999 || i < 0)
			System.out.println("�߸��� �Է��Դϴ�.");
		else {
			int a, b, c, d;
			a = i / 100;
			b = (i - a * 100) / 10;
			c = i % 10;
			d = a + b + c;
			System.out.println("���ڸ� ���� �� : " + a + b + c); // ������ 194 : �ֳ� a b c�� ���� �޾ұ� ����!!!
			System.out.printf("���ڸ� ���� �� : %d \n", a + b + c); // ������ : 14
			System.out.println("���ڸ� ���� �� : " + d); // ������ : 14
		}
	}
}
