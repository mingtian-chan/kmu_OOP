package sec06;

class Dog {
	String name;
	String breeds;
	int age;

	void wag() {
		System.out.println(name + "�� ������~");
	}

	void bark() {
		System.out.println(name + "�� �۸�!");
	}

}

public class ExeDog {
	public static void main(String[] args) {

		Dog d1 = new Dog();
		d1.name = "����";
		d1.breeds = "��縮Ʈ����";
		d1.age = 2;

		System.out.println("�̸� : " + d1.name);
		System.out.println("ǰ�� : " + d1.breeds);
		System.out.println("���� : " + d1.age);

		d1.wag();
		d1.bark();

		Dog d2 = new Dog();
		d2.name = "���";
		d2.breeds = "�ͽ�";
		d2.age = 3;

		System.out.println("�̸� : " + d2.name);
		System.out.println("ǰ�� : " + d2.breeds);
		System.out.println("���� : " + d2.age);

		d2.wag();
		d2.bark();
	}
}
