package chap02;

public class TypeCasting {
	public static void main(String[] args) {
		// 자동 타입변환
		double d1 = 5 * 3.14; // 15.70000000001 int인 1이 타입캐스팅됨
		double d2 = 1; // 1.0 int인 1이 타입캐스팅됨
		System.out.println(d1);
		System.out.println(d2);

		// 강제 타입변환
		// double 의 3.14를 float로 형변환해 f에 3.14F 저장
		float f = (float) 3.14;

		// int의 300을 byte로 형 변환하면 데이터 손실 발생
		byte b = (byte) 600; // byte는 -128~ 127까지 표현이라 데이터가 손실됨

		// double 의 3.14를 byte로 형변환하면 데이터가 손실되고 3만 저장
		byte x = (byte) 3.14;

		// float의 3.14를 double 로 형 변환하면 데이터 손실 없이 저장
		double d = (double) 3.14f;

	}
}
