package sec06;

// 은닉 한 후
class Phone_pri {
	private String model;
	private int value;

	String getModel() {
		return model;
	}

	int getValue() {
		return value;
	}

	void setModel_value(String m, int v) {
		this.model = m;
		this.value = v;
	}

	void print(int v, String m) {
		System.out.println(v + "만원 짜리 " + m + "스마트폰");
	}
}

public class PhoneDemo_private {
	public static void main(String[] args) {
		Phone_pri myPhone = new Phone_pri();
		myPhone.setModel_value("갤럭시 S8", 100);
		myPhone.print(myPhone.getValue(), myPhone.getModel());

		Phone_pri yourPhone = new Phone_pri();
		yourPhone.setModel_value("G6", 85);
		yourPhone.print(yourPhone.getValue(), yourPhone.getModel());

	}
}
