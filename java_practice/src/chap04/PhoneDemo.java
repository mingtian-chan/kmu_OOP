package chap04;

class Phone {
	String model; // default �� : null
	int value; // default �� : 0

	void print() {
		System.out.println(value + "����¥�� " + model + "����Ʈ��");
	}
}

public class PhoneDemo {
	public static void main(String[] args) {
		Phone myPhone = new Phone();
		myPhone.model = "������ S8";
		myPhone.value = 100;
		myPhone.print();

		Phone yourPhone = new Phone();
//		yourPhone.model = "G6";
//		yourPhone.value = 85;
		yourPhone.print();
	}
}
