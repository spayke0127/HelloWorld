package Conditions;

public class ForSumFrom1To100Example {
	public static void main(String[] args) {
		int sum = 0;

		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 1) { // 홀수 하는방법 다시 반복복습 하기 .
				sum += i; // i를 숫자로 바꾸면 값이 달라짐

			}
		}
		System.out.println("1에서 100까지 홀수 합은(1)" + sum);
	
	
	sum= 0;
	for (int i =1 ; i <= 100; i+= 2) {
		sum += i; //짝수가되는방법 알아보기
	}
	System.out.println("1에서 100까지 홀수 합은(2)" + sum);
	
	}
	
	
}
