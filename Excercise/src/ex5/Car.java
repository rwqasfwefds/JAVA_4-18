package ex5;

public class Car {
//  �ɹ� ���� : �̸�, ����Ŀ, ����
	private String name;
	private String maker;
	private int price;
	
//	������ 2�� : �Ű����� ���� ������, �Űܺ��� 3��¥�� ������
	Car() {}
	
	Car(String name, String maker, int price){
		this.name = name;
		this.maker = maker;
		this.price = price;
	}
	
//	�޼ҵ� : ��� ������ ���� ��� �� �޼ҵ�
	public void show() {
		System.out.println("���� �̸� = " + name + ", �귣�� = " + maker + ", ���� = " + price);
	}
}
