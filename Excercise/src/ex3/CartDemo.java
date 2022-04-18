package ex3;

public class CartDemo {

	public static void main(String[] args) {
//		생성자를 이용해서 정보 저장하고 출력하기
//		Cart 클래스를 만들고 맴버 변수 = owner : "홍길동"
//		Product 클래스를 만들고 맴버 변수 = no : "", name : "" , price : 0, discountRate : 0.0
		
//		Product p1 생성자를 이용해서 초기화 하셈
//		no = "a-111", name = "Iphone", price = 800000, discountRate = 0.001
		
//		Product p2 생성자를 이용해서 초기화 하셈
//		no = "b-222", name = "Ipad", price = 10000000, discountRate = 0.002
		
//		p1.info()를 이용해서 출력 : (위에 정보가 출력되는 메솓)
//		Cart 클래스의 mycart 객체 정보 출력 getter이용 출력
		
		Cart mycart = new Cart();
		mycart.setOwner("홍길동");
		System.out.println(mycart.getOwner());
		
		Product p1 = new Product("a-111", "Iphone", 800000, 0.001);
		p1.info();
		
		Product p2 = new Product("b-222", "Ipad", 1000000, 0.002);
		p2.info();
		
	}

}
