package star.protoss;

import star.Behavior;

public abstract class Protoss implements Behavior {
	@Override
	public void move() {
		System.out.println("�̵�");
	}
	@Override
	public void repair() {
		System.out.println("���� ġ��");
	}
//	public abstract void attack();    ���������� �ʾƼ� ���⼭ ���� X �� ������!
	
	public static void upgrade() {  // ���� ��ü�� ��� ���׷��̵�� �����ϱ� ������ ������ƽ����!
 		Zealot.attack++;
 		Dragoon.attack++;
 		System.out.println("�����佺 ���׷��̵� �Ϸ�");
	}
}
