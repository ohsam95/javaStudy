package array03;

public class Arr {
	
	public static void main(String[] args) {
		//for������ ���� �����
		char arr[] = {'��','��','��','��','��'};
		char arr1[]=new char[5];
		int i = arr1.length-1;
		for (int k = 0; k<=arr1.length-1; k++) {
		arr1[i-k]=arr[k];
		}
		System.out.println(arr1);
	}
}
//�������..