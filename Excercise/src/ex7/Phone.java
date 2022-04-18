package ex7;

public class Phone {
//	맴버 변수(문자열) : os, numbers
	private String os;
	private String numbers;
//	메소드 call() : 출력 = "전화 걸기"
//	메소드 sms() : 출력 = "문자 보내기"
	public void call() {
		System.out.println("전화 걸기");
	}
	
	public void sms() {
		System.out.println("문자 보내기");
	}
}
