package Classes;

import java.util.Scanner;

public class FriendExe {

	private static Friend[] accountArray = new Friend[100];

	private static Scanner sc = new Scanner(System.in);

public static void main(String[] args) {

	boolean run = true;

	while (run) {

		System.out.println("==============================");

		System.out.println("1.입력 | 2.조회 | 3.리스트  | 4.종료 ");

		System.out.println("==============================");

		System.out.println("선택> ");

		int selectNo1 = sc.nextInt();

		sc.nextLine();
		
		
		if (selectNo1 == 1)
		System.out.println("==============================");

			System.out.println("1.대학교동창 | 2.회사동료 | 3. 그외 ");

			System.out.println("==============================");

			System.out.println("선택> ");

			int selectNo2 = sc.nextInt();

			sc.nextLine();
				if (selectNo1 == 1) {//입력

						createUnivFriend();

					} else if (selectNo2 == 2) {// 조회
						accountList();

					} else if (selectNo3 == 3) {// 리스트

						deposit();

					} else if (selectNo4 == 4) {// 종료

						run = false;

		}

	}

	System.out.println("프로그램 종료.");

}

	static void createUnivFriend() {

		System.out.println("학교 :");

		String ano = sc.nextLine();

		System.out.println("전공 :");

		String owner = sc.nextLine();

		System.out.println("이름 :");

		String balance = sc.nextLine();

		FriendUniv ufd = new FriendUniv(ano, owner, balance, "111");

		for (int i = 0; i < accountArray.length; i++) {

			if (accountArray[i] == null) {

				accountArray[i] = ufd;

				break;

			}

		}

	}

	static void accountList() {

		for (Friend acnt : accountArray) {

			if (acnt != null) {

				System.out.println(acnt);

			}

		}

	}

	static void deposit() {

		System.out.println("리스트 :");

		String ano = sc.nextLine();

		System.out.println("학교 전공 :");

		int amount = sc.nextInt();

		Account accnt = findAccount(ano);

		int balance = accnt.getBalance();// 현잔고

		accnt.setBalance(balance + amount);

	}

	static void withdraw() {

		System.out.println("리스트 : ");

		String ano = sc.nextLine();

		System.out.println("연락처 : ");

		int amount = sc.nextInt();

		Account accnt = findAccount(ano);

		int balance = accnt.getBalance();// 현잔고

		accnt.setBalance(balance - amount);

	}

	static Account findAccount(String ano) {

		Account accnt = null;

		for (Friend acnt : accountArray) {

			if (acnt != null) {// null 여부를 체크.

//			if (ano.contentEquals(acnt.getAno())) {
////if (ano.equals(acnt.getAno())){
//				accnt = acnt;
//
//				break;
//
//			}

			}

		}

		return accnt;

	}

}