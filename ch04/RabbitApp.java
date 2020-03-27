package ch04;

class Rabbit{    
 	private String name; //heap변수 , 전역변수 , 멤버변수 , 필드 , 속성 , 프로퍼티
	private int power;       //값을 안정해주는 이유 : 다양한 인스턴스를 만들어 줄수 있기 때문     

	public Rabbit(String name, int power) {
		this.name = name;
		this.power = power;
	}
	//행동(책임)
	boolean drink() {
		// 100이 넘어가면 동작하지 않도록!
			if(power == 100) {
				return false;
			}
			power++;
			return true;
	}
	
	public int getPower() {
		return power;
	}
	
	
	void setName(String name) {
		this.name=name;
	}
	
	public String getName() {
		return name;
	}
	
}

public class RabbitApp {

	public static void main(String[] args) {
		Rabbit r1 = new Rabbit("토끼",20); //100이 맥스
			while(r1.drink()) {}
			System.out.println(r1.getPower());
		
		// 이름 변경
	r1.setName("산토끼");
	System.out.println(r1.getName());
	}
}

