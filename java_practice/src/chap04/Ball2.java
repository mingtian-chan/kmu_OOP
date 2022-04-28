package chap04;

class Ball_ {
	double radius = 2.0;

	double getRadius() {
		return radius;
	}
}

public class Ball2 {
	public static void main(String[] args) {
		Ball_ ball_1 = new Ball_();
		System.out.println(ball_1.getRadius());
		Ball_ ball_2 = new Ball_();
		ball_2.radius = 4.0;
		System.out.println(ball_2.getRadius());
		Ball_ ball_3 = new Ball_();
		System.out.println(ball_3.getRadius());
	}
}
