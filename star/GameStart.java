package star;


// DarkTempler (50) , River (70)

class DarkTempler {
	final String NAME;
	int hp;
	static int attack = 50;
	
	public DarkTempler(String name, int hp) {
		this.NAME = name;
		this.hp = hp;
	}
	
}

class River {
	final String NAME;
	int hp;
	static int attack = 70;
	
	public River(String name, int hp) {
		this.NAME = name;
		this.hp = hp;
	}
	
}

class Zealot {
	final String NAME;    //final�� ������ �ʴ� ����� ���� (�빮�ڷ� ����!)
	int hp;
	static int attack=10;   // ���� ������ ���ݷ��� ���׷��̵� �� �� �ֱ� ������ static���� `

	public Zealot(String name) {
		this.NAME = name;
		this.hp = 100; //�¾ ������ 100�̱� ������(hp�� ���̴� ����)
			}
}
class Dragoon{
	final String NAME;
	int hp;
	static int attack=15; // �ؿ��� ���ݷ��� �ʱ�ȭ ���ָ� ��� �ʱ�ȭ�� �Ǽ� �ȵ�
	
	public Dragoon(String name) {
		this.NAME = name;
		this.hp = 100;  
			}
}
public class GameStart {
	
	//������ ����� ��������
	static void attack(Zealot u1, Dragoon u2) {                 //�����ε�-�Լ��� �Ű������� �޶� �ٸ� �Լ��� �ν�
		u2.hp=u2.hp-u1.attack;
		System.out.println(u2.NAME+"�� ���� ���ϰ� �ֽ��ϴ�.");
		System.out.println(u2.NAME+"�� ü���� "+u2.hp+"�Դϴ�.");
	}
	static void attack(Dragoon u1, Zealot u2) {
		u2.hp=u2.hp-u1.attack;
		System.out.println(u2.NAME+"�� ���� ���ϰ� �ֽ��ϴ�.");
		System.out.println(u2.NAME+"�� ü���� "+u2.hp+"�Դϴ�.");
	}
	static void attack(Zealot u1, Zealot u2) {
		u2.hp=u2.hp-u1.attack;
		System.out.println(u2.NAME+"�� ���� ���ϰ� �ֽ��ϴ�.");
		System.out.println(u2.NAME+"�� ü���� "+u2.hp+"�Դϴ�.");
	}
	static void attack(Dragoon u1, Dragoon u2) {
		u2.hp=u2.hp-u1.attack;
		System.out.println(u2.NAME+"�� ���� ���ϰ� �ֽ��ϴ�.");
		System.out.println(u2.NAME+"�� ü���� "+u2.hp+"�Դϴ�.");
	}
	static void attack(DarkTempler u1, Dragoon u2) {
		u2.hp=u2.hp-u1.attack;
		System.out.println(u2.NAME+"�� ���� ���ϰ� �ֽ��ϴ�.");
		System.out.println(u2.NAME+"�� ü���� "+u2.hp+"�Դϴ�.");
	}
	static void attack(Dragoon u1, DarkTempler u2) {
		u2.hp=u2.hp-u1.attack;
		System.out.println(u2.NAME+"�� ���� ���ϰ� �ֽ��ϴ�.");
		System.out.println(u2.NAME+"�� ü���� "+u2.hp+"�Դϴ�.");
	}
	static void attack(DarkTempler u1, Zealot u2) {
		u2.hp=u2.hp-u1.attack;
		System.out.println(u2.NAME+"�� ���� ���ϰ� �ֽ��ϴ�.");
		System.out.println(u2.NAME+"�� ü���� "+u2.hp+"�Դϴ�.");
	}
	static void attack(Zealot u1, DarkTempler u2) {
		u2.hp=u2.hp-u1.attack;
		System.out.println(u2.NAME+"�� ���� ���ϰ� �ֽ��ϴ�.");
		System.out.println(u2.NAME+"�� ü���� "+u2.hp+"�Դϴ�.");
	}
	static void attack(DarkTempler u1, DarkTempler u2) {
		u2.hp=u2.hp-u1.attack;
		System.out.println(u2.NAME+"�� ���� ���ϰ� �ֽ��ϴ�.");
		System.out.println(u2.NAME+"�� ü���� "+u2.hp+"�Դϴ�.");
	}
	static void attack(DarkTempler u1, River u2) {
		u2.hp=u2.hp-u1.attack;
		System.out.println(u2.NAME+"�� ���� ���ϰ� �ֽ��ϴ�.");
		System.out.println(u2.NAME+"�� ü���� "+u2.hp+"�Դϴ�.");
	}
	static void attack(River u1, DarkTempler u2) {
		u2.hp=u2.hp-u1.attack;
		System.out.println(u2.NAME+"�� ���� ���ϰ� �ֽ��ϴ�.");
		System.out.println(u2.NAME+"�� ü���� "+u2.hp+"�Դϴ�.");
	}
	static void attack(River u1, Dragoon u2) {
		u2.hp=u2.hp-u1.attack;
		System.out.println(u2.NAME+"�� ���� ���ϰ� �ֽ��ϴ�.");
		System.out.println(u2.NAME+"�� ü���� "+u2.hp+"�Դϴ�.");
	}
	static void attack(Dragoon u1, River u2) {
		u2.hp=u2.hp-u1.attack;
		System.out.println(u2.NAME+"�� ���� ���ϰ� �ֽ��ϴ�.");
		System.out.println(u2.NAME+"�� ü���� "+u2.hp+"�Դϴ�.");
	}
	static void attack(River u1, Zealot u2) {
		u2.hp=u2.hp-u1.attack;
		System.out.println(u2.NAME+"�� ���� ���ϰ� �ֽ��ϴ�.");
		System.out.println(u2.NAME+"�� ü���� "+u2.hp+"�Դϴ�.");
	}
	static void attack(Zealot u1, River u2) {
		u2.hp=u2.hp-u1.attack;
		System.out.println(u2.NAME+"�� ���� ���ϰ� �ֽ��ϴ�.");
		System.out.println(u2.NAME+"�� ü���� "+u2.hp+"�Դϴ�.");
	}
	static void attack(River u1, River u2) {
		u2.hp=u2.hp-u1.attack;
		System.out.println(u2.NAME+"�� ���� ���ϰ� �ֽ��ϴ�.");
		System.out.println(u2.NAME+"�� ü���� "+u2.hp+"�Դϴ�.");
	}	
	
