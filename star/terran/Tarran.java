package star.terran;

import star.Behavior;

public abstract class Tarran implements Behavior {
	public void move() {
		System.out.println("�̵�");
	}
	public void repair() {
		System.out.println("SCV ġ��");
	}
//	public abstract void attack();    ���߿�!
	
	public static void upgrade() {  // ���� ��ü�� ��� ���׷��̵�� �����ϱ� ������ ������ƽ����!
 		Marine.attack++;
 		Tank.attack++;
	}
}
