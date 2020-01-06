package co.micol.mainapp;


import java.util.Date;

import co.micol.Lecture01.Member;

public class MainApp {

	public static void main(String[] args) {

		// TODO Auto-generated method stub
		Member member = new Member();
//		Date date = new Date();
//		 
//		member.id = " micol ";
//		member.name = " 홍길동 ";
//		member.eDate = date;
//		member.addr = " 대구광역시 ";
//		member.tel = " 010-1111-2222 ";

		member.setAge(18);//위에와 투프린트 주석하고 생성된 문구 반대로 주석풀고 주석걸면 다른값이 나옴
		member.toString();// 생성하면 아이디는 널로 표기됨
//		member.toPrint();//

	}
}
