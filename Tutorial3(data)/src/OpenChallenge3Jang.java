import java.util.Scanner;
import java.util.Random;

public class OpenChallenge3Jang {
	public static void main(String[]args) {
		Scanner scanner =new Scanner(System.in);
		Random r=new Random();
		int Random=r.nextInt(100);

		
		int Num;//입력 받을 숫자

		
		while(true) {
			
			System.out.print("숫자를 입력하세요.:");
			Num=scanner.nextInt();
			if(Num==Random) {
				System.out.print("정답입니다. 게임을 더 하시겠나요?: y/n");
				String text=scanner.next();
				if(text.equals("y")) {
					continue;
				}
				else if(text.equals("n")){
					break;
					
				}
			}
			else if(Num<Random) {
				System.out.println("오답입니다. 정답보다 작습니다.");
			}
			else {
				System.out.println("오답입니다. 정답보다 큽니다.");
			}
		}
	}
}
