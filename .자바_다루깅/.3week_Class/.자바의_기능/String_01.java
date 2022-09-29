
public class String_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//API는 method를 불러서 가져온다.
		//배열 느낌임.
		
		String str1="abcdefg";
		String str2="HIJKLMN";
		String str4="	abc	def	ghi	";
		
		//abcde->a-0,b-1,c-2,d-3,e-4
		
		System.out.println(str1.concat(str2));//concat은 붙이기
		System.out.println(str1.substring(2));//substring(숫자) 숫자 보다 큰 순서에 들어가는 글자를 뽑아준다. INDEX번호로 들어감.
		System.out.println(str1.substring(2,5));//(숫자1,숫자2) 숫자2안에 들어가는 범위내로 숫자1을 빼고 글자를 뽑아준다.
		
		String abc=str1.substring(3,5);
		System.out.println(abc+" abc");
		
		System.out.println(str1.length());//배열 처럼 index크기를 뽑아줄 수 있다.
		System.out.println(str1.toUpperCase());//크기를 키워준 값.
		System.out.println(str1.toLowerCase());//크기를 줄인 값.
		
		System.out.println(str1.equals(str2));//이퀄,등호
		System.out.println(!str1.equals(str2));//NOT이퀄,등호
		
		System.out.println(str4.trim());//끝에 존재하는 공백을 지워준다. ID나 password를 입력할 때 앞 뒤 공백을 지워주기 위한 것.
		System.out.println(str4.length());
		System.out.println(str4.trim().length());
		
		System.out.println(str1.replace('a','z'));//('바뀔 글자','바꾼 글자')
		System.out.println(str1.replaceAll("abc","zzzzzzzz"));//위랑 비슷하나 글자수를 많이해서 그 글자수 빼고 바꾼 글자가 들어간다.
		System.out.println(str1.replaceAll("abc",""));//String은 메모리를 많이 잡아먹는다.
		
		
		
	}

}
