package array03;

import java.util.Scanner;

public class Seeba {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		String tempNum = num+""; //묵시적 형변환
		String tempNum2[] = tempNum.split("");
		System.out.println(tempNum2[0]);
		System.out.println("길이 = "+ tempNum2.length);
	
	int p = (tempNum2.length % 3);
	for (int i = 0; i < tempNum2.length; i++) {
		if(i==0) {
			tempNum2[i]=""+tempNum2[i];
		}else if (i%3==p) {
				tempNum2[i]=","+tempNum2[i];
			}
				System.out.print(tempNum2[i]);
		}
	}
}

