package HW;

public class BMI {
	private String name;
	private int age;
	private double weight;
	private double height;
	
	public static final double KILOGRAMS_PER_POUND=0.45359237;
	public static final double CM_PER_INCH =0.0254;
	
	public BMI() {
		name="John BLACK";
		age=25;
		weight=100;
		height=50;
	}
	public BMI(String na,double we,double he) {
		name=na;
		age=20;
		weight=we;
		height=he;
	}
	public BMI(String na,int ag,double we,double he) {
		name=na;
		age=ag;
		weight=we;
		height=he;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public double getWeight() {
		return weight;
	}
	public double getHeight() {
		return height;
	}
	public double getBMI() {
		double weight=getWeight();
		double height=getHeight();
		weight=weight*KILOGRAMS_PER_POUND;
		height=height*CM_PER_INCH;		
		double bmi=weight/(height*height);
		return Math.round(bmi);
	}
	public String getStatus() {

		String str;
		if (getBMI()<18.5) {
			str="Underweight";
		}
		else if (getBMI()<25) {
			str="Normal";
		}
		else if (getBMI()<30) {
			str="Overweight";
		}			
		else {
			str="Obese";
		}
		return str;
	}
	

	
}
