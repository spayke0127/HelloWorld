package Conditions;
//112p~114~119p
public class SwitchExample {
	public static void main(String[] args) {

		System.out.println((int)(Math.random()*2)+1); //
			
	
	
	
		int score = 4;
		switch (score / 2) {
		case  1: 
		System.out.println("1번 당첨");			
		break;
		case  2:
		System.out.println("2번 당첨");
		break;
		}
	}
}// 어려운 문제군
		
		//int score = 83;
		//switch (score / 10) {	
//			case  9: 
//			System.out.println("점수가 90보다 큽니다.");
//			System.out.println("등급은 A");			
//			break;
//			case  8:
//			System.out.println("점수가 80보다 작습니다");
//			System.out.println("등급은 B");
//			break;
//			case 7:
//				System.out.println("점수가 70보다 작습니다");
//				System.out.println("등급은 C");
//			break;
//			default:	
//				System.out.println("점수가 70보다 작습니다");
//				System.out.println("등급은 D");
//}
//	}
//}