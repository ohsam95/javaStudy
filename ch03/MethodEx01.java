package ch03;

// �޼���(�Լ�)�� �޼���(�Լ�)�ȿ� �ۼ��� �� ����.
public class MethodEx01 {
	
	// ���� ���� �Լ��̱� ������ �޼��� �ۼ� �Ұ�
	// Ŭ���� �ȿ� �ۼ�����
	
	static int add(int n1, int n2 /* �Ű����� */) {            //void�� �������� �ʰڴ�.
		int result = n1 + n2;
		//System.out.println("result : "+result);
		return result; //return�� ���� ��������!!
	}
	static int minus(int n1, int n2) {
		int result = n1-n2;
		return result;
	}
	static int multi(int n1, int n2) {
		int result = n1*n2;
		return result;
	}
	static int divide(int n1, int n2) {
		int result =n1/n2;
		return result;
	}
	
	public static void main(String[] args) {
		int num=Cal.add(5, 3);
		System.out.println("���ϱ� = "+num);
		int num2=Cal.minus(5, 3);
		System.out.println("���� = "+num2);
		int num3=Cal.multi(5, 3);
		System.out.println("���ϱ� = "+num3);
		int num4=Cal.divide(5, 3);
		System.out.println("������ = "+num4);
	}
}
