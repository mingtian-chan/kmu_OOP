package sec06;

import java.util.Scanner;

public class Practice03_13 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("ö�� : ");
		String c = in.next();
		System.out.print("���� : ");
		String y = in.next();
		if (c.equals(y)) {
			System.out.println("���º�!");
		} else if (c.equals("r")) {
			if (y.equals("p"))
				System.out.println("����, ��!");
			else
				System.out.println("ö��, ��!");
		} else if (c.equals("p")) {
			if (y.equals("s"))
				System.out.println("����, ��!");
			else
				System.out.println("ö��, ��!");
		} else {
			if (y.equals("r"))
				System.out.println("����, ��!");
			else
				System.out.println("ö��, ��!");
		}
	}
}
