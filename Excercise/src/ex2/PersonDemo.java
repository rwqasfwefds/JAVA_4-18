package ex2;

public class PersonDemo {

	public static void main(String[] args) {
//		���� 1 : Person Ŭ������ ����� �ɹ� ������
//		name : "", age : 0, email : ""
//		setter�� �̿��ؼ� �Ʒ� ���� ����
//		��ü p1 : name : "ȫ�浿", age : 23, email : "hong@gmail.com"
//		��ü p2 : name : "������", age : 44, email : "Kim@gmail.com"
		
//		��� : getter�� �̿��ؼ� print���
		
		Person p1 = new Person();
		
		p1.setName("ȫ�浿");
		p1.setAge(23);
		p1.setEmail("hong@gmail.com");
		
		System.out.println("�̸� = " + p1.getName() + ", ���� = " + p1.getAge() + ", �̸��� = " + p1.getEmail());
		
		
		Person p2 = new Person();
		
		p2.setName("������");
		p2.setAge(44);
		p2.setEmail("Kim@gmail.com");
		
		System.out.println("�̸� = " + p2.getName() + ", ���� = " + p2.getAge() + ", �̸��� = " + p2.getEmail());

	}

}
