package Conditions;
127p
public class whileKeyControlExample {

	public static void main(String[] args) throws Exception {
		boolean run = true;
		int speed = 0;
		int keycode = 0;
		
		while(run) {
			if (keycode!=13 && keycode!=10) { //13도 아니고 10도 아닌상황
				System.out.println("------------");
				System.out.println("1.증속 | 2.감속 | 3.중지");
				System.out.println("------------");
				System.out.println("선택: "); //
				
			}
		
			keycode = System.in.read();
			
			if (keycode == 49) { //1을 읽었을 경우
				speed++;
			System.out.println("현재 속도 =" +speed);
			} else if (keycode == 50) { //2를 읽었을 경우
				speed--;
				System.out.println("현재 속도=" + speed);
			}else if (keycode == 51 ) {//3을 읽었을 경우
			run = false;
			}	
		}

		System.out.println("프로그램 종료");
	}
}