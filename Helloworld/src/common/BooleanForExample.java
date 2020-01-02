package common;

public class BooleanForExample {
	public static void main(String[] args) {
		int var1 = 120 ;
		var1 = 10;
		for (int i = 0; i < 10; i++) {
			for (int i1 = 0; i1 < 10; i1++) {
			}
		
			}			
		
		//60점을 pass 아니면 fail
		//90점을 넘으면 양호, 70점을 넘으면 보통, 그이하 미흡,
		//95점이상 A+하는방법알아보자
		{ if  ( var1> 90 ) {if (var1> 95)
		System.out.println("A+");	
		else
		System.out.println("A");
	}else if (var1 > 80)
			System.out.println("B");
		else if (var1 > 70)
			System.out.println("C");
		else if (var1 > 50)
			System.out.println("D");
		else
			System.out.println("F");
	
	
	}
}
}