package sec06;

import java.util.Scanner;

public class Practice2_4 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("���ϴ� ���� �Է� : ");
		int a = in.nextInt();

		if (a % 2 == 0)
			System.out.print(a + "�� ¦���Դϴ�");
		else
			System.out.print(a + "�� Ȧ���Դϴ�");

	}
}