package ex;

public class StaticVarTest {

	public static void main(String[] args) {
//		공유해서 카운팅을 하고싶으면 일반 변수가 아닌 전역 변수로 잡자
//		일반 변수는 왜 계속 증가가 안 되냐면 지금 객체가 총 3개가 있는거잖슴 ㅇㅇ
//		한 객체마다 그 변수를 증가하는거니깐 당연히 안 되지 씨발아 
		
		
		StaticVar sv1 = new StaticVar();
//		x, y 각각 1씩 증가시키는 메소드
		sv1.increase();
//		x = 일반 변수, y = 전역 변수
		System.out.println(" x = " + sv1.x + ", y = " + StaticVar.y);
		
		StaticVar sv2 = new StaticVar();
		sv2.increase();
		System.out.println(" x = " + sv2.x + ", y = " + StaticVar.y);
		
		StaticVar sv3 = new StaticVar();
		sv3.increase();
		System.out.println(" x = " + sv3.x + ", y = " + StaticVar.y);
	}

}
