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

		System.out.println(a.isSameLine(b)); // length 는 같음
		System.out.println(a == b); // 객체값을 비교하면 다름(a,b의 주솟값은 다름)
	}
}
