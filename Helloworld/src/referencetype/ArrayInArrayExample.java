package referencetype;

public class ArrayInArrayExample {
	public static void main(String[] args) {
		int[][] intAry = new int[5][4];

		intAry[0][0] = 1;
		intAry[0][1] = 2;
		intAry[0][2] = 3;
		intAry[0][3] = 4;
		int num = 1;
		for(int j=0; j<5; j++) {
			for(int i=0; i<4; i++) {
			//intAry[j][i] = num++;
			intAry[j][i] = num--;
		}
	}
		for(int j=0; j<5; j++) {
			for(int i=0; i<4; i++) {
				System.out.println(intAry[j][i] + ""); //ln을 뺸상태 가로로 표기
			}
			System.out.println();
		}
}
}
