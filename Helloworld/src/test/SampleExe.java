package test;

import java.util.Scanner;

public class SampleExe {
public static void main(String[] args) {
	Scanner scn = new Scanner(System.in);
	System.out.println("메뉴선택 1. 2. 3");
	int menu = scn.nextInt();
	scn.nextLine();
	System.out.println("다음선택1");
	scn.nextLine();
	System.out.println("다음선택2");
	scn.nextLine();
	if ( 1 == 1 || 2 == 1) {
		System.out.println("오류!!");
	}else {
//		int result = 3+5;
		double result =  4 / 3;
	}
}


}
