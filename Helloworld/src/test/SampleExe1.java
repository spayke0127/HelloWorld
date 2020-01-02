package test;

import java.util.Scanner;

public class SampleExe1 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("메뉴선택 1. 2. 3");
		int menu = scn.nextInt();
		scn.nextLine();
		System.out.println("다음선택1");
		scn.nextLine();
		System.out.println("다음선택2");
		scn.nextLine();
		
		cal("50", 3, 1000);
}
	
static int cal(String a, int b, int c) {  //스태틱은  메인메뉴와 cal메뉴를 같이 실행시켜주게함
	
	return 10;
}
}