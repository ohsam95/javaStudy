package ch05;

class Car {
	void run() {
		System.out.println("기본 움직임");
	}
}

class Sonata extends Car {   
	@Override// 지워도 됨  //오버라이드 - 무효화시키다 (Car클래스의 run메소드를 무효화하겟다) // 실행 시에 무시
	void run() {		
		  //super - 부모의 힙 공간   //this - 자기자신의 힙 공간
		System.out.println("소나타만의 움직임");
	}
}
public class CarEx01 {

	public static void main(String[] args) {
		Car s1 = new Sonata();  // -> 메모리에 두개 다 떳지만 Car를 바라보고있음
		s1.run();
	}
}
