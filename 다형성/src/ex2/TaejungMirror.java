package ex2;

public class TaejungMirror implements Mirror {

	@Override
	public void autoClose() {
		System.out.println("�߱״� �Ҹ��� ���� ������.");
	}

	@Override
	public void control() {
		System.out.println("�߱״� �Ҹ��� ���� �����ȴ�.");
	}

}
