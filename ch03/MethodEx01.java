package ch03;

// 메서드(함수)는 메서드(함수)안에 작성할 수 없다.
public class MethodEx01 {
	
	// 밑은 메인 함수이기 때문에 메서드 작성 불가
	// 클래스 안에 작성가능
	
	static int add(int n1, int n2 /* 매개변수 */) {            //void는 리턴하지 않겠다.
		int result = n1 + n2;
		//System.out.println("result : "+result);
		return result; //return은 가장 마지막에!!
	}
	static int minus(int n1, int n2) {
		int result = n1-n2;
		return result;
	}
	static int multi(int n1, int n2) {
		int result = n1*n2;
		return result;
	}
	static int divide(int n1, int n2) {
		int result =n1/n2;
		return result;
	}
	
	public static void main(String[] args) {
		int num=Cal.add(5, 3);
		System.out.println("더하기 = "+num);
		int num2=Cal.minus(5, 3);
		System.out.println("빼기 = "+num2);
		int num3=Cal.multi(5, 3);
		System.out.println("곱하기 = "+num3);
		int num4=Cal.divide(5, 3);
		System.out.println("나누기 = "+num4);
	}
}
