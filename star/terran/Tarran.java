package star.terran;

import star.Behavior;

public abstract class Tarran implements Behavior {
	public void move() {
		System.out.println("이동");
	}
	public void repair() {
		System.out.println("SCV 치료");
	}
//	public abstract void attack();    나중에!
	
	public static void upgrade() {  // 어택 객체가 없어도 업그레이드는 가능하기 때문에 스테이틱으로!
 		Marine.attack++;
 		Tank.attack++;
	}
}
