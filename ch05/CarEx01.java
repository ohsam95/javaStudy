package ch05;

class Car {
	void run() {
		System.out.println("�⺻ ������");
	}
}

class Sonata extends Car {   
	@Override// ������ ��  //�������̵� - ��ȿȭ��Ű�� (CarŬ������ run�޼ҵ带 ��ȿȭ�ϰٴ�) // ���� �ÿ� ����
	void run() {		
		  //super - �θ��� �� ����   //this - �ڱ��ڽ��� �� ����
		System.out.println("�ҳ�Ÿ���� ������");
	}
}
public class CarEx01 {

	public static void main(String[] args) {
		Car s1 = new Sonata();  // -> �޸𸮿� �ΰ� �� ������ Car�� �ٶ󺸰�����
		s1.run();
	}
}
