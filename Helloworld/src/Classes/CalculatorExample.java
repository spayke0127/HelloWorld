package Classes;

public class Calculators {
static double PI = 3.14159; // 정적변수 대문자, 두단어이상 _(언더바)
 // EARTH_AREA = 6593902394;
String color;

void setColor(String color) {
	this.color = color;

}

static int plus(int x, int y) {
	return x + y;
}

static int minus(int a, int b) {
	return a - b;
}
}

public class CalculatorsExample {
	public static void main(String[] args) {
		Calculators cal = new Calculators();
		cal.color = "White";
		cal.setcolor("back"); //인스턴스 메소드 반드시 인스턴스 선언 후, 메소드 가능
		cal.plus(4,5);
		
		Calculators.plus(6, 7); //정적(static) 메소드는 클래스명.메소드
	}
}