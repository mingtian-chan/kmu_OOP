package sec13;

public class Equal_practice {
	public static void main(String[] args) {

		String a = "cat";
		String b = a;
		String c = new String("cat");

		System.out.println(a == b); // a�� b�� �ּҰ� ����. (���� �ִ�)
		System.out.println(a.equals(b)); // a�� b�� ���빰�� ����.

		System.out.println(a == c); // a�� c�� �ּҰ� �ٸ��� (�ٸ� �ִ�)
		System.out.println(a.equals(c)); // a�� c�� ���빰�� ����.

	}

}