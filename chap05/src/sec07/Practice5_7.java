package sec07;

import java.util.Scanner;

public class Practice5_7 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int intArray[] = new int[5];
		int max = 0;

		for (int i = 0; i < intArray.length; i++) {
			System.out.print((i + 1) + "��° �Է� : ");
			intArray[i] = in.nextInt();
			if (intArray[i] > max)
				max = intArray[i];
		}
		System.out.print("�Էµ� �� �߿��� ���� ū ���� " + max + "�Դϴ�.");
	}
}
