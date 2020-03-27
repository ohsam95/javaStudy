package array03;

import java.util.Scanner;

public class ArrayEx07 {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("6자리 숫자를 입력하세요.");
	int num = sc.nextInt();
	
	String strNum = num+""; //묵시적 형변환 !!!!
	System.out.println(strNum.charAt(0));
	System.out.println(strNum.length());
	boolean check= false;
	
	for (int i = 0; i < strNum.length(); i++) {
		if(strNum.charAt(i)=='3') {
			check=true;
			}
	}
		if(check) {
			System.out.println("3이 있습니다.");
		} else {
			System.out.println("3이 없습니다.");
		}
	}
}

