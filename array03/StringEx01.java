package array03;

public class StringEx01 {

	public static void main(String[] args) {
		String s1 = new String("����");
		String s2 = new String("����");
		System.out.println(s1==s2);  //false �� ���� - �ٸ� ������ �����Ǽ� �ٸ� �ּҸ� ������ ����

		String s3="����";
		String s4="����";
		System.out.println(s3==s4);  // ���� �ּҸ� ����

		System.out.println(s1==s4); // �ٸ� �ּҸ� ������ ������ false
		
		System.out.println(s1.equals(s4)); //equals ���� �ּҰ����� ���� ���� ������ ��
	}
	
}