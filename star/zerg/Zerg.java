package star.zerg;

import star.Behavior;

public abstract class Zerg implements Behavior{
	public void move() {
		System.out.println("�̵�");
	}
	public void repair() {
		System.out.println("�ڿ� ġ��");
	}
//	public abstract void attack();    ���߿�!
	
	public static void upgrade() {  // ���� ��ü�� ��� ���׷��̵�� �����ϱ� ������ ������ƽ����!
 		Hydra.attack++;
 		Ultra.attack++;
	}
}
