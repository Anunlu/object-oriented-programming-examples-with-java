package HW;

public class Square extends GeometricObject implements Colorable{

	private double side;
	public Square() {
		
	}
	
	public Square(double side) {
		this.side=side;
	}
	
	public double getSide() {
		return side;
	}
	
	public void setSide(double side) {
		this.side = side;
	}
	
	public double getArea() {
		return side*side;
	}

	@Override 
	public double getPerimeter() {
		return 4 * (side);
	}

	@Override
	public String howToColor() {
		return "Color All Four Sides.";
	}
	
	@Override
	public String toString() {
		return "[Square] "+ super.toString() + "\nSide: " + getSide() + "\nArea of Object: " + getArea() + "\nPerimeter of Object :" + getPerimeter()+"\n"+howToColor();
	}
	

}
