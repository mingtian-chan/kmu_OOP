package chap04;

class Phone {
	String model; // default 값 : null
	int value; // default 값 : 0

	void print() {
		System.out.println(value + "만원짜리 " + model + "스마트폰");
	}
}

public class PhoneDemo {
	public static void main(String[] args) {
		Phone myPhone = new Phone();
		myPhone.model = "갤럭시 S8";
		myPhone.value = 100;
		myPhone.print();

		Phone yourPhone = new Phone();
//		yourPhone.model = "G6";
//		yourPhone.value = 85;
		yourPhone.print();
	}
}
