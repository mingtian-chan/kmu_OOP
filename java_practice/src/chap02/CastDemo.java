package chap02;

public class CastDemo {
	public static void main(String[] args) {
		int i;
		double d;
		byte b;

		i = 7 / 4; // 1 int 7 나누기 int 4는 int 1
		System.out.println(i);
		d = 7 / 4; // 1.0 int 7 나누기 int 4는 int 1
		System.out.println(d);
		d = 7 / (double) 4; // int 7(자동캐스팅으로 7.0됨) 나누기 double 4.0은 double 1.75)
		System.out.println(d);

//		i = 7 / (double) 4; // 결과는 double 1.75인데 얘는 int 타입 변수에 저장할 수 없음

		i = 300;
		if (i < Byte.MIN_VALUE || i > Byte.MAX_VALUE)
			System.out.println("byte 타입으로 변환할 수 없습니다.");
		else
			b = (byte) i;
	}
}
