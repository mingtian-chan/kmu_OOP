package chap04;

class Member {
	private String name;
	private String id;
	private String password;
	private int age;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	String getId() {
		return id;
	}

	void setID(String id) {
		this.id = id;
	}

	String getPassword() {
		return password;
	}

	void setPassword(String password) {
		this.password = password;
	}

	int getAge() {
		return age;
	}

	void setAge(int age) {
		this.age = age;
	}

	Member() {
		this.name = "default";
		this.age = 1;
	}

	Member(String name, String id, String password, int age) { // 얘가 생성자임
		this.name = name;
		this.id = id;
		this.password = password;
		this.age = age;
	}
}

public class MemberExe {
	public static void main(String[] args) {
		Member m1 = new Member("Chan", "goodchan", "pw123", 13);
		System.out.println(m1.getPassword());

		Member m2 = new Member();
		m2.setName("kim");
		System.out.println(m2.getName());

	}
}
