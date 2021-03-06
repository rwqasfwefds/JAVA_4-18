package ex2;

public class Genesis {
//	미러 맴버 변수를 정의
	Mirror m;
	
//	다형성 메소드 : 생성자 = 이게 딱 spring에서의 DI(의존성 주입)임
	public Genesis(Mirror m) {
		this.m = m;
	}
	
	public void powerOff() {
		System.out.println("시동 끄기");
		m.autoClose();
	}
	
	public void joystic() {
		System.out.println("조절 기능");
		m.control();
	}
}
