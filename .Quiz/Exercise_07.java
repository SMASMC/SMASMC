import java.util.Scanner;

public class Exercise_07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//몇 단계의 피라미드로 구성할까?: 5
		int Num=0;
		int Num1=1;
		Scanner scanner =new Scanner(System.in);
		
		System.out.println("몇 단계의 피라미드로 구성할까?: ");
		Num=scanner.nextInt();
		for(int i=0;i<=Num;i++) {
			for(int j=0;j<i;j++) {
				System.out.print(Num1+" ");
				Num1++;
			}
			System.out.println();
		}
		
		
		scanner.close();
	}

}
