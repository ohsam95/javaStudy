package star.zerg;

import star.Behavior;

public abstract class Zerg implements Behavior{
	public void move() {
		System.out.println("이동");
	}
	public void repair() {
		System.out.println("자연 치료");
	}
//	public abstract void attack();    나중에!
	
	public static void upgrade() {  // 어택 객체가 없어도 업그레이드는 가능하기 때문에 스테이틱으로!
 		Hydra.attack++;
 		Ultra.attack++;
	}
}
