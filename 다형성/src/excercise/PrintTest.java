package excercise;

public class PrintTest {
	
	public static void testAllPrinter(Printer p) {
		p.print();
	}

	public static void main(String[] args) {
		Laser p1 = new Laser();
		Color c1 = new Color();
		
		testAllPrinter(p1); // 출력 : "레이저로 선명하게 출력합니다."
		testAllPrinter(c1); // 출력 : "컬러로 출력합니다."
	}

}
