import java.util.Scanner;

public class Exercise_10 {

	public static void main(String[] args) {
		int[] grade = new int[10];
		int num = 0;

		Scanner scanner = new Scanner(System.in);
		System.out.println("점수를 입력하세요.:");

		for (int i = 0; i < grade.length; i++) {
			System.out.print((i + 1) + "의 score:");
			num = scanner.nextInt();
			grade[num / 10]++;// 10으로 나눴을 때 몫으로 나온 값의 자리에 +1을 해줘서 그 자리에 값을 만들어준다.
			// grade[num/10]=grade[num/10]+1;

		}
		for (int j = grade.length-1; j >= 0; j--) {// 배열의 크기는 10이지만 10의 자리에는 9이기 때문에 j=9로 작성
			System.out.print(j*10+": ");
			{
				for (int h = 0; h < grade[j]; h++) {
					System.out.print("#");
				}
				System.out.println();
			}
		}
		scanner.close();
	}
}