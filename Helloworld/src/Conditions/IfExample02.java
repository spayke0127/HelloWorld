dpackage Conditions;

public class IfExample {
	public static void main(String[] args) {
		int score = 83;
	switch (score / 10) {	
			case  9: 
			System.out.println("점수가 90보다 큽니다.");
			System.out.println("등급은 A");			
			break;
			case  8:
			System.out.println("점수가 80보다 작습니다");
			System.out.println("등급은 B");
			break;
			case 7:
			System.out.println("점수가 70보다 작습니다");
			System.out.println("등급은 C");
			break;
			default:	
			System.out.println("점수가 70보다 작습니다");
			System.out.println("등급은 D");
}
	}
}