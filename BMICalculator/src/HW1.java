import java.util.Scanner;
public class HW1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan= new Scanner(System.in);
		System.out.println("----------MENU----------");
		System.out.println("1-	Calculate BMI\n2-	Quit");
		System.out.println("------------------------");
		System.out.println("Your option?");
		int option= scan.nextInt();
		if (option==1) {
			System.out.print("Enter Weight in Pounds: ");
			double weight = scan.nextDouble();
			System.out.print("Enter Height in Inches: ");
			double height = scan.nextDouble();
			double kg,cm,bmi;
			kg=weight*(0.45359237);
			cm=height*(0.0254);
			bmi=kg/(cm*cm);
			System.out.println("BMI is " + bmi);
			if (bmi<18.5) {
				System.out.print("Underweight");
			}
			else if (bmi<25) {
				System.out.print("Normal");
			}
			else if (bmi<30) {
				System.out.print("Overweight");
			}			
			else {
				System.out.print("Obese");
			}
		}
		else {
			System.out.println("Hava a Good Day Mr/Ms...");
		}
		
	}

}
