package Conditions;
// 132p
public class ContinueExample {
public static void main(String[] args) {
	for (int i = 1; i <=10; i++) {
		if (i % 2 == 1) {
			continue; //컨티뉴 그다음 반복문으로 돌아간다 break는 반복문에서 멈춤
		}
		System.out.println(i);
	}
}
}