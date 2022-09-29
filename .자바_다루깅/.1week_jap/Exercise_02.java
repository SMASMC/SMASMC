
public class Exercise_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 10의 10제곱승을 구하라
		double Num1 = 10;
		double Sum = 1;
		System.out.println("10^" + 0 + "=" + String.format("%14.0f",Sum));  
		for (int i = 1; i <= 10; i++) {
			if(i==10) {
				Sum = (Num1 * Sum);
				System.out.println("10^" + (i) + "=" + String.format("%13.0f",Sum));
				break;
			}
			Sum = (Num1 * Sum);
			System.out.println("10^" + (i) + "=" + String.format("%14.0f",Sum));
			
		}
	}
}