package ch01;

import java.util.Scanner;

//���� 2-13
public class NesredIf {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
				
		System.out.println("������ �Է��ϼ��� (0~100) : ");
		int score = scanner.nextInt(); //���� �Է� �ޱ�
		System.out.println("�г��� �Է��ϼ��� (1~4) : ");
		int year = scanner.nextInt(); // �г� �Է� �ޱ�

		if(score>=60) {
			if(year!=4) {
				System.out.println("�հ��Դϴ�.");
			} else if(score>=70 && year==4) {
				System.out.println("�հ��Դϴ�.");
			} else {
				System.out.println("���հ��Դϴ�.");
			}
		}else {
			System.out.println("���հ��Դϴ�.");
		}
		
	}
}
