package sec06;

import java.util.Scanner;

public class Test_01_01 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("양의 정수를 입력하세요 : ");
		int i = in.nextInt();
		int sum = 0;
		for (int num = 1; num < i; num++) {
			System.out.printf("%2d+", num);
			sum += num;
		}
		System.out.printf("%2d = %d", i, sum + i);
	}
}
