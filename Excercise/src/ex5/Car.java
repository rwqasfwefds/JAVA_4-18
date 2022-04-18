package ex5;

public class Car {
//  맴버 변수 : 이름, 메이커, 가격
	private String name;
	private String maker;
	private int price;
	
//	생성자 2개 : 매개변수 없는 생성자, 매겨변수 3개짜리 생성자
	Car() {}
	
	Car(String name, String maker, int price){
		this.name = name;
		this.maker = maker;
		this.price = price;
	}
	
//	메소드 : 멤버 변수의 값을 출력 할 메소드
	public void show() {
		System.out.println("차량 이름 = " + name + ", 브랜드 = " + maker + ", 가격 = " + price);
	}
}
