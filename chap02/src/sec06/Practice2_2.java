package sec06;

import java.util.Scanner;

public class Practice2_2 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("������ �Է��ϼ��� : ");
		int x = in.nextInt();
		int y = x * x;
		System.out.println(x + "�� ������ " + y);
		// System.out.printf("%d�� ������ %d \n", x, y); �̷��� �ᵵ ��!
	}
}
