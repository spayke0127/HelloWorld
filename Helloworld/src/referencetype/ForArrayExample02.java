package referencetype;

//1~100 3의 배수의 합 

public class ForArrayExample02 {
	public static void main(String[] args) {

		int sum = 0;
		for (int i = 1; i <= 100; i++) {
			if (i % 3 == 0)
				sum += i;

		}
		System.out.println(" 3의 배수 : " + sum); // sum 대신 i를 넣을경우 배수의 출력이 나옴
	}

}
