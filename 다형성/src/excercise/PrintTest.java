package excercise;

public class PrintTest {
	
	public static void testAllPrinter(Printer p) {
		p.print();
	}

	public static void main(String[] args) {
		Laser p1 = new Laser();
		Color c1 = new Color();
		
		testAllPrinter(p1); // ��� : "�������� �����ϰ� ����մϴ�."
		testAllPrinter(c1); // ��� : "�÷��� ����մϴ�."
	}

}
