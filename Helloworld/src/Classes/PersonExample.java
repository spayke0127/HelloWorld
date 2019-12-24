package Classes;

//배열&클래스 합쳐서 풀이해보기
public class PersonExample {
	public static void main(String[] args) {
		Person p1 = new Person();
		p1.name = "임치수";
		p1.birthday = "1988-01-27";
		p1.age = 20;

		Person p2 = new Person();
		p2.name = "이기민";
		p2.birthday = "1988-02-30";
		p2.age = 21;
		
		Person p3 = new Person();
		p3.name = "장현수";
		p3.birthday = "1988-01-26";
		p3.age = 22;
		
		Person[] pAry = new Person[3];
				pAry[0] = p1; 
				pAry[1] = p2;
				pAry[2] = p3;
		p1.introduce();
		p2.introduce();
		p3.introduce();
			

	}
}

//	교수님이 만드신
//	루트
//person p1 = new Person(" 임치수 ","880127-0000000")
//person p2 = new Person( " 임치수 ", "880127-0000000")
//person p3 = new Person( " 임치수 ", "880127-0000000")
//Person[] perAry = new Person[3];
//perAry[0]=p1;
//perAry[1]=p2;
//perAry[2]=p3;
//
//이라인에 스캐너라는것도 넣어보라고 수업진행하였음.

//for( int i = 0;i<3;i++)
//	{
//		perAry[i].introduce()
//}System.out.println("===========");
////확장 for 
//	for(
//	Person p:perAry)
//	{
//	 p.introduce();
//}