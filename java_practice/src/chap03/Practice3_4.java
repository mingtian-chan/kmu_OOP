package chap03;

import java.util.Scanner;

public class Practice3_4 {
	public static void main(String[] args) {
		int sum = 0;

		Scanner in = new Scanner(System.in);
		do {
			System.out.print("양의 정수를 입력하세요 : ");
			int i = in.nextInt();
			if (i <= 0)
				break;
			if (i % 2 == 0)
				sum += i;
		} while (true);
		System.out.println("입력한 양의 정수 중에서 짝수의 합은 " + sum);
	}
}
