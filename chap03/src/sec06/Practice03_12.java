package sec06;

import java.util.Scanner;

public class Practice03_12 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("첫번째 정수를 입력하세요 : ");
		int x = in.nextInt();
		System.out.print("두번째 정수를 입력하세요 : ");
		int y = in.nextInt();
		System.out.printf("두 수중에 큰 수는 %d 입니다", get_max(x, y));

	}

	static int get_max(int a, int b)

	{
		if (a > b)
			return a;
		else
			return b;

	}
}
