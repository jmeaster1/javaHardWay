public class CreatingVariables {
	public static void main (String [] args ){
		int x, y, age, year;
		double seconds, e, checking, scale;
		String firstName, lastName, title, city, state;
		
		x = 10;
		y = 400;
		age = 39;
		year = 1986;
		
		seconds = 4.71;
		e = 2.71828182845904523536;
		checking = 1.89;
		scale = 6.5;
		
		firstName = "Jimmy";
		lastName = "Easter";
		title = "Mr."; 
		city = "Charleston";
		state = "West Virginia";
		
		System.out.println( "The variable x contains " + x);
		System.out.println( "The value " + y + " is stored in the variable y.");
		System.out.println( "I was born in the year " + year + "." );
		System.out.println( "The experiment took " + seconds + " seconds." );
		System.out.println( "The earthquake registered " + scale + " on the Richter Scale!" );
		System.out.println( "A favorite irrational # is Euler's number: " + e );
		System.out.println( "Hopefully you have more than $" + checking + "!" );
		System.out.println( "My name's " + title + " " + firstName + " " + lastName );
		System.out.println( "I am from " + city + ", " + state + "." );
	}
}