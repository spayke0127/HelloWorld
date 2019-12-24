package Classes;

// 클래스는 필드, 생성자, 메소드는 꼭있어야 한다 
public class Student {
	// 필드
	String university; // 필드 하나 더 추가
	String studentNo;
	String studentName;
	String major;
	int age;

	// 생성자
	Student() {

	}

	Student(String university, String studentNo, String studentName) {
		this.university = university; // 여기선 인스턴스를 디스 의미이고, 필드 유니벌스는 생성자를 의미
		this.studentNo = studentNo;
		this.studentName = studentName;
	}

	// 메소드
	void introduce() {
		System.out.println("학교는 " + university + " 학번은" + studentNo + "이고 이름은 " + studentName + "만20세 " + "입니다.");

	}

	void newMethod() {

	}

	void doHomework() {

		System.out.println("");
	}
}
