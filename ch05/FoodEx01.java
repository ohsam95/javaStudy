package ch05;

abstract class Food1{     //�߻�Ŭ������ new �� �� ����. ������Ʈ�� �ƴϱ� ������!!
	abstract void eat();  //�߻�Ŭ������ �߻� �޼��带 ���� �� �ִ�.
}

class ���1 extends Food1 {
	final String NAME = "���";   
	void eat() {
		System.out.println(NAME+"�� �Ծ����ϴ�.");
		
	}
}

class �Ұ��1 extends Food1{
	final String NAME = "�Ұ��";
	void eat() {
		System.out.println(NAME+"�� �Ծ����ϴ�.");
	}
}

class ����1 extends Food1{
	final String NAME = "����";
	void eat() {
		System.out.println(NAME+"�� �Ծ����ϴ�.");
	}
}

public class FoodEx01 {

		static void start(Food1 f) {
			f.eat();
		}
	
	public static void main(String[] args) {
		start(new ���1());
		start(new �Ұ��1());
		start(new ����1());
		
	}
}
