package ex2;

//	모든 메소드가 추상 메소드 형태
//	맴버 변수는 없고 다 상수임
public interface Mirror {
//	상수
//	public static final int MAX_AGE = 5;
	int MAX_AGE = 5;
	
	void autoClose(); // 사이드 미러 자동 접힘
	void control(); // 사이 미러 각도 조절
}
