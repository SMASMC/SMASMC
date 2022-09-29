import java.util.Scanner;

public class Exercise_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//입력한 한 자릿수 정수의 합을 구하는 프로그램을 작성하라.
		
		Scanner scanner =new Scanner(System.in);

		int sum=0;
		int Num2=0;
		int sum2=0;
		
		System.out.println("Enter an integer(0~9): ");
		sum=scanner.nextInt();
		while (sum!=0){
			Num2=(sum%10);
			sum=(sum/10);
			sum2+=Num2;
		}
		System.out.println("합계는 :"+sum2);
		scanner.close();
		}
}