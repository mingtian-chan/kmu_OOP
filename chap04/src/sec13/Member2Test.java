package sec13;

class Member2 {
	String name, id;
	int birth;

	Member2(String name, String id, int birth) {
		this.name = name;
		this.id = id;
		this.birth = birth;
	}

	Member2(String name, String id) {
		this.name = name;
		this.id = id;
	}

	boolean isSameMember(Member2 m) {
		return m.name == this.name && m.birth == this.birth;
	}
}

public class Member2Test {
	public static void main(String[] args) {
		Member2 a = new Member2("ȫ�浿", "h123", 701011);
		Member2 b = new Member2("ȫ�浿", "h456", 701011);
		Member2 c = new Member2("ȫ�浿", "h789");
		System.out.println(a.isSameMember(b));
		System.out.println(a.isSameMember(c));

	}
}
