package array03;

import java.util.Random;
import java.util.Scanner;

public class UpDown {

	public static void main(String[] args) {
		System.out.println("���� �����Ͽ����ϴ�. ���߾����.");
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		int k = r.nextInt(100);
		int i = 1;
		while (true) {
			int num = sc.nextInt();

			if (k > num) {
				System.out.println(i + ">>" + num);
				System.out.println("�� ����");
				i++;
			} else if (k < num) {
				System.out.println(i + ">>" + num);
				System.out.println("�� ����");
				i++;
			} else {
				System.out.println("�����Դϴ�.");
				System.out.println("�ٽ��Ͻðڽ��ϱ�? Y or N");
				String check = sc.next();
				if (check.equals("N")) {
					break;
				} else {
					System.out.println("���� �����Ͽ����ϴ�. ���߾����.");
					k = r.nextInt(100);
					i = 1;
				}
			}
		}
	}
}
