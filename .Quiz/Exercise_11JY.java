import java.util.Scanner;

public class Exercise_11JY {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int Num = 0;
		int serch = 0;// 검색할 숫자
		int z = 0;

		// 몇개의 숫자를 입력할지 결정한 후 숫자를 입력하고 이중 검색을 원하는 숫자의 위치를 파악
		System.out.println("입력할 숫자의 갯수?: ");
		Num = scanner.nextInt();
		int []intNum = new int[Num];
		for (int i = 0; i < Num; i++) {
			
			System.out.println((i + 1) + "의 숫자: ");
			intNum[i] = scanner.nextInt();

		}
		System.out.println("검색할 숫자는?: ");
		serch = scanner.nextInt();
		for (int a = 0; a < Num; a++) {
			if (serch == intNum[a]) {
				z = a + 1;
			}
			
		}
		if (z!=0) {//이유는 z가 0이 아닐 경우에 위치를 뽑아줄 수 있도록 해주기 때문에 조건을 만족함.
			System.out.println(serch + "의 위치는 " + z + "번째 입니다.");
		}
		else {
			System.out.println(serch+"는 존재하지 않습니다.");
		}
		
		
		

		scanner.close();
	}
}
