package chap02;

public class CastDemo {
	public static void main(String[] args) {
		int i;
		double d;
		byte b;

		i = 7 / 4; // 1 int 7 ������ int 4�� int 1
		System.out.println(i);
		d = 7 / 4; // 1.0 int 7 ������ int 4�� int 1
		System.out.println(d);
		d = 7 / (double) 4; // int 7(�ڵ�ĳ�������� 7.0��) ������ double 4.0�� double 1.75)
		System.out.println(d);

//		i = 7 / (double) 4; // ����� double 1.75�ε� ��� int Ÿ�� ������ ������ �� ����

		i = 300;
		if (i < Byte.MIN_VALUE || i > Byte.MAX_VALUE)
			System.out.println("byte Ÿ������ ��ȯ�� �� �����ϴ�.");
		else
			b = (byte) i;
	}
}
