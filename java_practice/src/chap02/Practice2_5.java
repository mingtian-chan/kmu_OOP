package chap02;

import java.util.Scanner;

public class Practice2_5 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("초단위 정수를 입력하세요");
		int sec = in.nextInt();
		int hour = sec / 3600;
		int min = (sec - hour * 3600) / 60;
		sec %= 60;
		System.out.printf("%d시간 %d분 %d초", hour, min, sec);
	}
}
