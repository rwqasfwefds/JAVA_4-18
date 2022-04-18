package ex4;

public class RectangleTest {

	public static void main(String[] args) {
//		1. 객체 생성 : 초기 값 없이 생성
//		2. 기능 사용 : 면적 계산 메소드 호출, 둘리 계산 메소드 호출
		Rectangle r1 = new Rectangle();
		r1.area();
		r1.length();
		
		System.out.println("--------");
//		3. 객체 생성 : 매개변수(30, 50)
//		4. 기능 사용 : 면적계산 메소드 호출, 둘레 계산 메소드 호출
		Rectangle r2 = new Rectangle(30, 50);
		r2.area();
		r2.length();
	}

}
