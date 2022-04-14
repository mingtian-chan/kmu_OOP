package sec06;

public class ExeDog2 {
	static void dog_prn(Dog d) {
		System.out.println("ÀÌ¸§ : " + d.name);
		System.out.println("Ç°Á¾ : " + d.breeds);
		System.out.println("³ªÀÌ : " + d.age);
		d.wag();
		d.bark();

	}

	public static void main(String[] args) {
		Dog d1 = new Dog();
		d1.name = "¸Á°í";
		d1.breeds = "°ñµç¸®Æ®¸®¹ö";
		d1.age = 2;
		dog_prn(d1);

		Dog d2 = new Dog();
		d2.name = "¸Á°í";
		d2.breeds = "¹Í½º";
		d2.age = 3;
		dog_prn(d2);
	}
}
