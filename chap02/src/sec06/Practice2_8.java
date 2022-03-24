package sec06;

import java.util.Scanner;

public class Practice2_8 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("전공 이수 학점 : ");
		int m = in.nextInt();

		System.out.print("전공 이수 학점 : ");
		int l = in.nextInt();

		System.out.print("전공 이수 학점 : ");
		int g = in.nextInt();

		boolean b = ((m + l + g) >= 140) && (m >= 70) && ((l >= 30 && g >= 30) || l + g >= 80);

		System.out.println(b ? "졸업가능" : "졸업 불가");

	}
}
