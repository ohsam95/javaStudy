package ch05;
class A{
	void run() {
		System.out.println("A �޸���.");
	}
}
class B extends A{
	@Override
	void run() { //super�� ���������� �ƿ� �����Ǹ� �ϰڴ�!
		System.out.println("B �޸���");		
	}
}
class C extends B{
	String name = "C";
	@Override                                                
	void run() {
		System.out.println(name+" �޸���");  //�Լ��� ���� ���ٰ���
	}
}
public class OverrideEx01 {
	public static void main(String[] args) {
		A a1 = new A();  
		a1.run();     // AŬ������ �޸𸮿� �߱� ������ A �޸��� ���
 		A a2 = new C();
		a2.run();   // A���� C���� �޸𸮿� �߰� A�� run�޼��尡 �������̵� �Ǿ� C �޸��� ���
		
		B b1 = new B();
		b1.run();  //A , B Ŭ������ �޸𸮿� ���� AŬ������ run�� �������̵� �Ǿ� B �޸��� ���
		B b2 = new C();
		b2.run(); // A , B , C Ŭ������ �޸𸮿� ���� AŬ������ run �������̵� �ǰ� BŬ������ run �������̵�
                                      //�ᱹ CŬ������ run�� ��µȴ�.		
		C c1 = new C();
		c1.run();
	}
}
