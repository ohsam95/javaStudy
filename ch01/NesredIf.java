package ch01;

import java.util.Scanner;

//예제 2-13
public class NesredIf {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
				
		System.out.println("점수를 입력하세요 (0~100) : ");
		int score = scanner.nextInt(); //점수 입력 받기
		System.out.println("학년을 입력하세요 (1~4) : ");
		int year = scanner.nextInt(); // 학년 입력 받기

		if(score>=60) {
			if(year!=4) {
				System.out.println("합격입니다.");
			} else if(score>=70 && year==4) {
				System.out.println("합격입니다.");
			} else {
				System.out.println("불합격입니다.");
			}
		}else {
			System.out.println("불합격입니다.");
		}
		
	}
}
