package array03;

import java.util.Scanner;

public class Gugudan2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("구구단을 시작합니다.");
		boolean confirm = true;
		while(confirm) {
			System.out.println("숫자를 입력하세요 2~9");
			int num = sc.nextInt();
			
			if (num>9||num<=1) {
				System.out.println("구구단이 아닙니다.");
			} else {
			for(int i=1;i<=9;i++) {	
				System.out.println(num+"X"+i+"="+(num*i));
				}//end of for
			}//end of else
			System.out.println("계속 진행할까요? y or n");
			String check =  sc.next();
			if(check.equals("n")) {   //equals 체크가 n이랑 같은지 확인
			//	break; // 가장 가까운 반복문을 빠져나갈때 사용
				confirm=false;
			}
		}//end of while
		
		System.out.println("구구단 종료");
	}//end of main

}//end of class
