package TestFile;

public class test03 {
public static void main(String[] args) {
	String name = "김철수";
	int kor = 90,eng = 70,mat = 75;

	int sum = kor + eng + mat;
	double avg = (double)sum / 3;
	double avg = 0.1;
	System.out.println("이름 : " + name);
	System.out.println("합계점수 : " + sum);
	System.out.printf("평균점수 : %.1f", avg);
}


}

import java.io.*;
class Ex21 {

	public static void compute(String item, int qty, int price) {
		System.out.println("품명 : "+ item);
		System.out.println("금액 : " + (qty*price));
	}
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String item=null;
		int qty, price;
		
		System.out.print("품명 : ");	item=br.readLine();
		System.out.print("수량 : ");	qty=Integer.parseInt(br.readLine());
		System.out.print("단가 : ");	price=Integer.parseInt(br.readLine());
		System.out.println();
		
		compute(item, qty, price);
	}
}