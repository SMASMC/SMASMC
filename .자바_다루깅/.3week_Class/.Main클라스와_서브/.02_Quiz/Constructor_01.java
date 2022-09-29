import java.util.Scanner;

public class Constructor_01 {

	Scanner scanner = new Scanner(System.in);
	int Num1;
	int Num2;

//	public void Const() {
//		System.out.print("첫번째 숫자를 입력하세요.:");
//		this.Num1 = scanner.nextInt();
//		System.out.print("두번째 숫자를 입력하세요.:");
//		this.Num2 = scanner.nextInt();
//		sum(Num1, Num2);
//	}
	public Constructor_01(int num1, int num2) {
		super();
		System.out.print("첫번째 숫자를 입력하세요.:");
		this.Num1 = scanner.nextInt();
		System.out.print("두번째 숫자를 입력하세요.:");
		this.Num2 = scanner.nextInt();
		Constructor_02 const2 = new Constructor_02(Num1, Num2);
	}

}
