package operators;
//81p
public class CheckOverflowExample {
	public static void main(String[] args) {
		try { //트라이???
			int result = safeAdd(200000000, 200000000);
			System.out.println(result);
		} catch (ArithmeticException a) {//
			System.out.println("오버플로우가 발생, 계산할 수 없음");//
		}
	}
	public static int safeAdd(int left, int right) {
		if (right > 0)
			if( left > Integer.MAX_VALUE - right) { // 
				throw new ArithmeticException("오버플로우 발생");
			}
	
return left + right;
}
}