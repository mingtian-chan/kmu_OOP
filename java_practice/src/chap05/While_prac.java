package chap05;

public class While_prac {
	public static void main(String[] args) {
//		while(false) {
//			System.out.println("while false"); // unreachable code

		for (int i = 0; i > 0; i++) {
			System.out.println("for ");
		}
		do {
			System.out.println("do while false");
		} while (false);

		System.out.println("general");
	}
}
