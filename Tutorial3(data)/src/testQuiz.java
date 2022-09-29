
public class testQuiz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String str = "1234ty556";//받은 숫자와 문자
		 String result = "숫자입니다.";  
//		 for(int i=0;i<str.length();i++)
//		 { char c = str.charAt(i); 
//		 if(c<48 || c> 57){//숫자가 아닌 경우  
//		 result = "냥";
//		 break; }
//		 }
//		 System.out.println(result); 
		 System.out.println("=================");//Character의 isDigit()메서드 이용하기
		   for(char c : str.toCharArray()){ 
		   if(!Character.isDigit(c)){ //숫자가 아닐 경우 
//		System.out.println(c);  
		result = "양";  
		continue; } 
		System.out.println(c);}
//		System.out.println(result);
	}

}
