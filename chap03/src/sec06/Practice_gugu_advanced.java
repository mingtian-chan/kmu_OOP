package sec06;

public class Practice_gugu_advanced {
	public static void main(String[] args) {
		for (int column = 1; column < 10; column++) {
			for (int row = 1; row < column; row++) {

				System.out.printf("%4d", row * column);
			}
			System.out.println();
		}

	}
}
