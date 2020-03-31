package ch05;

//�߻�Ŭ������ �Ϲ� �޼��带 ���� �� �ִ�.
//�߻�Ŭ������ ���� ������ �� ���� �޼��带 ������Ʈ���� �̷� �� �ִ�.
//�߻�Ŭ������ abstract�� ���δ�.
//�߻�Ŭ������ ���ؼ� ������ ���� �� �ִ�.
abstract class Food {
	abstract void standby();
	protected void eat() {                                        //protected - �ڽĸ� ��밡��
		System.out.println("������ �Խ��ϴ�.");
	}
	abstract void cook();  //�θ�Ŭ������ �������� ��(�߻����� ��)�� ���´�.

	void auto(){  //�����ؾ��� ���� ��� �Ǽ� ����
		standby();
		cook();
		eat();
	}
}
class ��� extends Food {
	void cook() {
		System.out.println("���� ���δ�.");	
	}
	void standby() {
		System.out.println("���� ������ ���� �غ��մϴ�.");
	}	
	
}
class ���� extends Food{
	void cook() {
		System.out.println("���ǿ� ���´�.");
	}
	void standby() {
		System.out.println("���ǰ� ���� ���ʸ� �غ��մϴ�.");
	}
}

public class FoodEx02 {

	static void start(Food f) {
		f.auto();
	}
	
	public static void main(String[] args) {
		start(new ����());
	}
}
