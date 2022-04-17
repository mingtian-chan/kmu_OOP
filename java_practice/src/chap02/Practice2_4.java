package chap02;

import java.util.Scanner;

public class Practice2_4 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("원하는 정수 입력 : ");
		int i = in.nextInt();
		if (i % 2 == 0)
			System.out.printf("%d는 짝수입니다", i);
		else
			System.out.printf("%d는 홀수입니다. \n", i);
		System.out.println("모든 연산 끝");
	}
}
