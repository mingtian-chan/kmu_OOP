package chap02;

import java.util.Scanner;

public class Practice2_5 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("�ʴ��� ������ �Է��ϼ���");
		int sec = in.nextInt();
		int hour = sec / 3600;
		int min = (sec - hour * 3600) / 60;
		sec %= 60;
		System.out.printf("%d�ð� %d�� %d��", hour, min, sec);
	}
}
