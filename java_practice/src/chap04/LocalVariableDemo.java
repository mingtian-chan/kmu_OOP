package chap04;

public class LocalVariableDemo {
	public static void main(String[] args) {
		int a = 0;
		double b;

//		System.out.println(b); // b�� �ʱ�ȭ ���� �ʾƼ� ���� ����
//		System.out.println(a + c); // c�� �ڿ� ����Ǿ��־ ��� �ȵ�

		int c = 0;

		final double d = 0.0;
		for (int e = 0; e < 10; e++) {
//			int a = 1; // �̸��� ��ġ�� ������ �ȵſ�. 
			System.out.print(e);
		}
	}
}
