package sec06;

public class ExeDog2 {
	static void dog_prn(Dog d) {
		System.out.println("�̸� : " + d.name);
		System.out.println("ǰ�� : " + d.breeds);
		System.out.println("���� : " + d.age);
		d.wag();
		d.bark();

	}

	public static void main(String[] args) {
		Dog d1 = new Dog();
		d1.name = "����";
		d1.breeds = "��縮Ʈ����";
		d1.age = 2;
		dog_prn(d1);

		Dog d2 = new Dog();
		d2.name = "����";
		d2.breeds = "�ͽ�";
		d2.age = 3;
		dog_prn(d2);
	}
}
