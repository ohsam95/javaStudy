package ch03;

public class Cal {

	// �޼���(�Լ�)�� �޼���(�Լ�)�ȿ� �ۼ��� �� ����.
		
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
}
