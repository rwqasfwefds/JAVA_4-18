package ex3;

public class Product {
	private String no;
	private String name;
	private int price;
	private double discountRate;
	
	public Product() {}
	
	public Product(String no, String name, int price, double discountRate){
		this.no = no;
		this.name = name;
		this.price = price;
		this.discountRate = discountRate;
	}
	
	public void info() {
		System.out.println("��ǰ ��ȣ = " + no + ", ��ǰ �� = " + name + ", ��ǰ ���� = " + price + ", ������ = " + discountRate);
	}
	
}
