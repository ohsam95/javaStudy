package star;

import star.protoss.Dragoon;
import star.protoss.Protoss;
import star.protoss.Zealot;
import star.zerg.Hydra;
import star.zerg.Ultra;

public class StartGame {
	
	public static void move(Behavior b) {
		b.move();
	}
	public static void repair(Behavior b) {
		b.repair();
	}
	public static void attack(Behavior b1,Behavior b2) {
		b1.attack(b2);
	}
	
	public static void main(String[] args) {
		Protoss.upgrade();  //스테이틱이라서 여기에 작성
		Zealot z1 = new Zealot("질럿1");
		Dragoon d1 = new Dragoon("드라군1");
		Ultra u1 = new Ultra("울트라1");
		Hydra h1 = new Hydra("히드라1");
		move(z1);
		repair(u1);
		attack(h1, d1);
		
		
		
		
	}
}
