
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Car car1=new Car();
		
		System.out.println("제작회사: "+car1.company);
		System.out.println("제작회사: "+car1.model);
		System.out.println("제작회사: "+car1.color);
		System.out.println("최고속도: "+car1.maxSpeed);
		car1.speed=60;
		System.out.println("현재속도: "+car1.speed);
		
		Car myCar=new Car();//변수를 다시 만든다면 값이 다른 클래스의 메소드 값을 가져온다.
		System.out.println("my car의 속도: "+myCar.speed);
		
		System.out.println(car1==myCar);
		
	}

}
