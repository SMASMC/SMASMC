
public class IntString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1=123;
		String str1="12345";
		String str2="abcde";
		
		String str3=Integer.toString(num1);//숫자인것을 문자로 변경
		System.out.println(str2.concat(str3));//연결
		
		int num2=Integer.parseInt(str1);//문자였던것을 숫자로 변경
		System.out.println(num1+":num1 "+num2+":num2");
		
	}

}
