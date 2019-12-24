package Classes;

public class StudentExample {
	public static void main(String[] args) {
		String str = "Hello";
		String str1 = new String("Hello");

		Student student = new Student();
		student.university = " Yedam";
		student.studentNo = "19234-1234";
		student.studentName = "김철수 ";
		student.age = 20;
		student.major = "English";
		student.introduce();

		Student student1 = new Student("Yedam ", "921111-1111 ", " 박철수 ");
		student1.introduce(); //이부분에서 student1이 있냐없냐에 차이에도 기입이 되고 안되고 함(이라인을 없앨경우 전혀 출력이 생성이안됨)
//		student1.university();
		student1.newMethod();
//		System.out.println(student.major); //기입하는데로 그전 스튜던트 클래스에 기입한게 나오게됨
//		student.doHomework();
//		System.out.println(student);//new의 의미는 생성자(instance) 호출의 의미 
	}
}
