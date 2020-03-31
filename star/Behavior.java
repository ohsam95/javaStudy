package star;

//추상클래스와 유사
//추상 메서드만 존재가능 (몸체가 있는 메서드는 못 가짐) -> 동적 바인딩의 통로로 쓰임
public interface Behavior { 
	public abstract void move(); //abstract 생략가능 , public 생략가능
	void repair();
	void attack(Behavior unit); 
	//스테이틱은 지움!
}
