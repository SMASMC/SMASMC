import java.util.Scanner;

public class Exercise_13 {
//몇 개의 숫자를 입력한지 결정한 후 숫자를 입력하고 이중 필요없는 숫자의 위치를 정해 삭제
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int Num = 0;// 입력할 숫자의 갯수
		int NumCg = 0;// 바꿀 숫자 몇번째 수

		System.out.println("입력할 숫자의 갯수?: ");
		Num = scanner.nextInt();
		System.out.println(Num + "개의 숫자를 입력하세요!:");
		int[] Num2 = new int[Num];// 배열의 크기를 정의
		for (int i = 0; i < Num; i++) {
			System.out.println((i + 1) + "의 숫자: ");
			Num2[i] = scanner.nextInt();
		}
		System.out.println("몇번째의 숫자를 삭제 하시겠습니까?: ");
		NumCg = scanner.nextInt();
		System.out.println("-----결과-----");
		for (int j = 0; j < (Num - 1); j++) {
			if (j == NumCg - 1) {
				j = j + 1;
			}
			System.out.println(Num2[j]);
		}

		scanner.close();

	}

}
