package referencetype;

//1~100까지의 수 7의 배수 출력

public class ForArrayExample03 {
	public static void main(String[] args) {

//		int sum = 0;
		for (int i = 0; i <= 100; i++) {
			if (i % 7 == 0)
//				sum += i; 
			System.out.println(" 7의 배수 : " + i);
			 // sum 대신 i를 넣을경우 배수의 출력이 나옴
		}

	}

}
