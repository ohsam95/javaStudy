package ch04;

public class Circle {
	private int radous;
	private String name;

	
	public void setRadous(int radous) {
		this.radous = radous;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Circle() {}
	
	public double getArea() {
		return 3.14*radous*radous;
	}
	public static void main(String[] args) {
		Circle pizza = new Circle();
		pizza.radous=10;
		pizza.name="�ڹ�����";
		double area = pizza.getArea();
		System.out.println(pizza.name+"�� ������ "+ area);
		
		Circle dount = new Circle();
		dount.radous=2;
		dount.name="�ڹٵ���";
		area = dount.getArea();
		System.out.println(dount.name+"�� ������ "+area);
	}
}
