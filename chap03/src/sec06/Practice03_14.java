package sec06;

import java.util.Scanner;

public class Practice03_14 {
	public static void main(String[] args) {
		String c = input("ö��");
		String y = input("����");
		whoswin(c, y);
	}

	static String input(String s) {
		Scanner in = new Scanner(System.in);
		System.out.print(s + ": ");
		return in.next();
	}

	static void whoswin(String s1, String s2) {
		if (s1.equals(s2))
			System.out.println("���º�!");
		else if (s1.equals("r")) {
			if (s2.equals("p"))
				System.out.println("����, ��!");
			else
				System.out.println("ö��, ��!");
		} else if (s1.equals("p")) {
			if (s2.equals("s"))
				System.out.println("����, ��!");
			else
				System.out.println("ö��, ��!");
		} else {
			if (s2.equals("r"))
				System.out.println("����, ��!");
			else
				System.out.println("ö��, ��!");
		}

	}
}