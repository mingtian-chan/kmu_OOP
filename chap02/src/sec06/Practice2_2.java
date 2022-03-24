package sec06;

import java.util.Scanner;

public class Practice2_2 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("정수를 입력하세요 : ");
		int x = in.nextInt();
		int y = x * x;
		System.out.println(x + "의 제곱은 " + y);
		// System.out.printf("%d의 제곱은 %d \n", x, y); 이렇게 써도 됨!
	}
}
