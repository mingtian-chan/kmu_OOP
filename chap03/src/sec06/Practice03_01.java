package sec06;

import java.util.Scanner;

public class Practice03_01 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("���ڸ� �Է��ϼ��� : ");
		int number = in.nextInt();

		if (number >= 19)
			System.out.println("����");

		else
			System.out.println("�̼���");
	}
}