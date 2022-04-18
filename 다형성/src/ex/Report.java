package ex;

public class Report {
//	온갖 그래프 출력 기능 구현
//	밑에 기능을 나중에 추가 할 수도있잖슴 ㅇㅇ
//	그걸 고려해서 만드는 로직임
//	컬러 그리기, 흑백 그리기, 컬러 + 흑백 그리기 등등
//	다형성 메소드를 고려해야 함
//	spring에서는 다형성 형태를 "DI 형태" 라고 함(의존성 주입)
	public void draw(Graph g) {
		g.draw();
	}
}
