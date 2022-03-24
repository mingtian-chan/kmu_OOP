package sec06;

import java.util.Scanner;

public class Practice2_3 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("원기둥의 밑면의 반지름은? ");
		Double radius = in.nextDouble();
		System.out.print("원기둥의 높이는? ");
		Double height = in.nextDouble();
		Double volume = radius * radius * 3.14 * height;

		System.out.println("원기둥의 부피는 " + volume);
		System.out.printf("원기둥의 부피는 %4.1f", volume);
		// 이렇게 하면 형식 지정자 쓰면 소숫점을 컨트롤 가능
	}
}