package sec06;

import java.util.Scanner;

public class Practice5_5 {
	public static void main(String[] args) {
		String hiddenString = "hello";
		StringBuffer outputString = new StringBuffer();
		Scanner scan = new Scanner(System.in);
		String user;

		for (int i = 0; i < hiddenString.length(); i++)
			outputString.append('-');
		System.out.println("\n�ܾ�(" + hiddenString.length() + "����" + "): " + outputString);

		System.out.print("1 ���ڸ� �Է��ϼ���.: ");
		user = scan.next();
		char ch = user.charAt(0);
		for (int i = 0; i < hiddenString.length(); i++) {
			if (hiddenString.charAt(i) == ch) {
				outputString.setCharAt(i, ch);
				System.out.println("\n�ܾ� : " + outputString);
			}
		}
	}
}
