
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 1;
		int s = 10;
		int Sum = 0;
		String Result = "";

		SumEvenOdd evenOdd = new SumEvenOdd();// 클래스 명을 선언
		//클래스명 변수명=new클래스명();
		SumCalc Sumodd = new SumCalc();
		//클래스명 변수명=new클래스명();
		
		Sum = Sumodd.Sumod(a, s);
		//변수=변수명.메소드명
		Result = evenOdd.evenOd(Sum);// return한 sum값을 받겠다.
		//변수=변수명.메소드명
		
		System.out.println(a + "~" + s + "의 합은 " + Sum + "입니다.");// 클래스를 가져온다.
		System.out.println(Result + "입니다.");

	}

}
//Property(전역변수):Fields
//Constructor:
//Method():