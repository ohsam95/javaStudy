package ch05;

//추상클래스는 어댑터의 용도로 사용 가능하다.
abstract class 칼{
	abstract void kill();
	abstract void cook();
	abstract void repair();
}

abstract class 요리사어댑터 extends 칼{  //사용하지 않을 것을 여기에 구현해놓으면서 책임을 가지게 함 (걸러내는 것)
	void kill() {
	}
	void repair() {
	}
}

class 백종원 extends 요리사어댑터 {
	void cook() {
		
	}
	
}
public class FoodEx03 {

}
