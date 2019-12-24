package referencetype;

// [인덱스값 구하기]

// 1 6 11 
// 2 7 .
// 3 8 .
// 4 9 . 
// 5 10순으로 하는방법을 찾아보자 (% 참고 컨디션테이블에 포멀티플릭션테이블 참조 )

public class ArrayInArrayExample01 {
	public static void main(String[] args) {
		int[][] intAry = new int[5][5];

		intAry[0][0] = 1;
		intAry[0][1] = 2;
		intAry[0][2] = 3;
		intAry[0][3] = 4;
		int num = 1;
		for (int j = 0; j < 5; j++) {
			for (int i = 0; i < 5; i++) {
				intAry[j][i] = num++;
//			intAry[j][i] = num--;
			}
		}
		for (int j = 0; j < 5; j++) {
			for (int i = 0; i < 5; i++) { // 25가 되려니 이글에 i부분을 4에서 5로 지정했더니 25가 되었다.
				System.out.print(intAry[j][i] + ""); // ln을 뺸상태 가로로 표기
			}
			System.out.println();
		}
	}

}




