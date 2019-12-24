package referencetype;

public class MethodExample {
	public static void main(String[] args) {
		String Result = printResult("임치수");
//  int s1 = sum(3,5);
//		double s1 = divideBy(5, 3);
//		System.out.println("s1은 " + s1);
//	
//		System.out.println(result);
	}

	double s1 = calculator(3, 4, "+");// s1의 출력값
//	System.out.println("s1은"+s1);



	public static double calculator(double a, double b, String cal) {
		double result = 1;
		return result; //더블을 실수로 표현을 하라. +,-,%,* 등등,,
	}

	public static String printResult(String name) { // 반갑습니다 인사하는부분
		// String str = "반갑습니다" name + "씨.";
		// return str;
		String str = "반갑습니다" + name + "씨.";
		return str;
	}

	public static double divideBy(int a, int b) {
		double result = (double) a / b;
		return result;
	}

	public static int sum(int a, int b) {
		int result = 0;
		result = a + b;
		return result;

	}
}
