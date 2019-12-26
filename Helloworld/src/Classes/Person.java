package Classes;

public class Person {

	String name;
	String birthday;
	int cm;
	
	Person() {

	}

	Person(String name, String birthday, int cm) {
		this.name = name;
		this.birthday = birthday;
		this.cm = cm;
	}
	void Method() {
		
	}
	void introduce() {
		System.out.println("제 이름은 " + name + "이고 생일은 " + birthday + "입니다."+ "당신의 키는 "+ cm + "cm 이다."  );
	}
}
