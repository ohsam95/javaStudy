package star.terran;

import star.Behavior;

public class Tank extends Tarran {
	private String name;
	private int hp;
	public static int attack = 30;
		
	public Tank(String name) {
		this.name = name;
		this.hp = 100;
	}

	@Override
	public void attack(Behavior unit) {
		System.out.println("탱크가 공격함");
		
	}
}

