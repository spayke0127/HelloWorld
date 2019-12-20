package referencetype;

public class ArrayExample {
	public static void main(String[] args) {

		int[] num = new int[25];
		int summary = 0; 
		double avg = 0; 
		for (int i = 0; i < num.length; i++) {
			num[i] = i + 1;
			
		System.out.print("배열의 크기 : " num.length);
		summary += num[i]	;
		
		
		
		 { // 공식적으로 익혀 놔야함
			num[i] = i + 1; // 인덱스 반복문
		}

		for (int i = 0; i < num.length; i++) {
			num[i] = i + 1;
		}
	}
			
//			System.out.println(num[i] + "");
//			if (1 % 5 == 4)
//				System.out.print();
		}
	}

	public static void exam02() {

		int[] intAry = new int[25];
		for (int i = 0; i < 25; i++) {
			intAry[i] = i + 1;
		}

		for (int i = 0; i < 25; i++) {
			System.out.print(intAry[i]);
			if (i % 5 == 4)
				System.out.println();
		}

	}

	public static void exam01() {
		int[] intAry = { 1, 2, 3, 4, 5 }; // int intAry[] 인트형인데 배열을 담을수있습니다. 이것도 쓸수있음.
		System.out.println(intAry[2]);
		intAry[2] = 30; // 2가 값이지만 30을 넣겟다 했을과정
		System.out.println(intAry[2]);
		int sum = 0;
		for (int a = 0; a < 5; a++) {
			if (a % 2 == 0)
				sum += intAry[a]; // sum = sum +i ;
			System.out.println("합계는 " + sum);
		}

		String[] strAry = { "hello", " nice", "good", "wonderful" };

		for (int i = 0; i <= 4; i++) {
			System.out.println("총합:" + sum);
			System.out.println(strAry[i]);
		}

		System.out.println(strAry[1]);
		System.out.println(strAry[2]);
		System.out.println(strAry[3]);
	}
}
