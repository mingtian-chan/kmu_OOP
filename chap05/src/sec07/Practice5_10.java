package sec07;

import java.util.Random;
import java.util.Scanner;

public class Practice5_10 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int user[] = new int[3];
		int com[] = new int[3];

		Random r = new Random();

		while (com[0] == 0) {
			com[0] = r.nextInt(10);
		}
		while (com[1] == com[0] || com[1] == 0) {
			com[1] = r.nextInt(10);
		}
		while (com[2] == com[0] || com[2] == com[1] || com[2] == 0) {
			com[2] = r.nextInt(10);
		}
		int count = 0;

		while (true) {
			int strike = 0;
			int ball = 0;
			for (int i = 0; i < user.length; i++) {
				System.out.print((i + 1) + "번째 수: ");
				user[i] = in.nextInt();
				if (user[i] >= 10 || user[i] <= 0) {
					System.out.println("숫자 범위는 1~9 입니다.");
				}
			}
			for (int i = 0; i < com.length; i++) {
				for (int j = 0; j < user.length; j++) {
					if (com[i] == user[j] && i == j) {
						strike++;
					} else if (com[i] == user[j] && i != j) {
						ball++;
					}
				}
			}
			System.out.println(strike + " 스트라이크 " + ball + " 볼 ");
			count++;
			if (strike == 3) {
				System.out.println("게임 끝\n" + count + "번째 시도성공");
				break;
			}
		}
	}
}
