
package referencetype;

import java.util.Scanner;

public class ReXample01 {
	public static void main(String[] args) {
		boolean run = true;
		int balance = 5, menu = 0, amt = 0;
		Scanner scanner = new Scanner(System.in);

		while (run) {
			System.out.println("---------------");
			System.out.println("1.입력 2.합계 3.평균 4.종료");
			System.out.println("---------------");
			System.out.println("선택>");	
			for (int i = 0; i < 5; i++) {

				for (int a = 0; a < 5; a++) {	
					
				// scanner.nextLine();
				System.out.println("하실 일 선택");
				menu = scanner.nextInt();	
				
				if (menu == 1) {	
				System.out.println("입력>");
				amt = scanner.nextInt();
				balance = balance + amt;
				} 
				
			 	else  if (menu==2) {
		 		System.out.println("합계>");
		 		System.out.println(balance);
			 	} 
				
			 	else if (menu==3) {
		 		System.out.println("평균>"+ balance);
			 	} 
				
			 	else {
			 		break;
		 		}
				
				}
				
			}	
			 	
			 	
		 	}
	 System.out.println("프로그램 종료");	 
	 }
}