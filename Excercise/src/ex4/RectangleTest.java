package ex4;

public class RectangleTest {

	public static void main(String[] args) {
//		1. ��ü ���� : �ʱ� �� ���� ����
//		2. ��� ��� : ���� ��� �޼ҵ� ȣ��, �Ѹ� ��� �޼ҵ� ȣ��
		Rectangle r1 = new Rectangle();
		r1.area();
		r1.length();
		
		System.out.println("--------");
//		3. ��ü ���� : �Ű�����(30, 50)
//		4. ��� ��� : ������� �޼ҵ� ȣ��, �ѷ� ��� �޼ҵ� ȣ��
		Rectangle r2 = new Rectangle(30, 50);
		r2.area();
		r2.length();
	}

}
