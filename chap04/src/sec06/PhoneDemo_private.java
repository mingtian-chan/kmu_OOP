package sec06;

// ���� �� ��
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
		System.out.println(v + "���� ¥�� " + m + "����Ʈ��");
	}
}

public class PhoneDemo_private {
	public static void main(String[] args) {
		Phone_pri myPhone = new Phone_pri();
		myPhone.setModel_value("������ S8", 100);
		myPhone.print(myPhone.getValue(), myPhone.getModel());

		Phone_pri yourPhone = new Phone_pri();
		yourPhone.setModel_value("G6", 85);
		yourPhone.print(yourPhone.getValue(), yourPhone.getModel());

	}
}
