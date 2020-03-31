package star.protoss;

import star.Behavior;

public abstract class Protoss implements Behavior {
	@Override
	public void move() {
		System.out.println("이동");
	}
	@Override
	public void repair() {
		System.out.println("쉴드 치료");
	}
//	public abstract void attack();    공통적이지 않아서 여기서 구현 X 더 밑으로!
	
	public static void upgrade() {  // 어택 객체가 없어도 업그레이드는 가능하기 때문에 스테이틱으로!
 		Zealot.attack++;
 		Dragoon.attack++;
 		System.out.println("프로토스 업그레이드 완료");
	}
}
