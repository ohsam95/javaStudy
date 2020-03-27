package array03;

import java.util.Random;
import java.util.Scanner;

public class UpDown {

	public static void main(String[] args) {
		System.out.println("수를 결정하였습니다. 맞추어보세요.");
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		int k = r.nextInt(100);
		int i = 1;
		while (true) {
			int num = sc.nextInt();

			if (k > num) {
				System.out.println(i + ">>" + num);
				System.out.println("더 높게");
				i++;
			} else if (k < num) {
				System.out.println(i + ">>" + num);
				System.out.println("더 낮게");
				i++;
			} else {
				System.out.println("정답입니다.");
				System.out.println("다시하시겠습니까? Y or N");
				String check = sc.next();
				if (check.equals("N")) {
					break;
				} else {
					System.out.println("수를 결정하였습니다. 맞추어보세요.");
					k = r.nextInt(100);
					i = 1;
				}
			}
		}
	}
}
