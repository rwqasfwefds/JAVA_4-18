package ex4;

public class Rectangle {
//  맴버 변수(속성) : 너비, 높이
	private int width;
	private int height;
	
	public Rectangle() {
		
	}
	
	public Rectangle(int width, int height) {
		this.height = height;
		this.width = width;
	}
	
//	멤버 메소드(기능) : 면적 계산하기 + 출력, 테두리길이 계산하기(네 변을 다 더하셈) + 출력
	
	public void area() {
		int extent = this.width * this.height;
		System.out.println("면적 = " + extent);
	}
	
	public void length() {
		int len = (this.width + this.height) * 2;
		System.out.println("둘레 = " + len);
	}
}
