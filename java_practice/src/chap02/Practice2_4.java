package chap02;

import java.util.Scanner;

public class Practice2_4 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("���ϴ� ���� �Է� : ");
		int i = in.nextInt();
		if (i % 2 == 0)
			System.out.printf("%d�� ¦���Դϴ�", i);
		else
			System.out.printf("%d�� Ȧ���Դϴ�. \n", i);
		System.out.println("��� ���� ��");
	}
}
