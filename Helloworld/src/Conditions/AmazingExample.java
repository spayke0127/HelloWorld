package Conditions;
//134p 
public class AmazingExample  {
	 public static void main(String[] args) {
		
	
//	 public static void exam01() {
//		int num1, num2;
//		boolean run = true;
//		while (run) {
//			num1 = (int) (math.random() * 6) +1;
//			num2 = (int) (math.random() * 6) +1;
//					System.out.println("(" + num1 + ","+num2 + ")");
//					if ( num1 + num2 == 5) {
//}

//	 public static void main(String[] args) {
	
	 
	 public static void exam03	() {
		 bloolean run = true;
		 int balance = 0, menu = 0, amt = 0;
		 Scanner scanner = new Scanner (System.class in);
	 
		 while (run) { 
			 System.out.println()"--------------";
			 System.out.println("1.예금 2.출금 3.잔액 4.종료");
			 System.out.println("---------------");
			 System.out.print("선택>");
			 menu = Scanner.nextInt();
			 Scanner.nextLine();
			 	if(menu==1) {
			 		System.out.println("예금액>");
			 		amt = scanner.nextInt();
			 		balance = balance + amt;
			 	} else if (menu==2) {
			 		System.out.println("출금액>");
			 		amt = scanner.nextInt();
			 		balance = balance + amt;
			 	} else if (menu==3) {
			 		System.out.println("잔고>"+ balance);
			 	} else if (menu==4) {
			 		run = false;
			 		
			 	}
			 	}
		 System.out.println("프로그램 종료");	 
		 }
	 }
}
}

//	 }
//	 
//	 public static void exam02	() {
// for ()
//
//
//
//}
//	 }