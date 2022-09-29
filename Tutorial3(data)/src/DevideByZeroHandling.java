

public class DevideByZeroHandling {
	public static void main(String[]args) {
		String str = "1234ty556";String result = "숫자입니다."; 
		for(int i=0;i<str.length();i++){ 
			char c = str.charAt(i); 
			if(c<48 || c> 57){//숫자가 아닌 경우  
				result = "문자가 포함됨";  break; }}
		System.out.println(result);  
		System.out.println("=================");//Character의 isDigit()메서드 이용하기
		for(char c : str.toCharArray()){ 
			if(!Character.isDigit(c)){ //숫자가 아닐 경우 
			System.out.println(c);  
			result = "문자가 포함됨";  break; } 
			System.out.println(c);}
		System.out.println(result);
			}
		}
			

