package star.zerg;

import star.Behavior;

public class Ultra extends Zerg {
	private String name;
	private int hp;
	public static int attack = 50;
		
	public	Ultra(String name) {
		this.name = name;
		this.hp = 100;
	}

	@Override
	public void attack(Behavior unit) {
		System.out.println("울트라가 때리고 있음");
		
	}
}

