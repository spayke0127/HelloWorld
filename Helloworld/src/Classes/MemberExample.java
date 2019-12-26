package Classes;

import java.util.Scanner;

public class MemberExample { // 퍼블릭이 접근성
	 Member[] memberAry = new Member[3]; // 메인메소드가 호출되다 사라지기때문에 자리위치선정 잘해야함.
	 Scanner sc = new Scanner(System.in);

	public void main(String args[]) { // static 고정되었다 라는 표시,즉 클래스에
execute();
	}
		public  void execute() {
		int cnt = 0;
		int menu = 0;
		while (true) { // 반복하고싶을떄 와일을 기입
			System.out.println("=========");
			System.out.println("1.생성 2.조회 3.리스트 4종료");
			System.out.println("=========");
			System.out.println("선택>2Enter");
			menu = sc.nextInt();
			sc.nextLine();

			if (menu == 1) {
				createMember();
			} else if (menu == 2) {
				searchMember();
			} else if (menu == 3) {
				listMember();
			} else if (menu == 4) {
				break;
			}
		}
		System.out.println("프로그램 종료.");
	}

	public  void listMember() {
		for (int i = 0; i < memberAry.length; i++) {
			if (memberAry[i] != null) { //( !낌표 의미 널이 아닌경우에만 실행하세요 )
				System.out.println(memberAry[i]);
			}
		}
	}

	public  void searchMember() {
		System.out.print("id입력하세요.");

		String inputId = sc.nextLine();
		System.out.print("pw입력하세요.");
		String inputPw = sc.nextLine();

		for (Member mem : memberAry) {
			if (mem != null) {
				//id 1) pw 1) 2) 2)
				if (inputId.equals(mem.getId()) && inputPw.equals(mem.getPassword())) {
					 // id, pw ====> ok
					System.out.println(mem);
				} else if 
					// id(o), pw(x) => "비밀번호가 틀립니다.'
					// id(x), pw(x) => "없는 id입니다.'
			}
		}
	}

	public  void createMember() {
		Member mem = new Member();
		System.out.println("이름을 입력:");
		String name = sc.nextLine();
		mem.setName(name);
		System.out.println("id를 입력:");
		String id = sc.nextLine();
		mem.setId(id);
		System.out.println("pw를 입력:"); // 할게많아서 일단 지운상태
		String password = sc.nextLine();
		mem.setPassword(password);
		System.out.println("age를 입력:");
		int age = sc.nextInt();
		mem.setAge(age);

		for (int i = 0; i < memberAry.length; i++) {
			if (memberAry[i] == null) {
				memberAry[i] = mem;
				break;
			}
		}
	}
}
