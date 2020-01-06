package co.micol.Lecture01;

import java.util.Date;

public class Member {
	String id;
	String name;
	Date eDate;
	String addr;
	String tel;

	private int age;

	public void setAge(int age) {
		this.age = age;
	}

	public int getAge() {
		return this.age;
	}

	public String toString() { // String & void
//		age = 18;
		System.out.println("id :" + id + " 나이 : " + age);
		return null; // 리턴을 하기싫다고 할떈 바로위 스트링을 void로 변경하고 리턴글은 삭제
	}

	public void toPrint() {
		System.out.println("name : " + name + "eDate : " + eDate + " addr : " + addr + "tel : " + tel);
		System.out.println("===============================");

	}
}
