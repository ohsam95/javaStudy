package ch04;

// ���¿� ��
public class Person {
	String name;
	String job;
	int age;
	char gender;
	String bloodType;
	
	//����Ʈ ������(�Ű������� ���� ����) = �ʱ�ȭ �뵵
	public Person() {
	
				//�Լ��̸��� �Ȱ����� ������ �ȳ��� ���� - �����ε�(�Ű������� �޶�)
	}
	
	//�����ε�
	public Person(String name, String job, int age, char gender, String bloodType) {
		this.name = name;
		this.job = job;
		this.age = age;
		this.gender = gender;
		this.bloodType = bloodType;
	}


}



