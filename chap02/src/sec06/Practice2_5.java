package sec06;

import java.util.Scanner;

public class Practice2_5 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("초 단위 정수를 입력하세요 : ");
		int s = in.nextInt();

		System.out.printf("%d시간 %d분 %d초", s / 3600, (s / 60) % 60, s % 60);

		/*
		 * int t = in nextInt(); int s = t % 60; int m = (t / 60) % 60; int h = (t / 60)
		 * / 60;
		 * 
		 * System.out.printf("%d시간 %d분 %d초 \n", h, m, s); 로 할 수도 있음.
		 */
	}

}
