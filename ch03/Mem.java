package ch03;

public class Mem {
	
	int num = 10;
	static String name ="홍길동";
	
	void test() { // {}내부는 호출 전까지 메모리에 안 뜸 , heap이 관리
		int num = 5;       //공간이 다름	
	} // {}안은 stack이라함 , 중괄호가 끝나면 stack영역이 메모리에서 날라감 (리턴하지 않으면 소멸)
	       // stack영역은 지역변수임
	public static void main(String[] args) {
		int sum = 100;
		System.out.println("sum = "+sum);
		Mem m = new Mem();  //heap 생성 - 계속 메모리에 떠 있음 (전역변수)
		m.test();
		System.out.println("번호 = "+m.num); // 컴퓨터가 이 이후 더이상 heap영역을 참조하지 않다는 것을 알아서
		System.out.println(1);                                        //heap 영역을 메모리에서 날림
		System.out.println(2);
		System.out.println("프로그램 종료");
	} //static 영역 종료
}
