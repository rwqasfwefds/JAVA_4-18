package ex2;

public class PersonDemo {

	public static void main(String[] args) {
//		문제 1 : Person 클래스를 만들고 맴버 변수는
//		name : "", age : 0, email : ""
//		setter를 이용해서 아래 값을 저장
//		객체 p1 : name : "홍길동", age : 23, email : "hong@gmail.com"
//		객체 p2 : name : "김유신", age : 44, email : "Kim@gmail.com"
		
//		출력 : getter를 이용해서 print출력
		
		Person p1 = new Person();
		
		p1.setName("홍길동");
		p1.setAge(23);
		p1.setEmail("hong@gmail.com");
		
		System.out.println("이름 = " + p1.getName() + ", 나이 = " + p1.getAge() + ", 이메일 = " + p1.getEmail());
		
		
		Person p2 = new Person();
		
		p2.setName("김유신");
		p2.setAge(44);
		p2.setEmail("Kim@gmail.com");
		
		System.out.println("이름 = " + p2.getName() + ", 나이 = " + p2.getAge() + ", 이메일 = " + p2.getEmail());

	}

}
