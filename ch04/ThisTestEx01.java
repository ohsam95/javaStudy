package ch04;

class AirPlane{
	String name;
	String color;
	
	public AirPlane(String name, String color) {
		this.name = name;
		this.color = color;   //this는 heap를 가리킴, 생성자의 내부는 new할 때 실행
	}
}


public class ThisTestEx01 {

	public static void main(String[] args) {
		AirPlane a1 = new AirPlane("제트기","하얀색");
	}
}
