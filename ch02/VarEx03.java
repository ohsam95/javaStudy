package ch02;

public class VarEx03 {
	public static void main(String[] args) {
		char s1 = '가'; // 2Byte
		System.out.println(s1);
		
		s1='나';
		System.out.println(s1);

		char c1 ='가';
		char c2 ='나';
		char c3 ='다';
		System.out.println(c1+c2+c3); // +는 결합 연산자 -  (?) 아스키 코드가 나옴..? 나중에
		System.out.print(c1);
		System.out.print(c2);
		System.out.print(c3); // 비효율적임
		
		System.out.println(); //내려쓰기
		
		char[] str = {'가','나','다'}; //배열-연속된 공간에 저장
		System.out.println(str[0]);   // 인덱스는 0부터 시작
		System.out.println(str[1]);
		System.out.println(str[2]);
		//str[3]='라'; //오류
		str[0]='라'; 
		System.out.println(str);
	}
}

