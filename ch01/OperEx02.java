package ch01;

public class OperEx02 {
	public static void main(String[] args) {
		int sum = 0;  //선언만 하면 값이 0이 들어가있음
		int distance = 100;
		int move = 20;
		
		sum = sum + move;
		System.out.println(sum);
		
		sum = sum + move;
		System.out.println(sum);
		
		sum = sum + move;
		System.out.println(sum);
		
		sum = sum + move;
		System.out.println(sum);

		sum = sum + move;
		System.out.println("움직인 거리 "+sum); // 결합(문자로 묵시적 형변환 됨)
		System.out.println("도착지 "+distance);
		
	}
}
