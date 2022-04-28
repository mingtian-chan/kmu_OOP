package chap04;

public class MemberDemo {
	public static void main(String[] args) {

		Member m1 = new Member();
		System.out.println(m1.getName());
		m1.setName("chan");
		System.out.println(m1.getName());

		System.out.println(m1.getAge());
		m1.setAge(200);
		System.out.println(m1.getAge());
	}
}
