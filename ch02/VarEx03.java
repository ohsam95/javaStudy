package ch02;

public class VarEx03 {
	public static void main(String[] args) {
		char s1 = '��'; // 2Byte
		System.out.println(s1);
		
		s1='��';
		System.out.println(s1);

		char c1 ='��';
		char c2 ='��';
		char c3 ='��';
		System.out.println(c1+c2+c3); // +�� ���� ������ -  (?) �ƽ�Ű �ڵ尡 ����..? ���߿�
		System.out.print(c1);
		System.out.print(c2);
		System.out.print(c3); // ��ȿ������
		
		System.out.println(); //��������
		
		char[] str = {'��','��','��'}; //�迭-���ӵ� ������ ����
		System.out.println(str[0]);   // �ε����� 0���� ����
		System.out.println(str[1]);
		System.out.println(str[2]);
		//str[3]='��'; //����
		str[0]='��'; 
		System.out.println(str);
	}
}

