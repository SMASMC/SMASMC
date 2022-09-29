
public class Korean {

	String nation = "대한민국";
	String name;
	String phone;
//	Korean kor=new Korean("홍길동","010-1111-2222");
	public Korean(String name, String phone) {
		super();
		this.name = name;
		this.phone = phone;
		printName2();
	}

	public void printName(String string, String string2) {
		System.out.println("Nation: " + nation);
		System.out.println("Name: " + string);
		System.out.println("Phone: " + string2);
	}
	public void printName2() {
		System.out.println("Nation: " + nation);
		System.out.println("Name: " + name);
		System.out.println("Phone: " + phone);
	}

}
