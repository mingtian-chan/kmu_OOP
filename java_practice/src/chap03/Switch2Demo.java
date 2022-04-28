package chap03;

import java.util.Scanner;

public class Switch2Demo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Q. 5 x 2는?");
		System.out.println("1)5 2)10 3)15 4)20");
		System.out.print("입력 : ");
		int answer = sc.nextInt();

		switch (answer) {
		case 1:
			System.out.println("틀렸습니다.");
//			break;
		case 2:
			System.out.println("정답입니다.");
//			break;
		case 3:
			System.out.println("틀렸습니다.");
//			break;
		case 4:
			System.out.println("틀렸습니다.");
//			break;
		default:
			System.out.println("default");
//			break;
		}

		sc.close();
	}

}
