package chap02;

import java.util.Scanner;

public class Practice2_2 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("������ �Է��ϼ��� : ");
		int x = in.nextInt();
		System.out.printf("%3d�� ������ %05d", x, x * x);
	}
}
