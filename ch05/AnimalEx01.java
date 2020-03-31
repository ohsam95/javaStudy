package ch05;
abstract class Animal {               //abstract - 추상클래스(new를 하지 못함)
	abstract String getName();
	}

class Dog extends Animal {
	final String NAME = "강아지";
	@Override
	String getName() {
		return NAME;
	}
}
class Cat extends Animal {
	final String NAME = "고양이";
	@Override
	String getName() {
		return NAME;
	}	
}
class Bird extends Animal {
	final String NAME = "새";
	@Override
	String getName() {
		return NAME;
	}
}
public class AnimalEx01 {                                                                            
	static void attack(Animal u1, Animal u2) {	
		System.out.println(u2.getName()+"가 "+u1.getName()+"에게 공격 당했습니다.");
	}
	public static void main(String[] args) {
		Dog d1 = new Dog();
		Cat c1 = new Cat();
		Bird b1 = new Bird();

	
		System.out.println(d1.NAME+" 탄생");
		System.out.println(c1.NAME+" 탄생");
		System.out.println(b1.NAME+" 탄생");
		
		attack(d1, c1);
		attack(d1, d1);
	}
}
