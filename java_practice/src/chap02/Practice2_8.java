package chap02;

import java.util.Scanner;

public class Practice2_8 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a, b, c;
		System.out.print("���� �̼� ���� : ");
		a = in.nextInt();
		System.out.print("���� �̼� ���� : ");
		b = in.nextInt();
		System.out.print("�Ϲ� �̼� ���� : ");
		c = in.nextInt();

		if ((a >= 70) && (b >= 30 && c >= 30) || (b + c >= 80))
			System.out.println("���� ����");
		else
			System.out.println("���� �Ұ�");
	}
}
