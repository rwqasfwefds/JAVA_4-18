package ex6;

public class Account {
//	�ɹ� ���� : �̸�, �ܾ�, �н�����
	private String name;
	private int money;
	private String password;
//	������ : �Ű����� 3��¥��
	Account(){}
	
	Account(String name, int money, String password){
		this.name = name;
		this.money = money;
		this.password = password;
	}
//	�޼ҵ� : deposit(�Աݾ�, �н�����)
//	�Ű����� �н������ �ɹ����� �н����尡 ��ġ�� ����
//	�Աݾ��� ���� �����ּ���
//	���1 : �̸� + "������" + �Աݾ� + "���� �ԱݵǾ����ϴ�."
//	���2 : "���� �ܾ��� : " + �ܾ� + "�� �Դϴ�."
//	��ġ ���� ������
//	���1 : "��й�ȣ�� ��ġ���� �ʽ��ϴ�."
//	���2 : "�ٽ� �Է��� �ֽñ� �ٶ��ϴ�."
	public void deposit(int money, String password) {
		if(this.password == password) {
			this.money += money;
			System.out.println(this.name + " ������ " + money + "���� �ԱݵǾ����ϴ�.");
			System.out.println("���� �ܾ��� " + this.money + "�� �Դϴ�.");
		} else {
			System.out.println("��й�ȣ�� ��ġ���� �ʽ��ϴ�");
			System.out.println("�ٽ� �Է��� �ֽñ� �ٶ��ϴ�.");
		}
	}
}