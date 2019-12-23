package referencetype;


//while로 변경해보기

public class ForArrayExample01 {
	public static void main(String[] args) {
		int sum = 0;
		for (int i = 1; i <= 10; i++) {
//			sum += i;
		}
	int i = 1;
	int sum1 = 0;
	while ( i <= 100) {
		sum1 = sum1 + i;
		i++;
	
	}
		System.out.println(" 합 : " + sum1);
	
		do { //와일(while) 반복문  
			sum1 = sum1 + 1;
			i++;
		} while (i <= 10); 
	}
}

