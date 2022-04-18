package ex;

public class MethodsDemo1 {

	public static void m1() {
		System.out.println("m1 메소드가 실행 됨");
	}
	
	public static void m2() {
		System.out.println("m2 메소드가 실행 됨");
	}
	
	public static void main(String[] args) {
//		전역 메소드 실행
		m1();
		m2();
	}

}
