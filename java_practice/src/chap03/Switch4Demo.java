package chap03;

public class Switch4Demo {
	public static void main(String[] args) {
		whoIsIt("ȣ����");
		whoIsIt("����");
		whoIsIt("����");
		whoIsIt("������");
	}

	static void whoIsIt(String bio) {
		String kind = switch (bio) {
		case "ȣ����", "����" -> "������";
		case "������", "����" -> "����";
		case "����", "����" -> "���";

		default -> {
			System.out.print("������! ");
			yield "...";
		}
		};
		System.out.printf("%s�� %s�̴�.\n", bio, kind);
	}
}
