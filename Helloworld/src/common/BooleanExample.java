package common;

public class BooleanExample {
public static void main(String[] args) {
	boolean trueOrFalse = 100 > 20 ; //true	
	int var1 = 0;
    trueOrFalse = var1 > 55; // 참 거짓
    
    for ( int i = 0; i < 120; i++) {
    	var1++;
    	trueOrFalse = var1 > 120;
    	if (trueOrFalse)
    		System.out.println(var1 +"=> 점수입력");
    	else	
    		System.out.println(var1 +"=> 입력오류");
    	System.out.println("End of program");	
    }
	}
}