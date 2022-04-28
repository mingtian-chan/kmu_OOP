package sec06;

import java.util.Scanner;

public class Practice5_4 {
	public static void main(String[] args) {
		StringBuffer s = new StringBuffer();
		Scanner in = new Scanner(System.in);
		System.out.print("단어 입력 : ");
		String user = in.next();
		for (int i = 0; i < user.length(); i++) {
			s.append('-');
		}
		System.out.println("\n단어(" + user.length() + "글자" + "): " + s);

	}
}
