import java.util.Scanner;

public class BMICalculator {
	public static void main( String[] args ) {
		Scanner keyboard = new Scanner(System.in);
		double m, kg, bmi, inches, pounds, feet, total;
		
		System.out.print( "Your height (feet only): ");
		feet = keyboard.nextDouble();
		
		System.out.print( "Your height (inches): ");
		inches = keyboard.nextDouble();
		
		System.out.print( "Your weight in pounds: ");
		pounds = keyboard.nextDouble();
		
		total = (feet*12)+inches;
		
	    m = total / 39.3700787;
		
		kg = pounds / 2.20462199;
		
		bmi = kg / (m*m);
		
		System.out.println( "Your BMI is " + bmi );
	}
}
	