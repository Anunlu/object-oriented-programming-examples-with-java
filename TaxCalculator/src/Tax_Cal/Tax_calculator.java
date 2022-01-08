package Tax_Cal;
import java.util.*;

public class Tax_calculator {

	public static void main(String[] args)
	{
		Scanner tax = new Scanner(System.in);
		System.out.println("Welcome to Salary Tax Calculator!!! \nEnter age of employee : ");
		int age = tax.nextInt();
		System.out.println("Enter salary of employee : ");
		double salary = tax.nextDouble();
		double salarytax=0;
		
		if (salary<0) {
			System.out.println("Employee earnings cannot be negative!");
		}
		else {
			if ((age>=18) && (age<=35))
			{
				if (salary<17000) {
					salarytax=(0.16*salary);
				}
				else {
					salarytax=(0.16*17000)+(0.25*(salary-17000));
				}
			}
			else if ((age>=36) && (age<=50)) {
				if (salary<23000) {
					salarytax=(0.16*salary);
				}
				else {
					salarytax=(0.16*23000)+(0.25*(salary-23000));
				}
			
			}
			else if ((age>=51) && (age<=74)) {
				if (salary<29000) {
					salarytax=(0.16*salary);
				}
				else {
					salarytax=(0.16*29000)+(0.25*(salary-29000));
				}
			}
			else if ((age>=75) && (age<=95)) {
				if (salary<14000) {
					salarytax=(0.16*salary);
				}
				else {
					salarytax=(0.16*14000)+(0.25*(salary-14000));
				}
			}
			else {
				System.out.println("Undefined Age Range!!!");
			}
		
			System.out.println(salarytax);
		
			}
		}
	
	}
