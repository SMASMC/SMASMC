import java.util.Scanner;

public class Exercise_14 {

	public static void main(String[] args) {
//고객의 입금, 출금 및 현황을 관리하는 Program을 작성
//단, 고객명은 1,2,3,4,5 이다.
		// 입력 4를하면 while문에서 빠져 나오도록 작성
		Scanner scanner = new Scanner(System.in);
		int inPut = 0;// 선택지 선택
		int Num = 0;// 고객번호
		int Sum = 0;
		int[] Bank = new int[5];// 고객 정보

		while (inPut != 4) {
			System.out.println("1.입금");// Bank[0]
			System.out.println("2.출금");// Bank[1]
			System.out.println("3.현황");// Bank[2]
			System.out.println("4.종료");// Bank[3]
			System.out.print("번호를 선택하세요!: ");
			inPut = scanner.nextInt();
			if (inPut == 4){
			System.out.println(">>>>Thank You<<<<");
			break;
			}
			else if (inPut == 3) {
				System.out.println("\t 고객명\t 잔액");
				System.out.println("\t ----\t ---");
				for(int i=0;i<Bank.length;i++) {
				System.out.println("\t "+(i+1)+"\t "+Bank[i]);
				}
				continue;
			}
			System.out.print("고객 번호: ");
			Num = scanner.nextInt();
			if (inPut == 1) {
				System.out.print("금액: ");
				Sum = scanner.nextInt();
				Bank[Num] += Sum;
				System.out.println("입금 되었습니다.: " + Bank[Num]);
			} else if (inPut == 2) {
				System.out.print("금액: ");
				Sum = scanner.nextInt();
				if(Sum>Bank[Num]) {
					System.out.println("잔액이 부족합니다!");
					break;
				}
				Bank[Num] -= Sum;
				System.out.println("출금 되었습니다.: " + Bank[Num]);
			} 

		}

		scanner.close();
	}

}
