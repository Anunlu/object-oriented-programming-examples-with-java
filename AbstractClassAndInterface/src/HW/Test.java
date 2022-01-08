package HW;

public class Test {

	public static void main(String[] args) {
		GeometricObject[] geometricObject=new GeometricObject[5];
		geometricObject[0] =new Square(2.0);
		geometricObject[1] =new Circle(5.0);
		geometricObject[2] =new Square(5.0);
		geometricObject[3] =new Rectangle(3.0,4.0);
		geometricObject[4] =new Square(4.5);
		
		System.out.println(geometricObject[0].toString());
		System.out.println(geometricObject[1].toString());
		System.out.println(geometricObject[2].toString());
		System.out.println(geometricObject[3].toString());
		System.out.println(geometricObject[4].toString());

		
	}

}
