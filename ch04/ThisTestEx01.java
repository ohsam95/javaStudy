package ch04;

class AirPlane{
	String name;
	String color;
	
	public AirPlane(String name, String color) {
		this.name = name;
		this.color = color;   //this�� heap�� ����Ŵ, �������� ���δ� new�� �� ����
	}
}


public class ThisTestEx01 {

	public static void main(String[] args) {
		AirPlane a1 = new AirPlane("��Ʈ��","�Ͼ��");
	}
}
