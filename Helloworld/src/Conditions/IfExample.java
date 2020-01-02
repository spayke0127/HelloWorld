package Conditions;
//112p 참조하여 서로 비교해서 작정해보기 else if차이점 알아보기!
public class IfExample {
	public static void main(String[] args) {
		int score = 93;
		if(score >= 90) {
			System.out.println("점수가 90보다 큽니다.");
			System.out.println("등급은 A");			
		}
		else //if 부분말고 다른조건걸때 else 지워도 보기
			if (score < 80) { //if부분 지워봐바 >= 모두 바꿔도 보기
			System.out.println("점수가 90보다 작습니다");
			System.out.println("등급은 B");}
//		if (score < 90) {	
//			System.out.println("점수가 90보다 작습니다");
//		}System.out.println("등급은 B");
//			

			String name = "";
			int kor, eng, mat;
			
			System.out.print("Input name : ");	name = br.readLine();
			System.out.print("kor : ");	kor = Integer.parseInt(br.readLine());
			System.out.print("eng : ");	eng = Integer.parseInt(br.readLine());
			System.out.print("mat : ");	mat = Integer.parseInt(br.readLine());
			
			int sum = kor + eng + mat;
			double avg = (double)sum / 3;
			
			System.out.println("이름 : " + name);
			System.out.println("합계점수 : " + sum);
			System.out.printf("평균점수 : %.1f", avg);
		}

	}
 	else { //if 부분말고 다른조건걸떄 else
 		if (score < 70) { //if부분 지워봐바
		System.out.println("점수가 80보다 작습니다");
		System.out.println("등급은 C");	
		
		} 		//else if (score < 90)...하는 또다른방법도 있다.
 	

 	}
	}
}	