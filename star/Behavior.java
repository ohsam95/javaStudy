package star;

//�߻�Ŭ������ ����
//�߻� �޼��常 ���簡�� (��ü�� �ִ� �޼���� �� ����) -> ���� ���ε��� ��η� ����
public interface Behavior { 
	public abstract void move(); //abstract �������� , public ��������
	void repair();
	void attack(Behavior unit); 
	//������ƽ�� ����!
}
