package sec06;

class Car {
	String color;
	static int NumofCar = 0;
	static int NumofRedCar = 0;

	Car(String color) {
		this.color = color;
		NumofCar++;
		if (color.equalsIgnoreCase("red"))
			NumofRedCar++;
	}

	static int getNumofCar() {
		return NumofCar;
	}

	static int getNumofRedCar() {
		return NumofRedCar;
	}

}

public class CarTest {
	public static void main(String[] args) {
		Car c1 = new Car("red");
		Car c2 = new Car("blue");
		Car c3 = new Car("Red");

		System.out.printf("자동차 수 : %d, 빨간색 자동차 수 : %d", Car.getNumofCar(), Car.getNumofRedCar());
	}
}
