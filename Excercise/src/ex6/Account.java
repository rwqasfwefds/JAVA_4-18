package ex6;

public class Account {
//	맴버 변수 : 이름, 잔액, 패스워드
	private String name;
	private int money;
	private String password;
//	생성자 : 매개변수 3개짜리
	Account(){}
	
	Account(String name, int money, String password){
		this.name = name;
		this.money = money;
		this.password = password;
	}
//	메소드 : deposit(입금액, 패스워드)
//	매개변수 패스워드와 맴버변수 패스워드가 일치할 때만
//	입금액을 증가 시켜주세연
//	출력1 : 이름 + "고객님" + 입금액 + "원이 입금되었습니다."
//	출력2 : "현재 잔액은 : " + 잔액 + "원 입니다."
//	일치 하지 않으면
//	출력1 : "비밀번호가 일치하지 않습니다."
//	출력2 : "다시 입력해 주시기 바랍니다."
	public void deposit(int money, String password) {
		if(this.password == password) {
			this.money += money;
			System.out.println(this.name + " 고객님 " + money + "원이 입금되었습니다.");
			System.out.println("현재 잔액은 " + this.money + "원 입니다.");
		} else {
			System.out.println("비밀번호가 일치하지 않습니다");
			System.out.println("다시 입력해 주시기 바랍니다.");
		}
	}
}
