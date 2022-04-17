package chap02;

import java.util.Scanner;

public class Practice2_2 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("정수를 입력하세요 : ");
		int x = in.nextInt();
		System.out.printf("%3d의 제곱은 %05d", x, x * x);
	}
}
