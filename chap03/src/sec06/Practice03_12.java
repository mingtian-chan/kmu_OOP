package sec06;

import java.util.Scanner;

public class Practice03_12 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("ù��° ������ �Է��ϼ��� : ");
		int x = in.nextInt();
		System.out.print("�ι�° ������ �Է��ϼ��� : ");
		int y = in.nextInt();
		System.out.printf("�� ���߿� ū ���� %d �Դϴ�", get_max(x, y));

	}

	static int get_max(int a, int b)

	{
		if (a > b)
			return a;
		else
			return b;

	}
}