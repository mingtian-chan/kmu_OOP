package sec06;

import java.util.Scanner;

public class Practice2_6 {

	public static void main(String[] args) {
		boolean tt1, tt2;
		Scanner in = new Scanner(System.in);
		int x = in.nextInt();
		tt1 = x % 4 == 0 && x % 5 == 0;
		tt2 = x % 4 == 0 || x % 5 == 0;
		System.out.println("4�� 5�� ���������� : " + tt1);
		System.out.println("4 �Ǵ� 5�� ���������� : " + tt2);
		System.out.println("4�� 5�� �ϳ��� ������������ �� �� ��ηδ� ���������� �ʴ´�. : " + (tt2 && !tt1));

	}
}