	public static void main(String[] args) {
		// ���ݷ� ���׷��̵� �ϱ�
		Zealot.attack++;
		//���� �����ϱ�
		Zealot z1 = new Zealot("1�� ����");
		System.out.println(Zealot.attack);
		
		Zealot z2 = new Zealot("2�� ����");
		System.out.println(z2.attack);
		
		Dragoon d1 = new Dragoon("1�� ���");
		System.out.println(Dragoon.attack);

		Dragoon d2 = new Dragoon("2�� ���");
		System.out.println(Dragoon.attack);
		
		Dragoon t1 = new Dragoon("1�� ��ũ���÷�");
		System.out.println(Dragoon.attack);
		
		Dragoon t2 = new Dragoon("2�� ��ũ���÷�");
		System.out.println(Dragoon.attack);
		
		Dragoon r1 = new Dragoon("1�� ����");
		System.out.println(Dragoon.attack);
		
		Dragoon r2 = new Dragoon("2�� ����");
		System.out.println(Dragoon.attack);
		
		//�����ϱ�
		attack(z1,d1);
		attack(z1,r1);
		attack(z1,t1);
		attack(z1,z2);
		attack(d1,z2);
		attack(d1,d2);
		attack(d1,t2);
		attack(d1,r2);
		attack(t1,z2);
		attack(t1,d2);
		attack(t1,t2);
		attack(t1,r2);
		attack(r1,z2);
		attack(r1,d2);
		attack(r1,t2);
		attack(r1,r2);
		attack(r2,r1);
		
		
	}
}




