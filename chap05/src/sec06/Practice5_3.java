package sec06;

import java.util.Scanner;

public class Practice5_3 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while (true) {
			System.out.print("URL�� �Է��ϼ��� : ");
			String s = in.next();
			System.out.println();

			if (s.equals("bye")) {
				break;
			}
			if (s.endsWith("com")) {
				System.out.printf("%s�� 'com'���� �����ϴ�.\n", s);
			}
			if (s.contains("java")) {
				System.out.printf("%s�� 'java'�� �����մϴ�.\n", s);
			}

		}

	}
}
