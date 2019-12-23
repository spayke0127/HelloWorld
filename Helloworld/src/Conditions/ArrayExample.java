package Conditions;

public class ArrayExample {
	public static void main(String[] args) {
	

	int a = 6, b = 7, c = 3, d = 5, e = 9;
	int maxValue	=	0;
		//다섯개의 변수에 들어있는 값중에 가장 큰 수를 maxValue에 대입하는,
		int[] intAry = {6, 7, 3, 5, 9};
	    for(int i = 0; i<5; i++ ) {
		if(intAry[i] > maxValue)
		   maxValue = intAry[i];

	    }
	    System.out.println("최대값은: "+ maxValue);
	    
	    
	    int minValue = Integer.MAX_VALUE;
	    for (int i=0; i < intAry.length; i++) {
	    	if (intAry[i] < minValue)
	    		minValue = intAry[i];
	    }
	
	   System.out.println("최소값은: " + minValue); //최소값을 알아볼떄와 최대값을 알아볼떄,,
	}
	
	
}
