package ex7;

public class PhoneTest {
	
	public static void show(Phone p) {
		p.call();
		p.sms();
		
		if(p instanceof Iphone) {
			Iphone iphone = (Iphone)p;
			iphone.facetime();
			iphone.itunes();
		} else if(p instanceof Galaxy) {
			Galaxy galaxy = (Galaxy)p;
			galaxy.dmb();
			galaxy.navi();
		}
	}
	
	public static void main(String[] args) {
//		1. �������� �������� ����� ��� ����ϼ���
//		2. ���� ��ɵ� ����� ������
		
		Iphone p1 = new Iphone();
		Galaxy p2 = new Galaxy();
		
		show(p1);
		System.out.println("----------------");
		show(p2);
	}
}