package src08;

class Number {
	int x;
	int y;
}

public class Java_reference {
	static void swap(Number z) {
		int tmp = z.x;
		z.x = z.y;
		z.y = tmp;
	}

	public static void main(String[] args) {
		Number n = new Number();
		n.x = 10;
		n.y = 20;
		System.out.println("swap()�޼ҵ� ȣ�� �� " + n.x + "," + n.y);
		swap(n);
		System.out.println("swap()�޼ҵ� ȣ�� �� " + n.x + "," + n.y);
	}
}
