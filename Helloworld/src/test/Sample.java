package test;

import java.util.Scanner;

public class Sample {
	int price;
	String item;
	int qty;
	
	Sample(){
	}
	Sample(int price) {
	}{
	this.price = price;
	}
	Sample(int price, String item) {
	}{
		this.price = price;
		this.item = item;
	
	}
	
}
public class SampleExe1 {
//	public static void main(String[] args) { //오버로딩
//		Sample sample = null; //new Sample();
//		sample = new sample
//	}
//}

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		Sample[] samAry = new Sample[100];
		//int[]intAry = new int[10]; //10개짜리 담을수있는 변수다 뜻
		Sample sample = new Sample(30,"apple");
		samAry[0] = sample; // 샘 0번쨰에 (예 samAry[0].getSample .엔터. samAry[0].getName();
		
		System.out.println("메뉴선택 1. 2. 3");
		
		int menu = scn.nextInt();
		scn.nextLine();
		System.out.println("다음선택1");
		scn.nextLine();
		System.out.println("다음선택2");
		scn.nextLine();
		
		cal("test", 3, 1000);
//		Sample sample1 = null; //new Sample();
//		Sample sample11 = new Sample(30,"apple");
	}
	
static int cal(String a, int b, int c) {  //스태틱은  메인메뉴와 cal메뉴를 같이 실행시켜주게함
	
	return 10;
}
}
