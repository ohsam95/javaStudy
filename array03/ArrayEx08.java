package array03;

import java.util.Scanner;

public class ArrayEx08 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		
		for (int i = a.charAt(0)+1; i <=(int)'Z'  ; i++) {
			System.out.print((char)i);
				
			
		}
	}
}
