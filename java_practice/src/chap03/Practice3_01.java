package chap03;

import java.util.Scanner;

public class Practice3_01 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("���ڸ� �Է��ϼ��� : ");
		int age = in.nextInt();

		if (age >= 19)
			System.out.println("����");
		else
			System.out.println("�̼���");

	}
}
