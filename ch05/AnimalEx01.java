package ch05;
abstract class Animal {               //abstract - �߻�Ŭ����(new�� ���� ����)
	abstract String getName();
	}

class Dog extends Animal {
	final String NAME = "������";
	@Override
	String getName() {
		return NAME;
	}
}
class Cat extends Animal {
	final String NAME = "�����";
	@Override
	String getName() {
		return NAME;
	}	
}
class Bird extends Animal {
	final String NAME = "��";
	@Override
	String getName() {
		return NAME;
	}
}
public class AnimalEx01 {                                                                            
	static void attack(Animal u1, Animal u2) {	
		System.out.println(u2.getName()+"�� "+u1.getName()+"���� ���� ���߽��ϴ�.");
	}
	public static void main(String[] args) {
		Dog d1 = new Dog();
		Cat c1 = new Cat();
		Bird b1 = new Bird();

	
		System.out.println(d1.NAME+" ź��");
		System.out.println(c1.NAME+" ź��");
		System.out.println(b1.NAME+" ź��");
		
		attack(d1, c1);
		attack(d1, d1);
	}
}
