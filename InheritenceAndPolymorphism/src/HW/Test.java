package HW;
import java.util.Scanner;
public class Test {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		Triangle triang=new Triangle();
		System.out.print("Enter Three Sides: ");
		
		triang.side1=scan.nextDouble();
		triang.side2=scan.nextDouble();
		triang.side3=scan.nextDouble();		
		System.out.print("Enter The Color: ");
		triang.setColor(scan.next());
		System.out.print("Enter a Boolean Value for Filled: ");
		triang.setFilled(scan.nextBoolean());;
		double side1=triang.side1;
		double side2=triang.side2;
		double side3=triang.side3;
		
		System.out.println("TRIANGLE CLASS: Triangle: side1:"+triang.getSide1()+"	side2:"+triang.getSide2()+"	side3:"+triang.getSide3());
		System.out.println("The Area is: "+triang.getArea());
		System.out.println("The Perimeter is: "+triang.getPerimeter());
		System.out.println("GEOMETRIC OBJECT CLASS: created on "+triang.getDate());
		System.out.println("color: "+triang.getColor()+" and filled: "+triang.getFilled());

		
		System.out.println("----------OUTPUT OF POLIMORPHISM EXAMPLE--------------");
		Triangle triangle=new Triangle(side1,side2,side3);
		triangle.color=triang.getColor();
		triangle.filled=triang.getFilled();
		
		System.out.println(triangle.toString());
		
	}

}
