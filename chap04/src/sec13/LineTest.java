package sec13;

class Line {
	int length;

	Line(int length) {
		this.length = length;
	}

	boolean isSameLine(Line o) {
		return o.length == this.length;
	}
}

public class LineTest {
	public static void main(String[] args) {
		Line a = new Line(1);
		Line b = new Line(1);

		System.out.println(a.isSameLine(b)); // length �� ����
		System.out.println(a == b); // ��ü���� ���ϸ� �ٸ�(a,b�� �ּڰ��� �ٸ�)
	}
}
