package array03;

import java.util.Scanner; //�ٸ������ ����� ����� �� import ���

public class ArrayEx06 {

	public static void main(String[] args) {
		//���� 1000000000�� �Է¹ް� (10��) 3�ڸ����� �޸��� �� ��� 1,000,000,000
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		String tempNum = num+""; //������ ����ȯ
		String tempNum2[] = tempNum.split("");
		System.out.println(tempNum2[0]);
		System.out.println("���� = "+ tempNum2.length);
		
		for (int i = 0; i < tempNum2.length; i++) {    
			if((tempNum2.length-i)%3==0 && i!=0) {
			System.out.print(",");
			}
			System.out.print(tempNum2[i]);
			}
	
	}
}


		
