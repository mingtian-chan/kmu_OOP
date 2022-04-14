package sec06;

import java.util.Scanner;

class Cylinder {
	private double radius;
	private double height;
	private double PI = 3.14;

	Cylinder(double r, double h) {
		radius = r;
		height = h;
	}

	double findVolume() {
		return PI * radius * radius * height;
	}

}

public class ExeCylinder {
	public static void main(String[] args) {
		double h, r;
		Scanner in = new Scanner(System.in);
		System.out.print("�������� �Է��ϼ���: ");
		r = in.nextDouble();
		System.out.print("���̸� �Է��ϼ���: ");
		h = in.nextDouble();

		Cylinder cc = new Cylinder(r, h);
		System.out.println("������� ���� = " + cc.findVolume());

	}

}
