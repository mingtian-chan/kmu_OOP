package sec06;

import java.util.Scanner;

public class Practice_gugu {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("출력하고자 하는 구구단 : ");
		int row = in.nextInt();
		{
			int column = 1;
			while (column < 10) {
				System.out.printf("%d * %d = %2d\n", row, column, row * column);
				column++;
			}
			System.out.println();

		}
	}
}