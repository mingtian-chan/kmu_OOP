package sec06;

import java.util.Scanner;

public class Practice2_4 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("원하는 정수 입력 : ");
		int a = in.nextInt();

		if (a % 2 == 0)
			System.out.print(a + "는 짝수입니다");
		else
			System.out.print(a + "는 홀수입니다");

	}
}