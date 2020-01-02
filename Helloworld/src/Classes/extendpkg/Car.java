package Classes.extendpkg;

//312p
public class Car {
	Tire frontLeft = new Tire("앞왼쪽", 6);
	Tire frontRight = new Tire("앞오른쪽", 3);
	Tire backLeft = new Tire("뒤왼쪽", 3);
	Tire backRight = new Tire("뒤오른쪽", 4);
//Tire[]Tires = { new Tire("앞왼쪽", 6), new Tire("앞오른쪽", 3),
//				new Tire("뒤왼쪽", 3), new Tire("뒤오른쪽", 4)}; //이렇게 선언해도된다.
//메소드
	void stop() {
		System.out.println("자동차가 멈춥니다]");
	}

	int run() { // void run() { 책은 보이드 교수님은 인트라 설정함 왜?
		System.out.println("[자동차가 달립니다]");
		if (frontLeft.roll() == false) { 
//		for (int i = 0; i< tires.length; i++) {
//		if (tires[0].roll() == false) { 
			stop();
			return 1; // 왼.앞.

		}

		if (frontRight.roll() == false) {
//		if (tires[1].roll() == false) {
			stop();
			return 2; // 오.앞.

		}
		if (backLeft.roll() == false) {
//		if (tires[2].roll() == false) {
			stop();
			return 3; // 왼.뒤.
		}
		if (frontRight.roll() == false) {
//		if (tires[4].roll() == false) {
			stop();
			return 4; // 오.뒤.
		}
		return 0;
	}
}
