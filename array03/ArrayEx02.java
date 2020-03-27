package array03;

public class ArrayEx02 {
	public static void main(String[] args) {
	
		//for문의 원리 : 
		//초기값은 초기에만 실행 , 조건식은 반복할때마다 검증 , 증감식은 스택이 끝날때 실행
		//초기값 -> 조건식 검증 -> 밑의 실행문 -> 증감식(스택 끝날때) -> 조건식 검증 -> 밑의 실행문 -> 증감식 .... 반복
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
		}
	
	}
}
