package sec06;

import java.util.Scanner;

public class Practice03_04 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int x, sum = 0;
		do {
			System.out.print("양의 정수를 입력하세요 : ");
			x = in.nextInt();
			if (x % 2 == 0)
				sum += x;

		} while (x > 0);
		System.out.println("입력한 정수 중에서 짝수의 합 : " + sum);

	}
}