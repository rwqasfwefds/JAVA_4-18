package ex4;

public class Rectangle {
//  �ɹ� ����(�Ӽ�) : �ʺ�, ����
	private int width;
	private int height;
	
	public Rectangle() {
		
	}
	
	public Rectangle(int width, int height) {
		this.height = height;
		this.width = width;
	}
	
//	��� �޼ҵ�(���) : ���� ����ϱ� + ���, �׵θ����� ����ϱ�(�� ���� �� ���ϼ�) + ���
	
	public void area() {
		int extent = this.width * this.height;
		System.out.println("���� = " + extent);
	}
	
	public void length() {
		int len = (this.width + this.height) * 2;
		System.out.println("�ѷ� = " + len);
	}
}
