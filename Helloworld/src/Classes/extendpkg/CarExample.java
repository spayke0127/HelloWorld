package Classes.extendpkg;

public class CarExample {
	public static void main(String[] args) {
		Car car = new Car();

		for (int i = 0; i <= 10; i++) {
			int problemLocation = car.run();

			switch (problemLocation) {
			case 1:
				System.out.println("앞왼쪽 교체.");
				car.frontLeft = new KumhoTire("앞왼쪽", 10);
				break;
			case 2:
				System.out.println("앞오른쪽 교체.");
				car.frontRight = new HankookTire("앞오른쪽", 11);
				break;
			case 3:
				System.out.println("뒤왼쪽 교체.");
				car.backLeft = new KumhoTire("뒤왼쪽", 13);
				break;
			case 4:
				System.out.println("뒤왼쪽 교체.");
				car.backRight = new HankookTire("뒤왼쪽", 12);
				break;
			}
			System.out.println("----------------");
		}
	}
}
