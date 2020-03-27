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
	final String NAME;    //final은 변하지 않는 상수에 지정 (대문자로 지정!)
	int hp;
	static int attack=10;   // 생성 전에도 공격력을 업그레이드 할 수 있기 때문에 static으로 `

	public Zealot(String name) {
		this.NAME = name;
		this.hp = 100; //태어날 때부터 100이기 때문에(hp는 깎이는 변수)
			}
}
class Dragoon{
	final String NAME;
	int hp;
	static int attack=15; // 밑에서 공격력을 초기화 해주면 계속 초기화가 되서 안됨
	
	public Dragoon(String name) {
		this.NAME = name;
		this.hp = 100;  
			}
}
public class GameStart {
	
	//질럿이 드라군을 때릴꺼임
	static void attack(Zealot u1, Dragoon u2) {                 //오버로딩-함수의 매개변수가 달라 다른 함수로 인식
		u2.hp=u2.hp-u1.attack;
		System.out.println(u2.NAME+"이 공격 당하고 있습니다.");
		System.out.println(u2.NAME+"의 체력은 "+u2.hp+"입니다.");
	}
	static void attack(Dragoon u1, Zealot u2) {
		u2.hp=u2.hp-u1.attack;
		System.out.println(u2.NAME+"이 공격 당하고 있습니다.");
		System.out.println(u2.NAME+"의 체력은 "+u2.hp+"입니다.");
	}
	static void attack(Zealot u1, Zealot u2) {
		u2.hp=u2.hp-u1.attack;
		System.out.println(u2.NAME+"이 공격 당하고 있습니다.");
		System.out.println(u2.NAME+"의 체력은 "+u2.hp+"입니다.");
	}
	static void attack(Dragoon u1, Dragoon u2) {
		u2.hp=u2.hp-u1.attack;
		System.out.println(u2.NAME+"이 공격 당하고 있습니다.");
		System.out.println(u2.NAME+"의 체력은 "+u2.hp+"입니다.");
	}
	static void attack(DarkTempler u1, Dragoon u2) {
		u2.hp=u2.hp-u1.attack;
		System.out.println(u2.NAME+"이 공격 당하고 있습니다.");
		System.out.println(u2.NAME+"의 체력은 "+u2.hp+"입니다.");
	}
	static void attack(Dragoon u1, DarkTempler u2) {
		u2.hp=u2.hp-u1.attack;
		System.out.println(u2.NAME+"이 공격 당하고 있습니다.");
		System.out.println(u2.NAME+"의 체력은 "+u2.hp+"입니다.");
	}
	static void attack(DarkTempler u1, Zealot u2) {
		u2.hp=u2.hp-u1.attack;
		System.out.println(u2.NAME+"이 공격 당하고 있습니다.");
		System.out.println(u2.NAME+"의 체력은 "+u2.hp+"입니다.");
	}
	static void attack(Zealot u1, DarkTempler u2) {
		u2.hp=u2.hp-u1.attack;
		System.out.println(u2.NAME+"이 공격 당하고 있습니다.");
		System.out.println(u2.NAME+"의 체력은 "+u2.hp+"입니다.");
	}
	static void attack(DarkTempler u1, DarkTempler u2) {
		u2.hp=u2.hp-u1.attack;
		System.out.println(u2.NAME+"이 공격 당하고 있습니다.");
		System.out.println(u2.NAME+"의 체력은 "+u2.hp+"입니다.");
	}
	static void attack(DarkTempler u1, River u2) {
		u2.hp=u2.hp-u1.attack;
		System.out.println(u2.NAME+"이 공격 당하고 있습니다.");
		System.out.println(u2.NAME+"의 체력은 "+u2.hp+"입니다.");
	}
	static void attack(River u1, DarkTempler u2) {
		u2.hp=u2.hp-u1.attack;
		System.out.println(u2.NAME+"이 공격 당하고 있습니다.");
		System.out.println(u2.NAME+"의 체력은 "+u2.hp+"입니다.");
	}
	static void attack(River u1, Dragoon u2) {
		u2.hp=u2.hp-u1.attack;
		System.out.println(u2.NAME+"이 공격 당하고 있습니다.");
		System.out.println(u2.NAME+"의 체력은 "+u2.hp+"입니다.");
	}
	static void attack(Dragoon u1, River u2) {
		u2.hp=u2.hp-u1.attack;
		System.out.println(u2.NAME+"이 공격 당하고 있습니다.");
		System.out.println(u2.NAME+"의 체력은 "+u2.hp+"입니다.");
	}
	static void attack(River u1, Zealot u2) {
		u2.hp=u2.hp-u1.attack;
		System.out.println(u2.NAME+"이 공격 당하고 있습니다.");
		System.out.println(u2.NAME+"의 체력은 "+u2.hp+"입니다.");
	}
	static void attack(Zealot u1, River u2) {
		u2.hp=u2.hp-u1.attack;
		System.out.println(u2.NAME+"이 공격 당하고 있습니다.");
		System.out.println(u2.NAME+"의 체력은 "+u2.hp+"입니다.");
	}
	static void attack(River u1, River u2) {
		u2.hp=u2.hp-u1.attack;
		System.out.println(u2.NAME+"이 공격 당하고 있습니다.");
		System.out.println(u2.NAME+"의 체력은 "+u2.hp+"입니다.");
	}	
	
	public static void main(String[] args) {
		// 공격력 업그레이드 하기
		Zealot.attack++;
		//질럿 생성하기
		Zealot z1 = new Zealot("1번 질럿");
		System.out.println(Zealot.attack);
		
		Zealot z2 = new Zealot("2번 질럿");
		System.out.println(z2.attack);
		
		Dragoon d1 = new Dragoon("1번 드라군");
		System.out.println(Dragoon.attack);

		Dragoon d2 = new Dragoon("2번 드라군");
		System.out.println(Dragoon.attack);
		
		Dragoon t1 = new Dragoon("1번 다크템플러");
		System.out.println(Dragoon.attack);
		
		Dragoon t2 = new Dragoon("2번 다크템플러");
		System.out.println(Dragoon.attack);
		
		Dragoon r1 = new Dragoon("1번 리버");
		System.out.println(Dragoon.attack);
		
		Dragoon r2 = new Dragoon("2번 리버");
		System.out.println(Dragoon.attack);
		
		//공격하기
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




