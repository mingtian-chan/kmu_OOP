package sec06;

import java.util.Scanner;

public class Practice03_08 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("출력하고자 하는 구구단 : ");
		int row;
		while ((row = in.nextInt()) != 0) {
			int column = 1;
			while (column < 10) {
				System.out.printf("%d * %d = %2d\n", row, column, row * column);
				column++;
			}
			System.out.print("출력하고자 하는 구구단 : ");

		}
	}
}
//	public static void main(String[] args) {
//		Scanner in = new Scanner(System.in);
//		System.out.print("출력하고자 하는 구구단 : ");
//		int a;
//		while ((a = in.nextInt()) != 0) {
//			for (int b = 1; b < 10; b++) {
//				System.out.printf("%d * %d = %2d\n", a, b, a * b);
//			}
//			System.out.print("출력하고자 하는 구구단 : ");
//		}
//	}
//}