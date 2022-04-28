package chap03;

public class Switch3Demo {
	public static void main(String[] args) {
		whoIsIt("ȣ����");
		whoIsIt("����");
		whoIsIt("�����");
		whoIsIt("������");
	}

	static void whoIsIt(String bio) {
		String kind = "...";
		switch (bio) {
		case "ȣ����", "����" -> kind = "������";
		case "������", "����" -> kind = "����";
		case "�����", "����" -> kind = "���";
		default -> System.out.print("������! ");
		}
		System.out.printf("%s�� %s�̴�.\n", bio, kind);
	}
}