package HW;

public class Circle extends GeometricObject implements Colorable{
	  private double radius;

	  public Circle() {
	  }

	  public Circle(double radius) {
	    this.radius = radius;
	  }

	  public double getRadius() {
	    return radius;
	  }

	  public void setRadius(double radius) {
	    this.radius = radius;
	  }

	  @Override 
	  public double getArea() {
	    return radius * radius * Math.PI;
	  }

	  @Override 
	  public double getPerimeter() {
	    return 2 * radius * Math.PI;
	  }
	  
	  @Override
	  public String howToColor() {

		  return "Color All Four Sides.";
	  }

	  @Override
	  public String toString() {
		  return ("[Circle] "+ super.toString() +"\nRadius: "+ getRadius() + "\nArea of Object: " + getArea() + "\nPerimeter of Object: " + getPerimeter()+"\n"+howToColor());
	  }
	
}
