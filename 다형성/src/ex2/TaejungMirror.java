package ex2;

public class TaejungMirror implements Mirror {

	@Override
	public void autoClose() {
		System.out.println("»ß±×´ö ¼Ò¸®¸¦ ³»¸ç Á¢Èù´Ù.");
	}

	@Override
	public void control() {
		System.out.println("»ß±×´ö ¼Ò¸®¸¦ ³»¸ç Á¶ÀýµÈ´Ù.");
	}

}
