package sec06;

class Dog {
	String name;
	String breeds;
	int age;

	void wag() {
		System.out.println(name + "°¡ »ì¶û»ì¶û~");
	}

	void bark() {
		System.out.println(name + "°¡ ¸Û¸Û!");
	}

}

public class ExeDog {
	public static void main(String[] args) {

		Dog d1 = new Dog();
		d1.name = "¸Á°í";
		d1.breeds = "°ñµç¸®Æ®¸®¹ö";
		d1.age = 2;

		System.out.println("ÀÌ¸§ : " + d1.name);
		System.out.println("Ç°Á¾ : " + d1.breeds);
		System.out.println("³ªÀÌ : " + d1.age);

		d1.wag();
		d1.bark();

		Dog d2 = new Dog();
		d2.name = "±î¹Ì";
		d2.breeds = "¹Í½º";
		d2.age = 3;

		System.out.println("ÀÌ¸§ : " + d2.name);
		System.out.println("Ç°Á¾ : " + d2.breeds);
		System.out.println("³ªÀÌ : " + d2.age);

		d2.wag();
		d2.bark();
	}
}
