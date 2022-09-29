import java.util.Scanner;

public class Exercise_09JY {

	public static void main(String[] args) {
		// 학생수가 4명이고 과목이 3과목일 경우의 점수 합계와 평균 구하기 기능 추가

		String[] mock = { "Korean", "English", "Mathematics" };
		String[] Num = { "No1", "No2", "No3", "No4" };

		int[][] grade = new int[Num.length][mock.length];// [4][3]
		// [행][열]
		// 4개를 입력받고 이걸 3줄로 뽑아야 함.

//				1 [0][0]
//				1 [1][0]
//				1 [2][0]
//				1 [3][0]
//				2 [0][1]
//				2 [1][1]
//				2 [2][1]
//				2 [3][1]
//				3 [0][2]
//				3 [1][2]
//				3 [2][2]
//				3 [3][2]
		int tot = 0;
		int AVG = 0;
		// grade[j][i] = scanner.nextInt();//4번 입력하고 다음줄로[0][0],[0][1],[0][2],[0][3]
		//[0][0][0][1]
		Scanner scanner = new Scanner(System.in);

		for (int i = 0; i < mock.length; i++) {
			System.out.println(mock[i] + "의 점수를 입력하세요.:");
			for (int j = 0; j < Num.length; j++) {
				System.out.print(Num[j]);
				grade[j][i] = scanner.nextInt();//[0][0]자리에 1을 입력하면 1을 저장->[1][0]자리에 2를 입력하면 2저장 [0][1]자리에 3을 입력하면 3저장
			}
		}
		System.out.println("\t Korean\tEnglish\t Mathematics \t Total \t Average");
		for (int j = 0; j < Num.length; j++) {
			tot=grade[j][0]+grade[j][1]+grade[j][2];
			AVG=(tot/3);
				System.out.println(Num[j] + "\t" + grade[j][0] + "\t" + grade[j][1] + "\t" + grade[j][2] + "\t" + tot + "\t" + AVG);
				
		}
		scanner.close();
	}

}
