package Classes;
//217p
public class CalculatorExample {
 public static void main(String[] args) {
	Calculator cal = new Calculator();
	cal.execute();

 double avg = cal.avg(30, 50);
 cal.println("두수의 결과값은 " + avg );
 
 }
}
