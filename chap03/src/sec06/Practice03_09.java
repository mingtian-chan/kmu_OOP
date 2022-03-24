package sec06;

import java.util.Scanner;

public class Practice03_09 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int x, sum;
		while (true) {
			System.out.print("양의 정수를 입력하세요 : ");
			x = in.nextInt();
			if (x == 999 || x <= 0) // 음수나 0일 조건일 시 break 추가했습니다.
				break;

			sum = 0;
			for (int i = 1; i <= x; i++)
				sum += i;
			System.out.printf("1부터 %d까지 합은 %d입니다. \n", x, sum);
		}
		System.out.println("프로그램을 종료합니다!");
	}
}