package ex3;

public class CartDemo {

	public static void main(String[] args) {
//		�����ڸ� �̿��ؼ� ���� �����ϰ� ����ϱ�
//		Cart Ŭ������ ����� �ɹ� ���� = owner : "ȫ�浿"
//		Product Ŭ������ ����� �ɹ� ���� = no : "", name : "" , price : 0, discountRate : 0.0
		
//		Product p1 �����ڸ� �̿��ؼ� �ʱ�ȭ �ϼ�
//		no = "a-111", name = "Iphone", price = 800000, discountRate = 0.001
		
//		Product p2 �����ڸ� �̿��ؼ� �ʱ�ȭ �ϼ�
//		no = "b-222", name = "Ipad", price = 10000000, discountRate = 0.002
		
//		p1.info()�� �̿��ؼ� ��� : (���� ������ ��µǴ� �ޙ�)
//		Cart Ŭ������ mycart ��ü ���� ��� getter�̿� ���
		
		Cart mycart = new Cart();
		mycart.setOwner("ȫ�浿");
		System.out.println(mycart.getOwner());
		
		Product p1 = new Product("a-111", "Iphone", 800000, 0.001);
		p1.info();
		
		Product p2 = new Product("b-222", "Ipad", 1000000, 0.002);
		p2.info();
		
	}

}
