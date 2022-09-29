
public class Constructor_02 {

	int Num1;
	int Num2;

	public Constructor_02(int num1, int num2) {
		super();
		Num1 = num1;
		Num2 = num2;
		sum(num1, num2);
	}

	public void sum(int Num1, int Num2) {

		int sum1 = Num1 + Num2;
		System.out.println("덧셈결과: " + sum1);
		Qoftpa(Num1, Num2);
	}

	public void Qoftpa(int Num1, int Num2) {
		int Qoftpa = Num1 - Num2;
		System.out.println("뺄셈 결과: " + Qoftpa);
		Gopp(Num1, Num2);

	}

	public void Gopp(int Num1, int Num2) {
		int Gopp = Num1 * Num2;
		System.out.println("곱셈 결과: " + Gopp);
		nanoot(Num1, Num2);
	}

	public void nanoot(int num1, int num2) {
		double nanoot = ((double) num1 / num2);
		System.out.println("나눗셈 결과: " + nanoot);
		namugee(num1, num2);
	}

	public void namugee(int num1, int num2) {
		int namugee = (num1 % num2);
		System.out.println("나머지 결과: " + namugee);
	}
}
