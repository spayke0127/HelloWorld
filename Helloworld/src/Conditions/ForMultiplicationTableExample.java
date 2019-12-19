package Conditions;

public class ForMultiplicationTableExample {
	public static void main(String[] args) {
		for (int n = 1; n <= 9; n++) {
			System.out.println("***" + n + "단 ***");
			for (int m = 1; m <= 9; m++) {
				System.out.print(m + "x" + n + "=" + (m * n)+" "); 
				//ln을 지우면 옆으로 출력됨
			}
		}
	}
}


for (int i = 1; i <= 9;  i++)
	for