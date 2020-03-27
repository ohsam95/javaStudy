package ch04;

// 상태와 행
public class Person {
	String name;
	String job;
	int age;
	char gender;
	String bloodType;
	
	//디폴트 생성자(매개변수가 없는 아이) = 초기화 용도
	public Person() {
	
				//함수이름이 똑같은데 오류가 안나는 이유 - 오버로딩(매개변수가 달라서)
	}
	
	//오버로딩
	public Person(String name, String job, int age, char gender, String bloodType) {
		this.name = name;
		this.job = job;
		this.age = age;
		this.gender = gender;
		this.bloodType = bloodType;
	}


}



