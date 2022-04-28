package sec06;

import java.util.Scanner;

public class Practice5_3 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while (true) {
			System.out.print("URL을 입력하세요 : ");
			String s = in.next();
			System.out.println();

			if (s.equals("bye")) {
				break;
			}
			if (s.endsWith("com")) {
				System.out.printf("%s는 'com'으로 끝납니다.\n", s);
			}
			if (s.contains("java")) {
				System.out.printf("%s는 'java'를 포함합니다.\n", s);
			}

		}

	}
}
