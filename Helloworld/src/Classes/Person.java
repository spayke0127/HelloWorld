package Classes;

public class Person {

	String name;
	String birthday;
	int age;
	
	Person() {

	}

	Person(String name, String birthday, int age) {
		this.name = name;
		this.birthday = birthday;
		this.age = age;
	}
	void Method() {
		
	}
	void introduce() {
		System.out.println("제 이름은 " + name + "이고 생일은 " + birthday + "입니다.");
	}
}
