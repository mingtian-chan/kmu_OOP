package chap02;

import java.util.Scanner;

public class Practice2_6 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int i = in.nextInt();
		boolean a = i % 4 == 0 && i % 5 == 0;
		boolean b = i % 4 == 0 || i % 5 == 0;
		boolean c = b && !a;

		System.out.println("4�� 5�� ���������� : " + a);
		System.out.println("4�Ǵ� 5�� ���������� : " + b);
		System.out.println("4�Ǵ� 5�� ������������, �� �� ��ηδ� ���������� �ʴ´�." + c);
	}
}
