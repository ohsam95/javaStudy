package ch05;

//�߻�Ŭ������ ������� �뵵�� ��� �����ϴ�.
abstract class Į{
	abstract void kill();
	abstract void cook();
	abstract void repair();
}

abstract class �丮������ extends Į{  //������� ���� ���� ���⿡ �����س����鼭 å���� ������ �� (�ɷ����� ��)
	void kill() {
	}
	void repair() {
	}
}

class ������ extends �丮������ {
	void cook() {
		
	}
	
}
public class FoodEx03 {

}
