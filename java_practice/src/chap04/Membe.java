package chap04;

public class Membe {
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

	public Membe() {
		this.name = "default";
		this.age = 1;
	}

	Membe(String name, String id, String password, int age) { // 얘가 생성자임
		this.name = name;
		this.id = id;
		this.password = password;
		this.age = age;
	}
}
