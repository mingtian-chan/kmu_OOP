package sec07;

public class Practice5_8 {
	public static void main(String[] args) {
		int i, j;
		char a = 'A';
		char[] alpha = new char[26];

		for (i = 0; i < alpha.length; i++)
			alpha[i] = a++;

		for (i = 0; i < alpha.length; i++) {
			for (j = 0; j <= i; j++)
				System.out.print(alpha[j]);
			System.out.println();
		}
	}
}