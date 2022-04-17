package chap02;

import java.util.Scanner;

public class Practice2_8 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a, b, c;
		System.out.print("전공 이수 학점 : ");
		a = in.nextInt();
		System.out.print("교양 이수 학점 : ");
		b = in.nextInt();
		System.out.print("일반 이수 학점 : ");
		c = in.nextInt();

		if ((a >= 70) && (b >= 30 && c >= 30) || (b + c >= 80))
			System.out.println("졸업 가능");
		else
			System.out.println("졸업 불가");
	}
}
