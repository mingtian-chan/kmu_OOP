package sec06;

import java.util.Scanner;

public class Practice03_03 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int row = 2;
		while (row < 10) {
			int column = 1;
			System.out.println(row + "�� ���");
			while (column < 10) {
				System.out.printf("%d * %d = %2d\n", row, column, row * column);
				// System.out.print(row + " * " + column + " = " + row * column); ó�� �� ��
				column++;
			}
			System.out.println();
			row++;
		}
	}
}