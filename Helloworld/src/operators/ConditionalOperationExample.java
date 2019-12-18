package operators;

import javax.sound.midi.Soundbank;

//101p
public class ConditionalOperationExample {
	public static void main(String[] args) {

				int score = 45;
//				char grade = (score > 90) ? 'A' : 'B';
				char grade = (score > 90) ? 'A' :(score > 80) ? 'B': (score > 70) ? 'C':'D';
//				if(score > 90)
//					grade = 'A';
//				else {
//					if(score> 80)
//					   grade = 'B';
//					else
//						if(score> 70)
//						grade = 'C';
//				}
				System.out.println(grade);
	
	
	}
}