package chap03;

import java.util.Scanner;

public class Practice3_5 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("양의 정수를 입력하세요 : ");
		int i = in.nextInt();
		int sum = 0;
		for (int j = 1; j <= i; j++) {
			sum += j;
		}
		System.out.printf("1부터 %d까지 합은 %d 입니다.", i, sum);
	}
}
