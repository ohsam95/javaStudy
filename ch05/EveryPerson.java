package ch05;

class ��� {
	int num = 10;
}
class �ƽþ��� extends ���{
	int num = 30;
}
class �ѱ��� extends �ƽþ���{
	
}																				//extends�� Ȯ���ϴ�!
class �ڼ��� extends �ѱ���{                                 //�̷��� ¥�� ����� ���� - �ڼ����� ���� Ŭ������ ��ӹ���
	int num = 20;
}
public class EveryPerson {
	public static void main(String[] args) {
		�ڼ��� b1 = new �ڼ���();   // new�ϸ� heap������ �ڼ���, �ѱ��� , �ƽþ��� , ����� ��!
		System.out.println(b1.num);// ��� Ŭ������ num = 10�� ������ �ִµ� b1�� num=10�� ������ ��
	
		�ѱ��� b2 = new �ڼ���(); // Ÿ���� �مf���� �ڼ��� ���� �� �߰� ����
		System.out.println(b2.num);
		
		�ڼ��� downB2 = (�ڼ���) b2;
		System.out.println(downB2.num); // �ٿ�ĳ���� ����
		
		��� b3 = new �ѱ���();  // �޸𸮿� ����� ������� �ѱ���Ŭ���� ���� ��ĵ����
		System.out.println(b3.num);
		
	//	�ڼ��� b4 = new �ѱ���();  // �ڼ���Ŭ������ �޸𸮿� ��� ������!
		
	}
}
