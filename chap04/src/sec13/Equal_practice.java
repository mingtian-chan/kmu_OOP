package sec13;

public class Equal_practice {
	public static void main(String[] args) {

		String a = "cat";
		String b = a;
		String c = new String("cat");

		System.out.println(a == b); // a와 b는 주소가 같다. (같은 애다)
		System.out.println(a.equals(b)); // a와 b는 내용물이 같다.

		System.out.println(a == c); // a와 c는 주소가 다르다 (다른 애다)
		System.out.println(a.equals(c)); // a와 c는 내용물이 같다.

	}

}