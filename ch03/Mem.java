package ch03;

public class Mem {
	
	int num = 10;
	static String name ="ȫ�浿";
	
	void test() { // {}���δ� ȣ�� ������ �޸𸮿� �� �� , heap�� ����
		int num = 5;       //������ �ٸ�	
	} // {}���� stack�̶��� , �߰�ȣ�� ������ stack������ �޸𸮿��� ���� (�������� ������ �Ҹ�)
	       // stack������ ����������
	public static void main(String[] args) {
		int sum = 100;
		System.out.println("sum = "+sum);
		Mem m = new Mem();  //heap ���� - ��� �޸𸮿� �� ���� (��������)
		m.test();
		System.out.println("��ȣ = "+m.num); // ��ǻ�Ͱ� �� ���� ���̻� heap������ �������� �ʴٴ� ���� �˾Ƽ�
		System.out.println(1);                                        //heap ������ �޸𸮿��� ����
		System.out.println(2);
		System.out.println("���α׷� ����");
	} //static ���� ����
}
