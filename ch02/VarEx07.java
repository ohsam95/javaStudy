package ch02;

/** 
 * 
 * @author 코스
 * 변수 설명하기
 */

public class VarEx07 {
	public static void main(String[] args) {
		Object n1 = 1;
		Object n2 = '가';
		Object n3 = "문자열";
		Object n4 = 10.5;
		// 장점 : 뭘 넣어도 됨  
		// 단점 : 협업 시 어떤 자료를 넣어야하는지 모름
		System.out.println(n1);
		System.out.println(n2);
		System.out.println(n3);
		System.out.println(n4);
	}
}
