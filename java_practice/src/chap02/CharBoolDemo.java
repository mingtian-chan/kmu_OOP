package chap02;

public class CharBoolDemo {
	public static void main(String[] args) {
		char ga1 = '��';
		char ga2 = '\uac00';

		boolean cham = true;
		boolean geojit = false;

		System.out.println(ga1);
		System.out.println((int) ga1);
		System.out.println(++ga1); // ��
		System.out.println(ga1++); // ��
		System.out.println(ga1); // �A

		System.out.println(ga2); // ��
		System.out.println(++ga2); // ��
		System.out.println(cham + "�� �ƴϸ�" + geojit + "�Դϴ�.");

	}
}
