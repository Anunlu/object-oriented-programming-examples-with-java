package HW;

public class BMItest {
	public static void main(String[]args) {
		BMI bmi=new BMI();
		BMI c1=new BMI("Sara King",215,70);
		BMI c2=new BMI("Kim Young",18,145,70);
		System.out.println("The BMI for "+bmi.getName()+" "+bmi.getBMI()+" "+bmi.getStatus());
		System.out.println("The BMI for "+c1.getName()+" "+c1.getBMI()+" "+c1.getStatus());
		System.out.println("The BMI for "+c2.getName()+" "+c2.getBMI()+" "+c2.getStatus());

		
	}
}
