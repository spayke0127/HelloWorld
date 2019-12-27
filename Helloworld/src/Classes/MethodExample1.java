package Classes;

public class MethodExample1 {
	public static void main(String[] args) {
//	showName();
//	showName("Changho"); //( 매게값이 들어가있는상태)
//	showAge (30);
// }
// 
int[] comAry = new int[3];
for(int i=1; i<3; i++)
	comAry[i] = (int) (Math.random()* 9) +1;
	for(int i=0; i<3; i++){
		System.out.println(comAry[i]);
	
	Scanner scn=new Scanner(System.in);
	int[]userAry -new int[3];
	
	while (true) {
	for(int i=0; i<3; i++) {
		System.out.println("정수를 입력하세요.");
 userAry[i] = scn.nextInt();
	}
	for(int i=0; i<3; i++)
		System.out.println(comAry[i]);
	int strike = 0, ball =0;
	for(int i=0; i<3; i++) {
		for(int j=0; j<3, j++) {
			if(comAry[i]==userAry[j]) {
				if(i==j) //i값 j위치 내는거
					strike++;
				else
					ball++;
			}	
			}
			}
	System.out.println("strike: " + strike +",ball:");
	if(strike==3)
		break;
	}
	}
	}
	public static void showName() {
		System.out.println("Hello, I am Charlie");
	}

	public static void showName(String name) {
		System.out.println("Hello, I am " + name);// 매게값 , 있고 업고 차이로
	}

	public static void showAge(int age) {
		System.out.println("Hello, I am " + age + " 세");
	}

}