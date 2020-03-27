package ch02;

class 동물{                                 //클래스 자료형 (타입은 동물임)
	static String name = "사자";
	String color = "노랑";
	int speed = 100;
	char geader = '여';
}

public class VarEx05 {
	static int name=10;
	int a = 10; // static의 변수와 색깔이 다름(기울어지거나)
	public static void main(String[] args) {
		System.out.println("동물 생성 준비");
		//System.out.println(name); //name을 못 찾음
		System.out.println(동물.name); // 클래스.변수로 찾을 수 있음
		System.out.println(VarEx05.name); //동물 클래스의 name과 공간이 다르기 때문에 괜찮
		
		//클래스자료형 - 동물타입임
		동물 a = new 동물(); //동물 클래스에 있는 static이 아닌 모든 데이터가 뜸 - heap
		System.out.println(a.color);
	}
}