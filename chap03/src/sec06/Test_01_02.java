package sec06;

import java.util.Scanner;

public class Test_01_02 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a, b;
		do {
			System.out.print("첫번째 수를 입력하세요 : ");
			a = in.nextInt();
			System.out.print("두번쨰 수를 입력하세요 : ");
			b = in.nextInt();
			int sum = 0;
			for (int num = a; num < b; num++) {
				System.out.printf("%2d+", num);
				sum += num;
			}

			System.out.printf("%2d = %d\n", b, sum + b);

		} while (b != 0);

	}
}
