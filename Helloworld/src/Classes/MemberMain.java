package Classes;
//멤버익잼플에서 멤버메인클래스로 실행시킬방법
public class MemberMain {
public static void main(String[] args) {
	MemberExample me = new MemberExample();
	me.execute(); //엑스큐트를 실행하기전 전클래스에 static을 지워야함
}
}
