package sec06;

import java.util.Scanner;

public class Practice2_8 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("���� �̼� ���� : ");
		int m = in.nextInt();

		System.out.print("���� �̼� ���� : ");
		int l = in.nextInt();

		System.out.print("���� �̼� ���� : ");
		int g = in.nextInt();

		boolean b = ((m + l + g) >= 140) && (m >= 70) && ((l >= 30 && g >= 30) || l + g >= 80);

		System.out.println(b ? "��������" : "���� �Ұ�");

	}
}
