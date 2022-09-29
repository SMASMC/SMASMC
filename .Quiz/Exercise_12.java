import java.util.Scanner;

public class Exercise_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 몇 개의 숫자를 입력할지 결정한 후 숫자를 입력하고 입력된 위치에 새로운 숫자를 삽입
		int inPut = 0;
		int Num2 = 0;
		int wechi = 0;

		Scanner scanner = new Scanner(System.in);
		System.out.println("입력할 숫자의 갯수?: ");
		inPut = scanner.nextInt();
		int[] Num = new int[inPut];
		System.out.println(inPut + "개의 숫자를 입력하세요!: ");
		for (int i = 0; i < inPut; i++) {
			System.out.println((i + 1) + "의 숫자:");
			Num[i] = scanner.nextInt();
		}
		System.out.println("숫자를 삽입하고자 하는 위치는?: ");
		Num2 = scanner.nextInt();
		System.out.println("삽입하고자 하는 수는?: ");
		wechi = scanner.nextInt();
		for (int j = 0; j <= (Num2); j++) {
			if (j == Num2) {
				Num[Num2 - 1] = wechi;
				System.out.println("바뀌었어요!!");
				break;
			}
		}
		for (int z = 0; z < inPut; z++) {
			System.out.println(Num[z]);
		}
		// 일단 if문으로 해당 배열의 수를 변경해주고
		// for문으로 배열을 다 뽑아주면 끝
		// 원래의 숫자=삽입하고자하는 숫자(오른쪽에서 왼쪽 기억)
		scanner.close();
	}
}
