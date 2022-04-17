package chap02;

import java.util.Scanner;

public class Practice2_6 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int i = in.nextInt();
		boolean a = i % 4 == 0 && i % 5 == 0;
		boolean b = i % 4 == 0 || i % 5 == 0;
		boolean c = b && !a;

		System.out.println("4와 5로 나누어진다 : " + a);
		System.out.println("4또는 5로 나누어진다 : " + b);
		System.out.println("4또는 5로 나누어지지만, 두 수 모두로는 나누어지지 않는다." + c);
	}
}
