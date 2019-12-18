package operators;
//73p
public class IncreaseDecreaseOperatorExample {
	public static void main(String[] args) {
		int x = 10;
		int y = 10;
		x++; 
		y--;
		System.out.println("x: " + x + ", y: " + y);

		System.out.println(x++);  // x = 12
//		System.out.println(++x);  //왼쪽에있으면 플러스한다음 연산처리, 오른쪽이면 그반대로 연산처리
		System.out.println(x);
	
	boolean play = true;
	System.out.println(play);

	play = !play; // 라스트의미? 
	System.out.println(play);
	
	if(play)
		System.out.println(play + "한번 더 출력");
	
	}		
	}
	

