package chap03;

public class Practice3_3 {
	public static void main(String[] args) {
		int dan = 2;

		while (dan < 10) {
			System.out.println(dan + "´Ü Ãâ·Â");
			int i;
			for (i = 1; i < 10; i++) {
				System.out.printf("%d * %d = %2d\n", dan, i, dan * i);
			}
			dan++;
			System.out.println();
		}
	}

}
