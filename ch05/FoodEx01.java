package ch05;

abstract class Food1{     //추상클래스는 new 할 수 없다. 오브젝트가 아니기 때문에!!
	abstract void eat();  //추상클래스는 추상 메서드를 가질 수 있다.
}

class 라면1 extends Food1 {
	final String NAME = "라면";   
	void eat() {
		System.out.println(NAME+"을 먹었습니다.");
		
	}
}

class 불고기1 extends Food1{
	final String NAME = "불고기";
	void eat() {
		System.out.println(NAME+"을 먹었습니다.");
	}
}

class 갈비1 extends Food1{
	final String NAME = "갈비";
	void eat() {
		System.out.println(NAME+"을 먹었습니다.");
	}
}

public class FoodEx01 {

		static void start(Food1 f) {
			f.eat();
		}
	
	public static void main(String[] args) {
		start(new 라면1());
		start(new 불고기1());
		start(new 갈비1());
		
	}
}
