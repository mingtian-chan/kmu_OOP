package sec06;

import java.util.Scanner;

public class Practice03_05 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("숫자를 입력하세요 : ");
		int sum = 0;
		int x = in.nextInt();
		for (int i = 1; i <= x; i++) {
			sum += i;
		}
		System.out.printf("1부터 %d까지 합은 %d입니다.\n", x, sum);
	}
}
