package sec06;

import java.util.Scanner;

public class Practice03_11 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int x;
		char kind;
		while (true) {
			System.out.print("성적을 입력하세요 : ");
			x = in.nextInt();
			if (x < 0)
				break;
			kind = switch (x / 10) {
			case 10, 9 -> 'A';
			case 8, 7 -> 'B';
			case 6, 5 -> 'C';
			case 4 -> 'D';
			default -> 'F';
			};
			System.out.printf("당신의 성적 등급은 %s입니다.\n", kind);

		}
		System.out.println("프로그램을 종료합니다.");
	}
}
