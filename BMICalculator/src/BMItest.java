import java.util.Scanner;

public class BMItest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BMI test= new BMI();
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter weight in pounds: ");
		double weight=scan.nextDouble();
		System.out.print("Enter height in inches: ");
		double height=scan.nextDouble();
		System.out.println("BMI is "+BMI.calculateBMI(weight,height));
		double bmi = BMI.calculateBMI(weight,height);
		System.out.println(BMI.interpretBMI(bmi));
		
		
	}

}
