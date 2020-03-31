package ch05;
class A{
	void run() {
		System.out.println("A 달린다.");
	}
}
class B extends A{
	@Override
	void run() { //super를 지워버리면 아예 재정의를 하겠다!
		System.out.println("B 달린다");		
	}
}
class C extends B{
	String name = "C";
	@Override                                                
	void run() {
		System.out.println(name+" 달린다");  //함수를 통해 접근가능
	}
}
public class OverrideEx01 {
	public static void main(String[] args) {
		A a1 = new A();  
		a1.run();     // A클래스만 메모리에 뜨기 때문에 A 달린다 출력
 		A a2 = new C();
		a2.run();   // A부터 C까지 메모리에 뜨고 A의 run메서드가 오버라이드 되어 C 달린다 출력
		
		B b1 = new B();
		b1.run();  //A , B 클래스만 메모리에 떠서 A클래스의 run만 오버라이드 되어 B 달린다 출력
		B b2 = new C();
		b2.run(); // A , B , C 클래스가 메모리에 떠서 A클래스의 run 오버라이드 되고 B클래스의 run 오버라이드
                                      //결국 C클래스의 run이 출력된다.		
		C c1 = new C();
		c1.run();
	}
}
