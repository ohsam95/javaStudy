package ch02;

class ����{                                 //Ŭ���� �ڷ��� (Ÿ���� ������)
	static String name = "����";
	String color = "���";
	int speed = 100;
	char geader = '��';
}

public class VarEx05 {
	static int name=10;
	int a = 10; // static�� ������ ������ �ٸ�(�������ų�)
	public static void main(String[] args) {
		System.out.println("���� ���� �غ�");
		//System.out.println(name); //name�� �� ã��
		System.out.println(����.name); // Ŭ����.������ ã�� �� ����
		System.out.println(VarEx05.name); //���� Ŭ������ name�� ������ �ٸ��� ������ ����
		
		//Ŭ�����ڷ��� - ����Ÿ����
		���� a = new ����(); //���� Ŭ������ �ִ� static�� �ƴ� ��� �����Ͱ� �� - heap
		System.out.println(a.color);
	}
}