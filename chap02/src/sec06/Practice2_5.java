package sec06;

import java.util.Scanner;

public class Practice2_5 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("�� ���� ������ �Է��ϼ��� : ");
		int s = in.nextInt();

		System.out.printf("%d�ð� %d�� %d��", s / 3600, (s / 60) % 60, s % 60);

		/*
		 * int t = in nextInt(); int s = t % 60; int m = (t / 60) % 60; int h = (t / 60)
		 * / 60;
		 * 
		 * System.out.printf("%d�ð� %d�� %d�� \n", h, m, s); �� �� ���� ����.
		 */
	}

}
