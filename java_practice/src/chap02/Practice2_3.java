package chap02;

import java.util.Scanner;

public class Practice2_3 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("�ظ��� ��������? : ");
		double radius = in.nextDouble();
		System.out.print("������� ���̴�? : ");
		double height = in.nextDouble();
		double volume = radius * radius * 3.14 * height;
		System.out.println("������� ���Ǵ� " + volume);
	}
}
