package sec06;

import java.util.Scanner;

public class Practice2_3 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("������� �ظ��� ��������? ");
		Double radius = in.nextDouble();
		System.out.print("������� ���̴�? ");
		Double height = in.nextDouble();
		Double volume = radius * radius * 3.14 * height;

		System.out.println("������� ���Ǵ� " + volume);
		System.out.printf("������� ���Ǵ� %4.1f", volume);
		// �̷��� �ϸ� ���� ������ ���� �Ҽ����� ��Ʈ�� ����
	}
}