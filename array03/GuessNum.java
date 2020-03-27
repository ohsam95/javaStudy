package array03;

public class GuessNum {
	public static void main(String[] args) {
		int[] arr = new int[3]; // 배열 특징 - 크기가 정해져있어야한다.
		arr[0]=1;
		arr[1]=2;
		arr[2]=3;
		
		try {
			for (int i = 0; i < 4; i++) {
				System.out.print(arr[i]+" ");
				}
			} catch (Exception e) {
			System.out.println("배열의 크기를 넘었습니다.");
		}
		
		
	}
}
