package sec06;

import java.util.Scanner;

public class Practice03_10 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("��� �Է� : ");
		int x;
		while ((x = in.nextInt()) != 0) {
			switch (x) {
			case 1 -> System.out.println("���� ���߽��ϴ�");
			case 2, 3 -> System.out.println("���߽��ϴ�");
			case 4, 5, 6 -> System.out.println("�����Դϴ�");
			default -> System.out.println("����ؾ߰ڽ��ϴ�.");
			}
			System.out.print("��� �Է� : ");

		}

	}
}