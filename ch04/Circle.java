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
		pizza.name="자바피자";
		double area = pizza.getArea();
		System.out.println(pizza.name+"의 면적은 "+ area);
		
		Circle dount = new Circle();
		dount.radous=2;
		dount.name="자바도넛";
		area = dount.getArea();
		System.out.println(dount.name+"의 면적은 "+area);
	}
}
