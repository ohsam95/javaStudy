package ch02;
 //heap �ǽ�
class Person{
	String name = "�̵���";
	int age = 26;
	char gender = '��';
	String email = "ohsam95@naver.com";
	String phone = "010-0000-4033";
}

public class VarEx06 {
	public static void main(String[] args) {
		Person a = new Person(); // Person Ÿ��
		System.out.println(a.name);
		System.out.println(a.age);
		System.out.println(a.gender);
		System.out.println(a.email);
		System.out.println(a.phone);
	}
}
