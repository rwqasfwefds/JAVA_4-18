package ex2;

public class DongSungMirror implements Mirror {

	@Override
	public void autoClose() {
		System.out.println("�õ��� ���� �ڵ����� ����");
	}

	@Override
	public void control() {
		System.out.println("�ſ��� ���� �����ϱ�");
	}

}
