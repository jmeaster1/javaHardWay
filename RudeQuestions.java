import java.util.Scanner;

public class RudeQuestions {
	public static void main( String[] args ) {
		String name, middle;
		int age;
		double weight, income;
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print( "Hello. What is your name? " ); //String accepts any character without blowing up
		name= keyboard.next();
		
		System.out.print( "What is your middle name? " );
		middle = keyboard.next();
		
		System.out.println( middle + " is a wonderful middle name! ");
		
		System.out.print( "Hi, " + name + "! How old are you? " ); //Entering letters makes the program blow up as an integer is expected
		age = keyboard.nextInt();
		
		System.out.println( "So you're " + age + ", eh? That's not very old." ); //Entering letters causes same error as above example
		System.out.print( "How much do you weigh, " + name + " ? ");
		weight = keyboard.nextDouble();
		
		System.out.println( weight + "! Better keep that quiet!" );
		System.out.print( "Fianlly, what's your income, " + name + " ?"); //same as above
		income = keyboard.nextDouble();
		
		System.out.print( "Hopefully that is " + income + " per hour" );
		System.out.println( " and not per year!") ;
		System.out.print( "Well, thanks for answering my rude questions, ");
		System.out.println( name + ".");
		
		//The program does not blow up when I enter an integer when a double is expected. I assume this is because
		//the decimal is understood. i.e. 5 is understood as 5.0
		
		//The program does not blow up when a numeric value is entered where a String is expected. I assume this is
		//because a String is any string of characters, numbers included.
	}
}
		
		
		