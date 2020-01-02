package TestFile;

import java.util.Scanner;

public class Swimming1 {


	private static Swimming[] accountArray = new Swimming[100];

	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		boolean run = true;

		while (run) {

			System.out.println("===========================");

			System.out.println("1.추가 | 2.수정 | 3.리스트 | 4.삭제");

			System.out.println("===========================");

			System.out.println("선택> ");

			int selectNo = sc.nextInt();
				sc.nextLine();
			if (selectNo == 1) {
				// 회원등록
				signin(); 
			} else if (selectNo == 2) {
				// 회원수정
				editprofile();
			} else if (selectNo == 3) {
				// 회원정보
				memberlist();
			} else if (selectNo == 4) {
				 //회원탈퇴
				Withdrawal();
			} else if (selectNo == 5) {
				// 종료
				run = false;
			}
		}
		System.out.println("프로그램 종료.");
	}
	static void signin() {
		System.out.println("계좌번호 입력:");
		String ano = sc.nextLine();
		System.out.println("사용자 입력:");
		String owner = sc.nextLine();
		System.out.println("금액입력:");

		int balance = sc.nextInt();

		Swimming acnt = new Swimming(ano, owner, balance);

		for (int i = 0; i < accountArray.length; i++) {

			if (accountArray[i] == null) {

				accountArray[i] = acnt; 

				break;

			}

		}

	}

	static void editprofile() {

		for (Swimming acnt : accountArray) {

			if (acnt != null) {

				System.out.println(acnt);

			}

		}

	}

	static void memberlist() {

		System.out.println("조회 할 계좌 입력:");

		String ano = sc.nextLine();

		System.out.println("입금 할 금액 입력:");

		int amount = sc.nextInt();

		Swimming accnt = findAccount(ano);

		int balance = accnt.getBalance();

		accnt.setBalance(balance + amount);

	}

	static void Withdrawal() {

		System.out.println("조회 할 계좌 입력:");

		String ano = sc.nextLine();

		System.out.println("출금 할 금액 입력:");

		int amount = sc.nextInt();

		Swimming accnt = findAccount(ano);

		int balance = accnt.getBalance();

		accnt.setBalance(balance - amount);

	}

	static Swimming findAccount(String ano) {

		Swimming accnt = null;

		for (Swimming acnt : accountArray) { 

			if (acnt != null) {// null 여부를 체크.

				if (ano.contentEquals(acnt.getAno())) {
//if (ano.equals(acnt.getAno())){
					accnt = acnt;

					break;

				}

			}

		}

		return accnt;

	}

}
