// Notes on mainly string manipulation.
import java.util.Random;
import java.util.Scanner;

public class UniqueIdGenerator {

	public static void main(String[] args) {
		System.out.println("*** Unique ID Generating System ***");
		var console = new Scanner(System.in);
		var random = new Random();
		
		// Get user name
		System.out.println("What is your name?");
		var name = console.nextLine();
		
		// Get user last name
		System.out.println("What is your lastname?");
		var lastName = console.nextLine();
		
		// Get DoB
		System.out.println("What year were your born? (YYYY)");
		var yearOfBirth = console.nextLine();
		
		// Normalize values
		var name2 = name.trim().toUpperCase().substring(0,2);
		var lastName2 = lastName.trim().toUpperCase().substring(0,2);
		var yearOfBirth2 = yearOfBirth.trim().substring(2);

		// Generate random value
		var randomNumber = random.nextInt(9999) + 1;
		
		// Formatting 4 digit value
		var randomNumberFormatted = String.format("%04d", randomNumber);
		
		// Generate unique ID
		var uniqueId = name2 + lastName2 + yearOfBirth2 + randomNumberFormatted;
		System.out.printf("""
				%nHello %s,
				\t Your new ID is:
				\t%s
				\t Congratulations.
				""", name, uniqueId);
		console.close();
	}

}
