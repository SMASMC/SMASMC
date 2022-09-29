
public class StringBuilder_01 {
	public static void main(String[]agr) {
		
		StringBuilder stringBuilder=new StringBuilder("abcdefg");
		StringBuffer stringBuffer=new StringBuffer("abcdefg");
		
		System.out.println(stringBuilder);
		stringBuilder.append("hijklmn");//붙이는 기능으로 사용
		System.out.println(stringBuilder);
		stringBuilder.insert(3, "zzz");//삽입 3번째 자리 이후로 삽입되고 뒤로 나머지를 이어감.
		System.out.println(stringBuilder);
		stringBuilder.delete(3,5);//해당 범위만 삭제를 해준다.
		System.out.println(stringBuilder);
		
		
		System.out.println(stringBuffer);
		
		
	}
}
