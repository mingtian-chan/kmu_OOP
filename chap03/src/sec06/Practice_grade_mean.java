package sec06;

import java.util.Scanner;

public class Practice_grade_mean {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int kor, eng, math, avr;
		char kind;
		while (true) {
			System.out.print("국어 영어 수학 성적을 입력하세요 : ");
			kor = in.nextInt();
			eng = in.nextInt();
			math = in.nextInt();

			if (kor < 0)
				break;
			avr = (kor + eng + math) / 3;
			kind = switch (avr / 10) {
			case 10, 9 -> 'A';
			case 8 -> 'B';
			case 7 -> 'C';
			case 6 -> 'D';
			default -> 'F';
			};
			System.out.printf("당신의 성적 등급은 %s입니다.\n", kind);
		}

	}
}
