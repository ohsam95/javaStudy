package array03;

import java.util.Scanner;

public class Gugudan2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("�������� �����մϴ�.");
		boolean confirm = true;
		while(confirm) {
			System.out.println("���ڸ� �Է��ϼ��� 2~9");
			int num = sc.nextInt();
			
			if (num>9||num<=1) {
				System.out.println("�������� �ƴմϴ�.");
			} else {
			for(int i=1;i<=9;i++) {	
				System.out.println(num+"X"+i+"="+(num*i));
				}//end of for
			}//end of else
			System.out.println("��� �����ұ��? y or n");
			String check =  sc.next();
			if(check.equals("n")) {   //equals üũ�� n�̶� ������ Ȯ��
			//	break; // ���� ����� �ݺ����� ���������� ���
				confirm=false;
			}
		}//end of while
		
		System.out.println("������ ����");
	}//end of main

}//end of class
