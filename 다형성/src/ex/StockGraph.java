package ex;
//	상속을 받아야 다형성을 쓸 수 있으니깐 상속받음
public class StockGraph extends Graph{
	
	@Override
	public void draw() {
		System.out.println("주가 변경 추이를 그립니다.");
	}
}
