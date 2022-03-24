package sec06;

import java.util.Scanner;

public class Practice2_6 {

	public static void main(String[] args) {
		boolean tt1, tt2;
		Scanner in = new Scanner(System.in);
		int x = in.nextInt();
		tt1 = x % 4 == 0 && x % 5 == 0;
		tt2 = x % 4 == 0 || x % 5 == 0;
		System.out.println("4와 5로 나누어진다 : " + tt1);
		System.out.println("4 또는 5로 나누어진다 : " + tt2);
		System.out.println("4나 5중 하나로 나누어지지만 두 수 모두로는 나누어지지 않는다. : " + (tt2 && !tt1));

	}
}
