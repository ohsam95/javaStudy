package ch05;

class 사람 {
	int num = 10;
}
class 아시아인 extends 사람{
	int num = 30;
}
class 한국인 extends 아시아인{
	
}																				//extends는 확장하다!
class 박서준 extends 한국인{                                 //이렇게 짜야 상속이 가능 - 박서준은 위의 클래스를 상속받음
	int num = 20;
}
public class EveryPerson {
	public static void main(String[] args) {
		박서준 b1 = new 박서준();   // new하면 heap공간에 박서준, 한국인 , 아시아인 , 사람이 뜸!
		System.out.println(b1.num);// 사람 클래스가 num = 10을 가지고 있는데 b1도 num=10을 가지게 됨
	
		한국인 b2 = new 박서준(); // 타입을 바꿧지만 박서준 위로 다 뜨게 가능
		System.out.println(b2.num);
		
		박서준 downB2 = (박서준) b2;
		System.out.println(downB2.num); // 다운캐스팅 가능
		
		사람 b3 = new 한국인();  // 메모리에 사람을 띄우지만 한국인클래스 부터 스캔가능
		System.out.println(b3.num);
		
	//	박서준 b4 = new 한국인();  // 박서준클래스는 메모리에 없어서 오류남!
		
	}
}
