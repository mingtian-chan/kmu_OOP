package chap02;

public class TypeCasting {
	public static void main(String[] args) {
		// �ڵ� Ÿ�Ժ�ȯ
		double d1 = 5 * 3.14; // 15.70000000001 int�� 1�� Ÿ��ĳ���õ�
		double d2 = 1; // 1.0 int�� 1�� Ÿ��ĳ���õ�
		System.out.println(d1);
		System.out.println(d2);

		// ���� Ÿ�Ժ�ȯ
		// double �� 3.14�� float�� ����ȯ�� f�� 3.14F ����
		float f = (float) 3.14;

		// int�� 300�� byte�� �� ��ȯ�ϸ� ������ �ս� �߻�
		byte b = (byte) 600; // byte�� -128~ 127���� ǥ���̶� �����Ͱ� �սǵ�

		// double �� 3.14�� byte�� ����ȯ�ϸ� �����Ͱ� �սǵǰ� 3�� ����
		byte x = (byte) 3.14;

		// float�� 3.14�� double �� �� ��ȯ�ϸ� ������ �ս� ���� ����
		double d = (double) 3.14f;

	}
}
