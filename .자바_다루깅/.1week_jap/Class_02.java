import java.util.Scanner;

public class Class_02 {
    
    public static void main(String[] args) {
		//사용자에게 시작값과 끝값을 입력 받아 합계 구하기
		
		//선언부
		
		Scanner scanner =new Scanner(System.in);
		int startNum=0;//시작 값
		int endNum=0;//끝 값
		int sum=0;//합계
		int oddSum=0;//홀수
		int evenSum=0;//짝수
		
		System.out.print("시작 값을 입력하세요.:");
		startNum=scanner.nextInt();
		
		System.out.println("끝 값을 입력하세요.:");
		endNum=scanner.nextInt();
		
		for(int i=startNum;i<=endNum;i++) {
			sum+=i;
			if(i%2==0) {
				evenSum+=i;
			}
			else {
				oddSum+=i;
			}
			
		}
		
		System.out.println("합계는"+sum+"입니다.");
		System.out.println("짝수의 합계는"+evenSum+"입니다.");
		System.out.println("홀수의 합계는"+oddSum+"입니다.");
		
		scanner.close();
		
		
		
	}

}
