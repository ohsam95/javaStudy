package array03;

public class ArrayEx04 {

	public static void main(String[] args) {
		//1부터 100까지의 수 중에 3의 배수의 합을 구하시오
		int sum = 0;
		for (int i = 0; i <= 100; i+=3) {
			sum=sum+i;
		}
		System.out.println("sum = "+sum);
	}
}
