package sec06;

public class Practice_yield {
	public static void main(String[] args) {
		whoIsIt("ȣ����");
		whoIsIt("����");
		whoIsIt("�����");
		whoIsIt("������");
	}

	static void whoIsIt(String bio) {
		String kind = switch (bio) {
		case "ȣ����", "����" -> "������";
		case "������", "����" -> kind = "����";
		case "�����", "����" -> kind = "���";
		default -> {
			System.out.print("������! ");
			yield "...";
		}
		};
		System.out.printf("%s�� %s�̴�. \n", bio, kind);
	}

}