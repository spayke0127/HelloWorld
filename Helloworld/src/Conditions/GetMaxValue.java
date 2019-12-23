package Conditions;

public class GetMaxValue {
	public static void main(String[] args) {
		int [] intAry = {8,7,6,5,4};
		int temp = 0;
	for (int j =0; j < (intAry.length - 1); j++) { //새롭게 추가된 for문//최소값부터 실행이 되게끔 i에서 j로 추가하게됨으로써 최소값부터 실행이 되게끔 몇번이고 실행이되어 뒤에 끝마침.
		for (int i =0; i < (intAry.length - 1); i++) { 
			if (intAry[i] > intAry[i+1]) {
				temp = intAry[i];
				intAry[i] = intAry[i+1];
				intAry[i+1] = temp;
			}
		}
 	// intAry = { 4,5,6,7,8}
	for(int i = 0; i  < intAry.length; i++) { 
		System.out.println(intAry[i] + "");
	}
}
}
}