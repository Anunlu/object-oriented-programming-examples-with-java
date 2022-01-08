import java.util.*;
public class BMI {
	
	public static double calculateBMI(double weight,double height) {
		double kg,cm,bmi;
		kg=weight*(0.45359237);
		cm=height*(0.0254);
		bmi=kg/(cm*cm);
		return bmi;
	}
	
	public static String interpretBMI(double bmi) {
		String str;
		if (bmi<18.5) {
			str="Underweight";
		}
		else if (bmi<25) {
			str="Normal";
		}
		else if (bmi<30) {
			str="Overweight";
		}			
		else {
			str="Obese";
		}
		return str;
		
	}

}
