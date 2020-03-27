package array03;

import java.util.Scanner; //다른사람이 만든거 사용할 때 import 사용

public class ArrayEx06 {

	public static void main(String[] args) {
		//숫자 1000000000을 입력받고 (10억) 3자리마다 콤마를 찍어서 출력 1,000,000,000
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		String tempNum = num+""; //묵시적 형변환
		String tempNum2[] = tempNum.split("");
		System.out.println(tempNum2[0]);
		System.out.println("길이 = "+ tempNum2.length);
		
		for (int i = 0; i < tempNum2.length; i++) {    
			if((tempNum2.length-i)%3==0 && i!=0) {
			System.out.print(",");
			}
			System.out.print(tempNum2[i]);
			}
	
	}
}


		
