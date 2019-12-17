package common;

public class CharExample {
	public static void main(String[] args) {
		char c1 = 'A';
		char c2 = 65;
		char c3 = '\u0041';
		int v1 = c1; //인트타입이냐 캐리터타입이냐에 따라 결과값 달라짐
		System.out.println(v1); //v1 추가한 내용임 삭제도 해봐도됨 위에 인트 v1도 포함
//		System.out.println("c1:" + c1 + ", "	
//					    +  "c2:" + c2 + ", "
//						+  "c3:" + c3);

		for (int i = 0; i < 26; i++) {
			System.out.println(c1++);
		}
//						   c1 = (char) (c1+ 1);
//						   System.out.println("c1 + 1: " + c1); // concatenate

		// A ~ Z 까지 화면에 출력 프로그램 작성.

	}
}