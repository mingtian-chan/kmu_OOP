package sec06;

import java.util.Scanner;

public class Practice2_7 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("0~999 ������ ���ڸ� �Է��ϼ��� : ");
		int x = in.nextInt();

		int answer = x / 100 + (x % 100) / 10 + x % 10;
		System.out.print("�� �ڸ����� �� = " + answer);

		/*
		 * t1 = x %10; // ���� �ڸ�
		 *  x /= 10; t2 = x %10; // ���� �ڸ� 
		 *  x /= 10; t3 = x %10; // ���� �ڸ� 
		 *  System.out.println("�� �ڸ����� �� = " + (t1 + t2 + t3));
		 */
	}
}
