package sec06;

import java.util.Scanner;

public class Practice03_02 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("5자리 숫자를 입력하세요 : ");
		int number = in.nextInt();
		int even = 0, odd = 0;

		int num_1 = number % 10; // 1의자리
		int num_2 = (number / 10) % 10; // 10의자리
		int num_3 = (number / 100) % 10; // 100의자리
		int num_4 = (number / 1000) % 10; // 1000의자리
		int num_5 = (number / 10000) % 10; // 10000의자리

		if (num_1 % 2 == 0)
			even++;
		else
			odd++;

		if (num_2 % 2 == 0)
			even++;
		else
			odd++;

		if (num_3 % 2 == 0)
			even++;
		else
			odd++;

		if (num_4 % 2 == 0)
			even++;
		else
			odd++;

		if (num_5 % 2 == 0)
			even++;
		else
			odd++;

		System.out.println("    1의자리 : " + num_1);
		System.out.println("   10의자리 : " + num_2);
		System.out.println("  100의자리 : " + num_3);
		System.out.println(" 1000의자리 : " + num_4);
		System.out.println("10000의자리 : " + num_5);
		System.out.println("짝수의 개수 : " + even);
		System.out.println("홀수의 개수 : " + odd);

	}
}
