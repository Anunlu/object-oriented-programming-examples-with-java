package HW;

public class Triangle extends GeometricObject {
	double side1=1.0;
	double side2=1.0;
	double side3=1.0;
	public Triangle() {
		
	}
	public Triangle(double side1,double side2,double side3) {
		this.side1=side1;
		this.side2=side2;
		this.side3=side3;
	}
	public double getSide1() {
		return side1;
	}
	public double getSide2() {
		return side2;
	}
	public double getSide3() {
		return side3;
	}
	public double getArea() {
		double s,area;
		s=(getPerimeter())/2;
		area=Math.pow((s*(s-side1)*(s-side2)*(s-side3)), 0.5);
		return area;
	}
	public double getPerimeter() {
		return side1+side2+side3;
	}
	public String toString() {
		return String.format("TRIANGLE CLASS: Triangle: side1:"+getSide1()+"		side2:"+getSide2()+"	side3:"+getSide3()+"\nThe Area is: "+getArea()+"\nThe Perimeter is: "+getPerimeter()+"\n"+super.toString());
		
	}
}
